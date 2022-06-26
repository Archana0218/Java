package com.tns.Freamwork;

public abstract class CurrentAcc extends BankAcc {
private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	public void Withdraw(float AccBal) {
		System.out.println("Account no is"+this.getAccNo());
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [MINBAL=%s]", creditLimit,super.getAccBal());
	}
	
	
}
