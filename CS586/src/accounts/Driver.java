package accounts;

import java.util.InputMismatchException;
import java.util.Scanner;

import abstractFactoryPatternImp.*;
import output.*;
import statePatternImp.*;

/*
 * Driver Class
 */

public class Driver {
	
	public static void main (String [] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("                   Select ACCOUNT-1 or ACCOUNT-2");
		System.out.println("\n" +"1. ACCOUNT-1");
		System.out.println("\n" +"2. ACCOUNT-2");
		
	    System.out.println("\n" +"Select ACCOUNT option (1 or 2): ");
	    
	    try {
	    	
	        int input = sc.nextInt();
	    
	   
	    
	    if (input == 1) {
	    	
	    	ConcreteFactory1 cf1 = new ConcreteFactory1();
	    	OutputProcessor output = new OutputProcessor(cf1, cf1.getData());
	    	MDA_EFSM context = new MDA_EFSM(cf1, output);
	    	Account1 acct1 = new Account1(context, cf1.getData());
	    	
	    	MenuOperationsForAccount1();
	    	
	            	
	    String PIN, ID;
	    float balance;
	    boolean flag = true;
	        	
	             while (flag){
	            	 
	            	 
	            	 
	            	 ExecutionMenuForAccount1();
	            	
	            	
	            	 int ch = sc.nextInt();
	            	 
	             	
	        		switch(ch){
		        	case 0: //open
		        		System.out.println("Operation: open(string p, string y, float a)");
		        		System.out.println("Enter value of the Parameter P: ");
		        		PIN = sc.next();
		        		System.out.println("Enter value of the Parameter y: ");
		        		ID = sc.next();
		        		System.out.println("Enter value of the Parameter a: ");
		        		balance = sc.nextFloat();
		        		acct1.open(PIN, ID, balance);
		        		break;
		        		
		        	case 1: //login
		        		System.out.println("Operation: login(string y)");
		        		System.out.println("Enter value of the Parameter y: ");
		        		ID = sc.next();
		        		acct1.login(ID);;
		        		break;
		        		
		        	case 2://pin
		        		System.out.println("Operation: pin(string x)");
		        		System.out.println("Enter value of the Parameter x: ");
		        		String x = sc.next();
		        		acct1.pin(x);
		        		break;
		        		
		        	case 3: //deposit
		        		System.out.println("Operation: deposit(float d)");
		        		System.out.println("Enter value of the Parameter d: ");
		        		float d = sc.nextFloat();
		        		acct1.deposit(d);
		        		break;
		        		
		        	case 4: //withdraw
		        		System.out.println("Operation: withdraw(float w)");
		        		System.out.println("Enter value of the Parameter w: ");
		        		float w = sc.nextFloat();
		        		acct1.withdraw(w);
		        		break;
		        		
		        	case 5://balance
		        		System.out.println("Operation: balance()");
		        		acct1.balance();
		        		break;
		        				
		        	case 6: //logout
		        		System.out.println("Operation: logout()");
		        		acct1.logout();
		        		break;
		        	
		        	case 7: //lock
		        		System.out.println("Operation: lock(string x)");
		        		System.out.println("Enter value of the Parameter x: ");
		        		x = sc.next();
		        		acct1.lock(x);
		        		break;
		        		
		        	case 8: //unlock
		        		System.out.println("Operation: unlock(string x)");
		        		System.out.println("Enter value of the Parameter : ");
		        		x = sc.next();
		        		acct1.unlock(x);
		        		break;
		        		
		        	case 9: //quit
		        		System.out.println("Exiting Menu! Have a good day!!");
		        		flag = false;
		        		break;
		        	
		        	default:
		        		System.out.println("Input must be 0-8");
		        	}
		        	
	        		
		        } 
	        
	        
	        }
	    else
	    	if (input == 2){
	    		
	    		ConcreteFactory2 cf2 = new ConcreteFactory2();
		    	OutputProcessor output = new OutputProcessor(cf2, cf2.createDataStore());
		    	MDA_EFSM context = new MDA_EFSM(cf2, output);
		    	Account2 acct2 = new Account2(context, cf2.createDataStore());
		    	
		    	MenuOperationsForAccount2();
		            	
		    int PIN, ID,balance;
		    boolean flag = true;
		        	
		             while (flag){
		            	 
		            	 ExecutionMenuForAccount2();
		            	 
		             	int ch = sc.nextInt();
		             	
		        		switch(ch){
			        	case 0: //open
			        		System.out.println("Operation: OPEN(int p, int y, int a)");
			        		System.out.println("Enter value of the Parameter P: ");
			        		PIN = sc.nextInt();
			        		System.out.println("Enter value of the Parameter y: ");
			        		ID = sc.nextInt();
			        		System.out.println("Enter value of the Parameter a: ");
			        		balance = sc.nextInt();
			        		acct2.OPEN(PIN, ID, balance);
			        		break;
			        		
			        	case 1: //login
			        		System.out.println("Operation: LOGIN(string y)");
			        		System.out.println("Enter value of the Parameter y: ");
			        		ID = sc.nextInt();
			        		acct2.LOGIN(ID);
			        		break;
			        		
			        	case 2://pin
			        		System.out.println("Operation: PIN(int x)");
			        		System.out.println("Enter value of the Parameter x: ");
			        		int x = sc.nextInt();
			        		acct2.PIN(x);
			        		break;
			        		
			        	case 3: //deposit
			        		System.out.println("Operation: DEPOSIT(int d)");
			        		System.out.println("Enter value of the Parameter d: ");
			        		int d = sc.nextInt();
			        		acct2.DEPOSIT(d);
			        		break;
			        		
			        	case 4: //withdraw
			        		System.out.println("Operation: WITHDRAW(int w)");
			        		System.out.println("Enter value of the Parameter w: ");
			        		int w = sc.nextInt();
			        		acct2.WITHDRAW(w);
			        		break;
			        		
			        	case 5://balance
			        		System.out.println("Operation: BALANCE()");
			        		acct2.BALANCE();
			        		break;
			        				
			        	case 6: //logout
			        		System.out.println("Operation: LOGOUT()");
			        		acct2.LOGOUT();
			        		break;
			        	
			        	case 7: //suspend
			        		System.out.println("Operation: suspend()");
			        		acct2.suspend();
			        		break;
			        		
			        	case 8: //activate
			        		System.out.println("Operation: activate()");
			        		acct2.activate();
			        		break;
			        		
			        	case 9: //activate
			        		System.out.println("Operation: close()");
			        		acct2.close();
			        		break;
			        	
			        	case 10://quit
			        		System.out.println("Exiting Menu! Have a good day!!");
			        		flag = false;
			        		break;
			        		
			        	default:
			        		System.out.println("Input must be 0-8");
			        	}
			        	
		        		
			        } 
		        
	    		    		
	    	} //End of If statement
	  
	    } 
	    catch (InputMismatchException e){
	         System.out.println("Invalid input");
	         //continue;
	       }
	    
	    sc.close();
}
	
