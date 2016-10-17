package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.*;

/*
 * Action7_1 Class -> displayBalance() Action
 */


 //implements Action7 interface

public class Action7_1 implements Action7 {
	
	public void displayBalance(DataStore ds1){
		
		System.out.println("Account1 balance: "+((DataStore1) ds1).getBalance() );
		
	}

}
