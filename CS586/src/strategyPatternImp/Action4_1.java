package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action4_1 Class -> tooManyAttemptsMsg() Action
 */


 //implements Action4 interface

public class Action4_1 implements Action4 {
	
	public void tooManyAttemptsMsg(){
		
		System.out.println("Too many attempts on Account1");
		System.out.println("login to try again");
	}

}
