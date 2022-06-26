package com.tns.Application;

import com.tns.Freamwork.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);

	}

	@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s, getAccBal()=%s,]", super.toString(), getAccBal());
	}

	public void withdraw(float AccBal) {
		System.out.println("Account no is " + this.getAccNo());
	}

}
