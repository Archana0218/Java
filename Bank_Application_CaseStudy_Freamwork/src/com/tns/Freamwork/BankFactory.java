package com.tns.Freamwork;

public abstract  class BankFactory {

	abstract public  SavingAcc getnewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
	abstract public CurrentAcc getnewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
	
}