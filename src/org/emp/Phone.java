package org.emp;

public class Phone {
	private void phoneInfo(String phName,long phNo,int phPin) {
		System.out.println("phone name is "+phName +"\nphone number is "+ phNo +"\tphone pin is"+phPin);

	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo("vivo", 8765893872l,3423);
	}

}
