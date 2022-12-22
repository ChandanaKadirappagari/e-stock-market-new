package com.e_stock_market.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	// Defining company Code as primary key
	@Id
	@GeneratedValue
	private int companyCode;
	private String companyName;
	private String companyCEO;
	private String companyWebSite;
	private long companyTurnOver;
	private String stockExchange;
	/*
	 * 
	 * @OneToMany(fetch = FetchType.EAGER, mappedBy = "company", cascade =
	 * CascadeType.ALL)
	 * 
	 * @JsonIgnoreProperties("company") private List<CompanyStock> companyStockList
	 * = new ArrayList<>();
	 * 
	 * 
	 * 
	 * 
	 * public int getCompanyCode() { return companyCode; } public void
	 * setCompanyCode(int companyCode) { this.companyCode = companyCode; } public
	 * String getCompanyName() { return companyName; } public void
	 * setCompanyName(String companyName) { this.companyName = companyName; } public
	 * String getCompanyCEO() { return companyCEO; } public void
	 * setCompanyCEO(String companyCEO) { this.companyCEO = companyCEO; }
	 * 
	 * public String getCompanyWebSite() { return companyWebSite; } public void
	 * setCompanyWebSite(String companyWebSite) { this.companyWebSite =
	 * companyWebSite; } public long getCompanyTurnOver() { return companyTurnOver;
	 * } public void setCompanyTurnOver(long companyTurnOver) { this.companyTurnOver
	 * = companyTurnOver; } public String getStockExchange() { return stockExchange;
	 * } public void setStockExchange(String stockExchange) { this.stockExchange =
	 * stockExchange; }
	 * 
	 * public List<CompanyStock> getCompanyStockList() { return companyStockList; }
	 * public void setCompanyStockList(List<CompanyStock> companyStockList) {
	 * this.companyStockList = companyStockList; }
	 */

}
