package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action13_1 Class -> noFundsMsg Action
 */


 //implements Action13 interface


public class Action13_1 implements Action13 {

	@Override
	public void noFundsMsg() {
		
		System.out.println("Account1 is below $500. No Withdrawal allowed");
		
	}

}
