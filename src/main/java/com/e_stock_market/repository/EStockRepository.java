package com.e_stock_market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_stock_market.model.Company;

public interface EStockRepository extends JpaRepository<Company, Integer> { 
	
}
