package dataStores;

/*
 * DataStore1 Class
 */

//This is extends DataStore abstract class
//This datastore stores data for Account1
public class DataStore1 extends DataStore{
	
	public String temp_p;  //stores temporary pin
	public String temp_y;  //stores temporary user id
	public float temp_a;   //stores temporary balance
	public float temp_d; //stores temporary deposit
	public float temp_w; //stores temporary withdraw amount
	
	public String pin; // stores permanent pin
	public String id;  //stores permanent id
	public float balance;  // stores permanent balance
	public float deposit; //stores deposit
	public float withdraw; //stores withdraw
	
	
   public String getPin(){
		
		return pin;
		
	}
	public String setPin(){
		
		pin = temp_p;
		
		return pin;
	}
	
    public String getId(){
		
    	return id;
		
	}
	
	public String setId(){
		
		id = temp_y;
		
		return id;
	}
	
    public float getBalance(){
		
		return balance;
		
	}
	public float setBalance(){
		balance = temp_a;
		
		return balance;
	}
	//This part of the code uses the data store to compute other necessary information
	
	public float getDeposit(){
		return deposit;
	}
	public void setDeposit(){
		deposit = temp_d;
	}
	public float getWithdraw(){
		return withdraw;
	}
	public void setWithdraw(){
		withdraw = temp_w;
	}
	
	
	public void balanceAfterDeposit(){
		balance = balance + deposit;
		temp_a = balance;
	}
	public void balanceAfterWithdraw(){
		balance = balance - withdraw;
		temp_a = balance;
	}
	
	//A penalty of $20 is subtracted from balance when below min
	public float applyPenalty(){
			balance = balance-20;
			temp_a = balance;
			return balance;
	}
	
	
}
