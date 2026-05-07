package org.override;
//child
public class AxixBank extends BankInfo {
	private void drposit2() {
		System.out.println("deposit2 interest 15%");
	}

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		super.saving();
	}
	
	@Override
	public void fixed() {
		System.out.println("fixed interest 55%");
	}
	@Override
	public void deposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		AxixBank a = new AxixBank();
		
		a.deposit();
		a.drposit2();
		a.saving();
		a.fixed();
		
	}

}
