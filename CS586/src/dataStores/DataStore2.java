package dataStores;

/*
 * DataStore1 Class
 */

//This is extends DataStore abstract class
//This datastore stores data for Account1

//This datastore stores data for Account2

public class DataStore2 extends DataStore {
	
	public int temp_p;  //stores temporary pin
	public int temp_y;  //stores temporary user id
	public int temp_a;  //stores temporary balance
	
	public int temp_d; //stores temporary deposit
	public int temp_w; //stores temporary withdraw amount
	
	public int pin; //stores permanent pin
	public int id;  //stores permanent id
	public int balance; //stores permanent balance
	
	public int deposit; //stores deposit
	public int withdraw; //stores withdraw
	
	
   public int getPin(){
		
		return pin;
		
	}
	public int setPin(){
		
		return pin = temp_p;
	}
	
    public int getId(){
		
    	return id;
		
	}
	
	public int setId(){
		return id = temp_y;
	}
	
    public int getBalance(){
		
		return balance;
		
	}
    
	public int setBalance(){
		return balance = temp_a;
	}
	
	//This part of the code uses the data store to compute other necessary information
	
	
	public int getDeposit(){
		return deposit;
	}
	public void setDeposit(){
		deposit = temp_d;
	}
	public int getWithdraw(){
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
	public int applyPenalty(){
		balance = balance-20;
		temp_a = balance;
		return balance;
	}
	
	
	
	

}
