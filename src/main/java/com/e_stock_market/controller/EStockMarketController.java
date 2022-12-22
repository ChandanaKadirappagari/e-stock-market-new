package com.e_stock_market.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_stock_market.model.Company;
import com.e_stock_market.model.CompanyStock;
import com.e_stock_market.service.EStockServiceImpl;

//@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1.0/market")
public class EStockMarketController {

	@Autowired
	private EStockServiceImpl eStockService;

	@GetMapping("/company/getall")
	//@PreAuthorize("hasAuthority('APPROLE_Admin')")
	public List<Company> getAllCompanies() {
		return eStockService.getAllCompanies();
	}

	/*
	 * @GetMapping("/company/info/{companyCode}") private Company
	 * getCompanyById(@PathVariable("companyCode") int companyCode) { Company
	 * company = new Company(); company = eStockService.getCompanyById(companyCode);
	 * return company;
	 * 
	 * }
	 * 
	 * @DeleteMapping("/company/delete/{companyCode}") private void
	 * deleteCompany(@PathVariable("companyCode") int companyCode) {
	 * eStockService.delete(companyCode); }
	 */

	@PostMapping("/company/register")
	public Company addCompany(@RequestBody Company company) {
		Company comp = eStockService.saveCompany(company);
		return comp;

	}

	/*
	 * @PostMapping("/stock/add/{companyCode}") private String
	 * updateCompany(@PathVariable("companyCode") int companyCode,@RequestBody
	 * CompanyStock stock) { String msg = null; boolean isUpdated = false;
	 * stock.setStockPriceUpdatedDt(LocalDate.now()); DateTimeFormatter dtf =
	 * DateTimeFormatter.ofPattern("HH:mm:ss"); LocalTime localTime =
	 * LocalTime.now(); stock.setStockPriceUpdatedTs(dtf.format(localTime));
	 * stock.setCompanyCode(companyCode);
	 * isUpdated=eStockService.updateCompany(companyCode,stock); if(isUpdated) { msg
	 * = "Stock price updated successfully"; }else { msg =
	 * "Failed to update stock price"; } return msg; }
	 * 
	 * 
	 * @GetMapping("/stock/get/{companyCode}/{startdate}/{enddate}") private
	 * List<CompanyStock> getAllCompanyStocks(@PathVariable("companyCode") int
	 * companyCode,@PathVariable("startdate") @DateTimeFormat(pattern =
	 * "yyyy-MM-dd") LocalDate startdate,
	 * 
	 * @PathVariable("enddate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate
	 * enddate) { List<CompanyStock> estockList =
	 * eStockService.getAllCompanyStocks(companyCode,startdate, enddate); return
	 * estockList; }
	 */
}
