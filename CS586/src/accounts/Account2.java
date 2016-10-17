package accounts;

import statePatternImp.MDA_EFSM;

import dataStores.*;

/*
 * ACCOUNT-2 Class
 */

public class Account2 {
	

	DataStore ds2 = null;
	MDA_EFSM context = null;
	
	public Account2 (MDA_EFSM context, DataStore ds2){
		this.context = context;
		this.ds2 = ds2;
	    
	}
	
	
	public void OPEN(int p, int y, int a){
		
		//Store p, y and in temp data store
	    ((DataStore2)ds2).temp_p = p;
	    ((DataStore2)ds2).temp_y = y;
	    ((DataStore2)ds2).temp_a = a;
	    
	    context.open();		
		
	}
	
	public void PIN (int x){
		
		if (x == ((DataStore2)ds2).temp_p){
			context.correctPinAboveMin();
			
		}
		else
			context.incorrectPin(2);
		
	}
	public void DEPOSIT(int d){
		
		((DataStore2)ds2).temp_d = d;
		context.deposit();
		
	}
	
	public void WITHDRAW(int w){
		
		((DataStore2)ds2).temp_w = w;
		if(((DataStore2)ds2).balance >0){
			context.withdraw();
		}
		else
			context.noFunds();
		
	}
	
	public void BALANCE(){
		
		context.balance();
		
	}
	
	public void LOGIN(int y)
	{
		if(y == ((DataStore2)ds2).temp_y){
			context.login();
		}
		else
			context.incorrectLogin();
		
	}
	
	public void LOGOUT(){
		
		context.logout();
		
	}
	
	public void suspend(){
		
		context.suspend();
	}
	
	public void activate(){
		
		context.activate();
		
	}
	
	public void close(){
		
		context.close();
		
	}

}


