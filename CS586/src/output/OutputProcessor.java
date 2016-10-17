package output;

import strategyPatternImp.*;
import abstractFactoryPatternImp.*;
import dataStores.*;



/*
 * OutputProcessor Class
 */


public class OutputProcessor {
	
	DataStore ds = null;
	AbstractFactory af = null;
	
	public OutputProcessor(AbstractFactory af, DataStore ds){
		this.af = af;
		this.ds = ds;		
	}
	
	public void StoreData(){  //StoreData action is performed
		System.out.println("\n--StoreData Action--");
		Action1 data = af.createStoreData();
		data.StoreData(ds);	
	}

	
	public void IncorrectIdMsg(){ //IncorrectIdMsg action is performed
		System.out.println("\n--IncorrectIdMsg Action--");
		Action2 msg1 = af.createIncorrectIdMsg();
		msg1.incorrectIdMsg();
		
	}
	public void IncorrectPinMsg(){ //IncorrectPinMsg action is performed
		System.out.println("\n--IncorrectPinMsg Action--");
		Action3 msg2 = af.createIncorrectPinMsg();
		msg2.incorrectPinMsg();
		
	}
	
	public void TooManyAttemptsMsg(){//TooManyAttemptsMsg action is performed
		System.out.println("\n--TooManyAttemptsMsg Action--");
		Action4 msg3 = af.createTooManyAttemptsMsg();
		msg3.tooManyAttemptsMsg();
	} 
	
	public void DisplayMenu(){ //DisplayMenu action is performed
		System.out.println("\n--DisplayMenu Action--");
		Action5 menu = af.createDisplayMenu();
		menu.DisplayMenu();
	}
	
	public void MakeDeposit(){//makeDeposit action is performed
		System.out.println("\n--MakeDeposit Action--");
		Action6 deposit = af.createMakeDeposit();
		deposit.makeDeposit(ds);
	}
	
	public void DisplayBalance(){//DisplayBalance action is performed
		
		System.out.println("\n--DisplayBalance Action--");
		Action7 balance = af.createDisplayBalance();
		balance.displayBalance(ds);
	}
	
	public void PromptForPin(){//PromptForPin action is performed
		System.out.println("\n--PromptForPin Action--");
		Action8 prompt = af.createPromptForPin();
		prompt.promptForPin();
	}
	
	public void MakeWithdraw(){//MakeWithdraw action is performed
		System.out.println("\n--MakeWithdraw Action--");
		Action9 withdraw = af.createMakeWithdraw();
		withdraw.makeWithdraw(ds);
	}
	
	public void Penalty(){//Penalty action is performed
		System.out.println("\n--Penalty Action--");
		Action10 penalty = af.createPenalty();
		penalty.penalty(ds);
		
	}
	public void IncorrectlockMsg(){//IncorrectlockMsg action is performed
		System.out.println("\n--IncorrectlockMsg Action--");
		Action11 msg4 = af.createIncorrectLockMsg();
		msg4.incorrectLockMsg();
	}
	
	public void IncorrectUnlockMsg(){//IncorrectUnlockMsg action is performed
		System.out.println("\n--IncorrectUnlockMsg Action--");
		Action12 msg5 = af.createIncorrectUnlockMsg();
		msg5.incorrectUnlockMsg();
	}
	
	public void NoFundsMsg(){//NoFundsMsg action is performed
		System.out.println("\n--NoFundsMsg Action--");
		Action13 msg6 = af.createNoFundsMsg();
		msg6.noFundsMsg();
	}

}
