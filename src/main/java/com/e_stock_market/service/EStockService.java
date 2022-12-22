package com.e_stock_market.service;

import org.springframework.stereotype.Component;

import com.e_stock_market.model.Company;

@Component
public interface EStockService {
	public Company saveCompany(Company company);
	//public Company findByCompanyCode(int companyCode);

}
