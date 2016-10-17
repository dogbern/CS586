package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************
/*
 * Action5_2 Class -> DisplayMenu() Action
 */


 //implements Action5 interface

public class Action5_2 implements Action5{
	
public void DisplayMenu(){
		
		System.out.println("\n"+"Login was successful. Below is the menu Select operations number below in the menu"
				+ "   \n" + "TRANSACTION MENU ACCOUNT2"
				+ "   \n" +"       BALANCE"
				+ "   \n" +"       DEPOSIT"
				+ "   \n" +"       WITHDRAW"
				+ "   \n" +"       SUSPEND"
				+ "   \n" +"       ACTIVATE");

	}

}
