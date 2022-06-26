package com.tns.Application;
import com.tns.Freamwork.SavingAcc;
public class MMSavingAcc extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format(
				"MMSavingAcc [toString()=%s, getAccBal()=%s,]",
				super.toString(), getAccBal());
	}

	@Override
	public void withdraw(float AccBal) {
		System.out.println("Account no is " + this.getAccNo());
	
	}
}
