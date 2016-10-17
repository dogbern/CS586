package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action2_2 Class -> IncorrectIdMsg() Action
 */


 //implements Action2 interface

public class Action2_2 implements Action2 {
	
public void incorrectIdMsg(){
		
		System.out.println("Account2 User ID is incorrect");
		System.out.println("Try Again");
	}

}
