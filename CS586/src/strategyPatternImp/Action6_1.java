package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.*;

/*
 * Action6_1 Class -> makeDeposit Action
 */


 //implements Action6 interface

public class Action6_1 implements Action6{
	
	public void makeDeposit(DataStore ds1){
		((DataStore1) ds1).setDeposit();
		((DataStore1) ds1).balanceAfterDeposit();
		System.out.println("Balance after Deposit: " +((DataStore1) ds1).getBalance());
		
	}

}
