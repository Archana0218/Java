package com.tns.Freamwork;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	static final private float MINBAl = 0.0f;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	public void withdraw(float AccBal) {
		System.out.println("Account no is " + this.getAccNo());
		}

	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried, super.toString());

	}

	public static float getMinbal() {
		return MINBAl;
	}

	

}
