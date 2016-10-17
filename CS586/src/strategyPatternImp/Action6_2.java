package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.*;

/*
 * Action6_2 Class -> makeDeposit Action
 */


 //implements Action6 interface

public class Action6_2 implements Action6 {
	
    public void makeDeposit(DataStore ds2){
	
    	((DataStore2) ds2).balanceAfterDeposit();
    	((DataStore2) ds2).balanceAfterDeposit();
	    System.out.println("Balance after Deposit: " +((DataStore2) ds2).getBalance());
		
	}

}
