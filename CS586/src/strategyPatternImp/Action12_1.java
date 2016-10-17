package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action12_1 Class -> incorrectUnLockMsg() Action
 */


 //implements Action12 interface

public class Action12_1 implements Action12 {
	
       public void incorrectUnlockMsg(){
		
		  System.out.println("Unable to unlock account1. Please Check pin and try again");
	}

}
