package com.builder;

public class PayoutDetailsBuilder {
	
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
	
	public PayoutDetailsBuilder setPayerFirstName(String payerFirstName) {
		this.payerFirstName = payerFirstName;
		return this;
	}

	public PayoutDetailsBuilder setPayerLastName(String payerLastName) {
		this.payerLastName = payerLastName;
		return this;
	}

	public PayoutDetailsBuilder setPayerAddressLine(String payerAddressLine) {
		this.payerAddressLine = payerAddressLine;
		return this;
	}

	public PayoutDetailsBuilder setPayerCity(String payerCity) {
		this.payerCity = payerCity;
		return this;
	}

	public PayoutDetailsBuilder setPayerCountry(String payerCountry) {
		this.payerCountry = payerCountry;
		return this;
	}

	public PayoutDetailsBuilder setBeneficiaryFirstName(String beneficiaryFirstName) {
		this.beneficiaryFirstName = beneficiaryFirstName;
		return this;
	}

	public PayoutDetailsBuilder setBeneficiaryLastName(String beneficiaryLastName) {
		this.beneficiaryLastName = beneficiaryLastName;
		return this;
	}

	public PayoutDetailsBuilder setBeneficiaryAddressLine(String beneficiaryAddressLine) {
		this.beneficiaryAddressLine = beneficiaryAddressLine;
		return this;
	}

	public PayoutDetailsBuilder setBeneficiaryCity(String beneficiaryCity) {
		this.beneficiaryCity = beneficiaryCity;
		return this;
	}

	public PayoutDetailsBuilder setBeneficiaryCountry(String beneficiaryCountry) {
		this.beneficiaryCountry = beneficiaryCountry;
		return this;
	}

	public PayoutDetailsBuilder setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
		return this;
	}

	public PayoutDetailsBuilder setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	public PayoutDetails getPayoutDetails()
	{
		return new PayoutDetails(payerFirstName, payerLastName, payerAddressLine, payerCity, 
				payerCountry, beneficiaryFirstName, beneficiaryLastName, beneficiaryAddressLine, 
				beneficiaryCity, beneficiaryCountry, transferAmount, currency);
	}
}
