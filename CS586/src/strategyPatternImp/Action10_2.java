package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.*;

/*
 * Action10_2 Class -> penalty() Action
 */


 //implements Action10 interface

public class Action10_2 implements Action10 {

	@Override
	public void penalty(DataStore ds2) {
		
        ((DataStore2) ds2).applyPenalty();
		
		System.out.println("$20 Penalty is applied to all accounts that goes below $500");
		System.out.println("Account2 Balance after Penalty: " +((DataStore2) ds2).balance);
		
	}

}
