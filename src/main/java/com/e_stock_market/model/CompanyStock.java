package com.e_stock_market.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company_stock")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyStock {

	@Id
	@GeneratedValue
	private int stockCode;
	private int companyCode;
	private float stockPrice;
	private LocalDate stockPriceUpdatedDt;
	private String stockPriceUpdatedTs;
	/*
	 * @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "COMPANY_CODE", referencedColumnName = "companyCode")
	 * private Company company;
	 */

}