	public static void MenuOperationsForAccount1(){
		
		System.out.println("                    ACCOUNT-1          ");
        System.out.println("\n"             +"                    " );	
        System.out.println("          MENU of Operations" );
        System.out.println("          0. open(string p, string y, float a)" );
        System.out.println("          1. login(string x)" );
        System.out.println("          2. pin(String x)" );
        System.out.println("          3. deposit" );
        System.out.println("          4. withdraw(w)" );
        System.out.println("          5. balance()" );
        System.out.println("          6. logout()" );
        System.out.println("          7. lock(string x)" );
        System.out.println("          8. unlock(string x)" );
        System.out.println("          9. Quit the program" );	
        System.out.println("  Please make a note of these operations" );	  	    	
        System.out.println("           ACCOUNT-1 Execution" );
		
	}
	
	public static void ExecutionMenuForAccount1(){
		
		System.out.println("  Select Operation: ");
    	System.out.println("0-open,1-login, 2-pin, 3-deposit, 4-withdraw, 5-balance, 6-logout, 7-lock, 8-unlock, 9-quit");
		
	}
	public static void MenuOperationsForAccount2(){
		
    	System.out.println("                    ACCOUNT-2          ");
        System.out.println("\n"             +"                    " );	
        System.out.println("          MENU of Operations" );
        System.out.println("          0. OPEN(int p, int y, int a)" );
        System.out.println("          1. PIN(int x)" );
        System.out.println("          2. DEPOSIT(intd)" );
        System.out.println("          3. WITHDRAW(int w)" );
        System.out.println("          4. BALANCE()" );
        System.out.println("          5. LOGIN(int y)" );
        System.out.println("          6. LOGOUT()" );
        System.out.println("          7. suspend()" );
        System.out.println("          8. activate(string x)" );
        System.out.println("          9. close()" );
        System.out.println("          10. Quit the program" );	
        System.out.println("  Please make a note of these operations" );	  	    	
        System.out.println("           ACCOUNT-2 Execution" );
		
	}
	public static void ExecutionMenuForAccount2(){
		
    	System.out.println("  Select Operation: ");
     	System.out.println("0-OPEN,1-LOGIN,2-PIN,3-DEPOSIT,4-WITHDRAW,5-BALANCE,6-LOGOUT,7-suspend,8-activate,9-close, 10-quit");
		
	}
	
	
	

}
