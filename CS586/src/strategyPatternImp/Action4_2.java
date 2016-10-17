package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action4_2 Class -> tooManyAttemptsMsg() Action
 */


 //implements Action4 interface

public class Action4_2  implements Action4{
	
	
    public void tooManyAttemptsMsg(){
		
		System.out.println("Too many attempts on Account2");
		System.out.println("login to try again");
	}

}
