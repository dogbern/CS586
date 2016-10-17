package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action11_1 Class -> incorrectLockMsg() Action
 */


 //implements Action11 interface

public class Action11_1 implements Action11 {

	@Override
	public void incorrectLockMsg() {
		
		System.out.println("Unable to lock account1. Please Check pin and try again");
		
	}

}
