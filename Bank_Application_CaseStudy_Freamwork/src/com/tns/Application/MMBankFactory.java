package com.tns.Application;

import com.tns.Freamwork.*;

public  class MMBankFactory extends BankFactory {

	
		public CurrentAcc getnewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo, accNm,  accBal, 1000);
		return c;
	}

	
	public SavingAcc getnewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

}
