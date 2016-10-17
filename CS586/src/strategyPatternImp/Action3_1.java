package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action3_1 Class -> incorrectPinMsg() Action
 */


 //implements Action3 interface

public class Action3_1 implements Action3 {
	
	public void incorrectPinMsg(){
		
		System.out.println("Account1 User PIN is incorrect");
		System.out.println("Try Again");
	}

}
