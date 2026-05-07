package org.override;

public class Arts extends Education {
	private void bSc() {
		System.out.println("bsc fess is 45000");
	}

	private void bEd() {
		System.out.println("bEd fess is 33000");

	}

	private void baEnglish() {
		System.out.println("baEnglish fees is 12894");
	}
	@Override
	public void ug() {
		System.out.println("ug fees is 1567000");
	}
	@Override
	public void pg() {
		System.out.println("pg fess is 37650000");
	}
	public static void main(String[] args) {
		Arts w = new Arts();
		w.baEnglish();
		w.bSc();
		w.bEd();
		w.ug();
		w.pg();
	}

}
