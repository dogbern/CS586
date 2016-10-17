package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.*;

/*
 * Action7_2 Class -> displayBalance() Action
 */


 //implements Action7 interface

public class Action7_2 implements Action7 {
	
	public void displayBalance(DataStore ds2){
		
		System.out.println("Account2 balance: "+((DataStore2) ds2).getBalance() );
		
		
	}

}
