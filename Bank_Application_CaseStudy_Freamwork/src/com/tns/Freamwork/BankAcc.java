package com.tns.Freamwork;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;

	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public abstract void withdraw(float accBal);

	public void deposite(float accBal) {
		System.out.println(accBal);
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}

	public char[] getNewCurrentAcc(int i, String string, int j, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}