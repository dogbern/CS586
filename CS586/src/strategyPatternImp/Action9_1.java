package strategyPatternImp;

import dataStores.*;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action9_1 Class -> makeWithdraw() Action
 */


 //implements Action9 interface

public class Action9_1 implements Action9{
	
	public void makeWithdraw(DataStore ds1){
		
		((DataStore1) ds1).setWithdraw();
		((DataStore1) ds1).balanceAfterWithdraw();
		System.out.println("Account1 Balance after withdrawal: " +((DataStore1) ds1).getBalance());
	}

}
