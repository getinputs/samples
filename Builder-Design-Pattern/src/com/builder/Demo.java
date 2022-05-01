package com.builder;

public class Demo {
	
	public static void main(String[] args) {
		
		PayoutDetails payoutDetails = new PayoutDetailsBuilder()
				.setPayerFirstName("Rohit")
				.setPayerLastName("Sharma")
				.setPayerCity("Mumbai")
				.setPayerCountry("India")
				.setBeneficiaryFirstName("Virat")
				.setBeneficiaryLastName("Kohli")
				.setBeneficiaryCity("Delhi")
				.setBeneficiaryCountry("India")
				.setTransferAmount(1000)
				.setCurrency("INR")
				.getPayoutDetails();
		
		System.out.println(payoutDetails);
	}
}
