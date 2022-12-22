package com.e_stock_market.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_stock_market.model.Company;
import com.e_stock_market.repository.CompanyStockRepository;
import com.e_stock_market.repository.EStockRepository;

@Service
@Transactional
public class EStockServiceImpl implements EStockService {

	@Autowired
	private EStockRepository eStockRepository;

	@Autowired
	private CompanyStockRepository companyStockRepository;
	
	
	// Get all companies
		public List<Company> getAllCompanies() {
			List<Company> allCompanies = eStockRepository.findAll();
			return allCompanies;

		}

	/*
	 * // Get all companies public List<Company> getAllCompanies() { List<Company>
	 * allCompanies = new ArrayList<Company>(); List<Company> CompanyList = new
	 * ArrayList<Company>(); eStockRepository.findAll().forEach(company1 ->
	 * allCompanies.add(company1)); for (Company comp : allCompanies) {
	 * List<CompanyStock> allStocks = new ArrayList<CompanyStock>();
	 * List<CompanyStock> getStockList = new ArrayList<CompanyStock>();
	 * companyStockRepository.findAll().forEach(stock -> allStocks.add(stock)); for
	 * (CompanyStock cs : allStocks) { if (cs.getCompanyCode() ==
	 * comp.getCompanyCode()) { CompanyStock stc =
	 * companyStockRepository.findById(cs.getStockCode()).get();
	 * getStockList.add(stc); }
	 * 
	 * } //comp.setCompanyStockList(getStockList); CompanyList.add(comp); }
	 * 
	 * return CompanyList;
	 * 
	 * }
	 */
	/*
	 * // Get company by id public Company getCompanyById(int id) { Company company
	 * = new Company(); company =
	 * eStockRepository.findById(id).isPresent()?eStockRepository.findById(id).get()
	 * :null; if(company != null) { List<CompanyStock> allStocks = new
	 * ArrayList<CompanyStock>(); List<CompanyStock> StockList = new
	 * ArrayList<CompanyStock>(); companyStockRepository.findAll().forEach(stock ->
	 * allStocks.add(stock)); for (CompanyStock cs : allStocks) { if
	 * (cs.getCompanyCode() == company.getCompanyCode()) { CompanyStock stc =
	 * companyStockRepository.findById(cs.getStockCode()).get(); StockList.add(stc);
	 * }
	 * 
	 * } //company.setCompanyStockList(StockList); } return company;
	 * 
	 * }
	 */
	// Add new company
	public Company addCompany(Company eStock) {
		return eStockRepository.save(eStock);
	}

	/*
	 * // Delete company and its stocks public void delete(int id) {
	 * List<CompanyStock> StockList = new ArrayList<CompanyStock>();
	 * companyStockRepository.findAll().forEach(stock -> StockList.add(stock)); for
	 * (CompanyStock cs : StockList) { if (cs.getCompanyCode() == id) {
	 * companyStockRepository.deleteById(cs.getStockCode()); } }
	 * eStockRepository.deleteById(id); }
	 */
	/*
	 * // Update company stock prices public boolean updateCompany(int companyCode,
	 * CompanyStock eStock) { boolean isUpdated = false; List<Company> allCompanies
	 * = new ArrayList<Company>(); eStockRepository.findAll().forEach(company1 ->
	 * allCompanies.add(company1)); for (Company company : allCompanies) { if
	 * (company.getCompanyCode() == companyCode) {
	 * companyStockRepository.save(eStock); isUpdated = true; } } return isUpdated;
	 * 
	 * }
	 */

	/*
	 * public List<CompanyStock> getAllCompanyStocks(int companyCode, LocalDate
	 * startDate, LocalDate endDate) { List<CompanyStock> allStocks = new
	 * ArrayList<CompanyStock>(); List<CompanyStock> fetchedStocks = new
	 * ArrayList<CompanyStock>(); List<CompanyStock> fetchedStocksByDate = new
	 * ArrayList<CompanyStock>(); companyStockRepository.findAll().forEach(stock1 ->
	 * allStocks.add(stock1)); for (CompanyStock cs : allStocks) { if
	 * (cs.getCompanyCode() == companyCode) { { fetchedStocks.add(cs); } } } for
	 * (CompanyStock cs1 : fetchedStocks) { if
	 * ((cs1.getStockPriceUpdatedDt().isEqual(startDate) ||
	 * cs1.getStockPriceUpdatedDt().isAfter(startDate)) &&
	 * (cs1.getStockPriceUpdatedDt().isEqual(endDate) ||
	 * cs1.getStockPriceUpdatedDt().isBefore(endDate))) {
	 * fetchedStocksByDate.add(cs1);
	 * 
	 * } }
	 * 
	 * return fetchedStocksByDate; }
	 */

	// public void deleteStockPrice(int companyCode) {
	// eStockRepository.deleteById(companyCode);
	// }

	@Override
	public Company saveCompany(Company company) {
		company = eStockRepository.save(company);
		return company;
	}

}
