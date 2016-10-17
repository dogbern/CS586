package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * Suspended Class
 */

//This class implements State class and defines the state Suspended

public class Suspended implements State {
	
	MDA_EFSM context = null;
	
	public Suspended(MDA_EFSM context){
		
		this.context = context;
		
	}
	
	public void open(){
		 
	 }
	 public void login(){
		 
	 }
	 public void logout(){
		 
	 }
	 public void incorrectLogin(){
		 
	 }
	 public void incorrectPin(int max){
		 
	 }
	 public void correctPinAboveMin(){
		 
	 }
	 public void incorrectLock(){
		 
	 }
	 public void deposit(){
		 
	 }
	 public void balance(){
		 
		 context.output.DisplayBalance();
		 
	 }
	 public void suspend(){
		 
	 }
	 public void activate(){
		 
		 context.setState(context.getReadyState());
		 System.out.println("Account is activated");
		 
	 }
	 public void lock(){
		 
	 }
	 public void withdraw(){
		 
	 }
	 public void AboveMinBalance(){
		 
	 }
	 public void noFunds(){
		 
	 }
	 public void close(){
		 
		 context.setState(context.getCloseState());
		 System.out.println("Account is closed");
		 
	 }
	 public void incorrectUnlock(){
		 
	 }
	 public void withdrawBelowMinBalance(){
		 
	 }
	 public void BelowMinBalance(){
		 
	 }
	 public void correctPinBelowMin(){
		 
	 }


	@Override
	public void unLock() {
		// TODO Auto-generated method stub
		
	}

}
