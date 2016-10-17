package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************


/*
 * Action13_2 Class -> noFundsMsg Action
 */


 //implements Action13 interface
public class Action13_2 implements Action13 {

	@Override
	public void noFundsMsg() {
		System.out.println("Account2 is below $500. No Withdrawal allowed");
		
	}

}
