package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************


import dataStores.*;

/*
 * Action10_1 Class -> penalty() Action
 */


 //implements Action10 interface

public class Action10_1 implements Action10 {

	@Override
	public void penalty(DataStore ds1) {
		
		((DataStore1) ds1).applyPenalty();
		
		System.out.println("$20 Penalty is applied to all accounts that goes below $500");
		System.out.println("Account1 Balance after Penalty: " +((DataStore1) ds1).balance);
		
	}

}
