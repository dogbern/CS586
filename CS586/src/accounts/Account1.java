package accounts;

import dataStores.*;
import statePatternImp.*;
/*
 * ACCOUNT-1 Class
 */

public class Account1 {
	
	DataStore ds1 = null;
	MDA_EFSM context = null;
	
	public Account1(MDA_EFSM context, DataStore ds1){
		this.context = context;
		this.ds1 = ds1;
	}
	
	public void open(String p, String y, float a){
		
		//Store p, y and in temp data store
		((DataStore1)ds1).temp_p = p;
		((DataStore1)ds1).temp_y = y;
		((DataStore1)ds1).temp_a = a;
		 context.open();
			
	}
	
	public void pin (String x){
		
		if (x.equals(((DataStore1)ds1).temp_p)){
			if (((DataStore1)ds1).temp_a > 500.00){
			 	context.correctPinAboveMin();
			}
			else
				context.correctPinBelowMin();
                
		}
		else
			context.incorrectPin(3);
		
	}
	public void deposit(float d){
		((DataStore1)ds1).temp_d = d;
		 context.deposit();
		 
		 if (((DataStore1)ds1).temp_a > 500.00){
			 context.aboveMinBalance();
		 }
		 else
			 context.belowMinBalance();
		
		
	}
	
	public void withdraw(float w){
		((DataStore1)ds1).temp_w = w;
		context.withdraw();
		
		if(((DataStore1)ds1).temp_a > 500.00){
			context.aboveMinBalance();
		}
		else 
			context.withdrawBelowMinBalance();
		
	}
	
	public void balance(){
		context.balance();
		
	}
	
	public void login(String y)
	{
		if(y.equals(((DataStore1)ds1).temp_y)){
			context.login();
		}
		else context.IncorrectLogin();
	}
	
	public void logout(){
		context.logout();
		
	}
	
	public void lock(String x){
		
		if(x.equals(((DataStore1)ds1).temp_p)){
			context.lock();
		}
		else
			context.incorrectLock();
		
	}
	
	public void unlock(String x){
		if(x.equals(((DataStore1)ds1).temp_p)){
			context.unlock();
			if( ((DataStore1)ds1).balance > 500.00 ){
				context.aboveMinBalance();
			}
			else
				context.belowMinBalance();
		}
		else
			context.incorrectUnlock();
		
	}

}
