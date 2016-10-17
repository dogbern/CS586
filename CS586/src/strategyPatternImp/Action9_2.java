package strategyPatternImp;

import dataStores.*;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action9_2 Class -> makeWithdraw() Action
 */


 //implements Action9 interface

public class Action9_2 implements Action9 {

	@Override
	public void makeWithdraw(DataStore ds2) {
		
		((DataStore2) ds2).setWithdraw();
		((DataStore2) ds2).balanceAfterWithdraw();
		System.out.println("Account1 Balance after withdrawal: " +((DataStore2) ds2).getBalance());


		
	}

}
