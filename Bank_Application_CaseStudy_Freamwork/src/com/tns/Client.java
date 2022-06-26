package com.tns;
import com.tns.Freamwork.BankFactory;
import com.tns.Freamwork.SavingAcc;
import com.tns.Freamwork.CurrentAcc;
import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
public abstract class Client {

	public static void main(String[] args) {
		BankFactory b= new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123, "archana", 1000 , true);
		CurrentAcc ca=new MMCurrentAcc(321, "aayu", 2000, 1000);
		System.out.println("is Salried acc");
		sa.withdraw(sa.getAccBal());
		System.out.println("current acc");
		ca.withdraw(ca.getAccBal());
		System.out.println(b.getnewSavingAcc(1, "anju", 5500, true));
		System.out.println(b.getnewCurrentAcc(2, "prisha", 3500, 2000));
		
		System.out.println(sa);
		System.out.println(ca);

	}

}
