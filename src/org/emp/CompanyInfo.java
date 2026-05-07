package org.emp;

public class CompanyInfo {
	private void companyName(int age,int atmPin,int pincode,double bankBalance) {
 System.out.println("comapny age is " +age +"\n company pin is "+atmPin +"\ncompany pincode is "+pincode+"\tcomapany bankBalance is "+bankBalance);

	}
	public static void main(String[] args) {
		CompanyInfo u = new CompanyInfo();
		u.companyName(127,2342,65426,53221.3);
	}

}
