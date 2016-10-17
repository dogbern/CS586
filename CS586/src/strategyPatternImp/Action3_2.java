package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action3_2 Class -> incorrectPinMsg() Action
 */


 //implements Action3 interface

public class Action3_2 implements Action3 {
	
public void incorrectPinMsg(){
		
		System.out.println("Account2 User PIN is incorrect");
		System.out.println("Try Again");
	}

}
