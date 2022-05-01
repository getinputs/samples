package com.builder;

public class PayoutDetails {
	
	String payerFirstName;
	
	String payerLastName;
	
	String payerAddressLine;
	
	String payerCity;
	
	String payerCountry;
	
    String beneficiaryFirstName;
	
	String beneficiaryLastName;
	
	String beneficiaryAddressLine;
	
	String beneficiaryCity;
	
	String beneficiaryCountry;
	
	double transferAmount;
	
	String currency;

	public PayoutDetails(String payerFirstName, String payerLastName, String payerAddressLine, String payerCity,
			String payerCountry, String beneficiaryFirstName, String beneficiaryLastName, String beneficiaryAddressLine,
			String beneficiaryCity, String beneficiaryCountry, double transferAmount, String currency) {
		super();
		this.payerFirstName = payerFirstName;
		this.payerLastName = payerLastName;
		this.payerAddressLine = payerAddressLine;
		this.payerCity = payerCity;
		this.payerCountry = payerCountry;
		this.beneficiaryFirstName = beneficiaryFirstName;
		this.beneficiaryLastName = beneficiaryLastName;
		this.beneficiaryAddressLine = beneficiaryAddressLine;
		this.beneficiaryCity = beneficiaryCity;
		this.beneficiaryCountry = beneficiaryCountry;
		this.transferAmount = transferAmount;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "PayoutDetails [payerFirstName=" + payerFirstName + ", payerLastName=" + payerLastName
				+ ", payerAddressLine=" + payerAddressLine + ", payerCity=" + payerCity + ", payerCountry="
				+ payerCountry + ", beneficiaryFirstName=" + beneficiaryFirstName + ", beneficiaryLastName="
				+ beneficiaryLastName + ", beneficiaryAddressLine=" + beneficiaryAddressLine + ", beneficiaryCity="
				+ beneficiaryCity + ", beneficiaryCountry=" + beneficiaryCountry + ", transferAmount=" + transferAmount
				+ ", currency=" + currency + "]";
	}
}
