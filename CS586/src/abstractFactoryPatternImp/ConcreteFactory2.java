package abstractFactoryPatternImp;

import dataStores.*;
import strategyPatternImp.*;

//**********ABSTRACT FACTORY PATTERN IMPLEMENTATION***********************

/*
 * ConcreteFactory2 Class
 */

public class ConcreteFactory2 implements AbstractFactory {
	
	DataStore ds2 = new DataStore2(); //Datastore1 object
	Action1 pin = new Action1_2(); //stores pin object
	Action2 msg1 = new Action2_2(); //incorrect ID message object
	Action3 msg2 = new Action3_2(); //incorrect PIN message object
	Action4 msg3 = new Action4_2(); //too many attempts message object
	Action5 menu = new Action5_2(); //transaction menu object
	Action6 deposit = new Action6_2(); //deposit object
	Action7 balance = new Action7_2(); //Display balance object
	Action8 prompt = new Action8_2(); //prompts for pin object
	Action9 withdraw = new Action9_2(); //withdraw object
	Action10 penalty = new Action10_2(); //penalty object
	Action11 msg4 = new Action11_1();  //incorrect lock message
	Action12 msg5 = new Action12_1(); //incorrect unlock message
	Action13 msg6 = new Action13_2(); //no sufficient funds message.

	@Override
   public DataStore createDataStore() {
		
		return ds2;
	}

	@Override
	public Action1 createStoreData() {
		// returns store data object
		return pin;
	}

	@Override
	public Action2 createIncorrectIdMsg() {
		// returns incorrect id message obj
		return msg1;
	}

	@Override
	public Action3 createIncorrectPinMsg() {
		// returns incorrect pin message obj
		return msg2;
	}

	@Override
	public Action4 createTooManyAttemptsMsg() {
		// returns too many attempt message obj
		return msg3;
	}

	@Override
	public Action5 createDisplayMenu() {
		// returns transaction menu obj
		return menu;
	}

	@Override
	public Action6 createMakeDeposit() {
		// returns deposit object
		return deposit;
	}

	@Override
	public Action7 createDisplayBalance() {
		// returns balance object
		return balance;
	}

	@Override
	public Action8 createPromptForPin() {
		// returns prompt for pin object
		return prompt;
	}

	@Override
	public Action9 createMakeWithdraw() {
		// returns withdraw object
		return withdraw;
	}

	@Override
	public Action10 createPenalty() {
		// returns penalty object
		return penalty;
	}

	@Override
	public Action11 createIncorrectLockMsg() {
		// returns incorrect lock message obj
		return msg4;
	}

	@Override
	public Action12 createIncorrectUnlockMsg() {
		// returns incorrect unlock message obj
		return msg5;
	}

	@Override
	public Action13 createNoFundsMsg() {
		// returns no sufficient funds object
		return msg6;
	}

}
