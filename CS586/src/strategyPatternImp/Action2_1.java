package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action2_1 Class -> IncorrectIdMsg() Action
 */


 //implements Action2 interface
public class Action2_1 implements Action2{
	
	public void incorrectIdMsg(){
		
		System.out.println("Account1 User ID is incorrect");
		System.out.println("Try Again");
	}

}
