package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

/*
 * Action5_1 Class -> DisplayMenu() Action
 */


 //implements Action5 interface

public class Action5_1 implements Action5 {
	
	public void DisplayMenu(){
		
		System.out.println("\n" +"Login was successful. Below is the menu Select operations number below in the menu"
				+ " \n"+"TRANSACTION MENU ACCOUNT1"
				+"\n"  +"      BALANCE"
				+ "\n" +"      DEPOSIT"
				+ "\n" +"      WITHDRAW"
				+ "\n" +"      LOCK"
				+ "\n" +"      UNLOCK");

	}
	
	
}
