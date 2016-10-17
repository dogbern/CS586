package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * Locked Class
 */

//This class implements State class and defines the state Locked

public class Locked implements State {
	
	MDA_EFSM context = null;
	
	public Locked(MDA_EFSM context){
		
		this.context = context;
	}
	
	 public void open(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void login(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void logout(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void incorrectLogin(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void incorrectPin(int max){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void correctPinAboveMin(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void incorrectLock(){
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void deposit(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void balance(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void suspend(){
		 
		 System.out.println("\n Unsupported Operation");
		 
	 }
	 public void activate(){
		 
		 System.out.println("\n Unsupported Operation");
		 
	 }
	 public void lock(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void withdraw(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void AboveMinBalance(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void noFunds(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void close(){
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void incorrectUnlock(){
		 
		 context.output.IncorrectUnlockMsg();
		 
	 }
	 public void withdrawBelowMinBalance(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void BelowMinBalance(){
		 
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	 public void correctPinBelowMin(){
		 System.out.println("\n Account is locked. Please perform unlock operation");
		 
	 }
	
	@Override
	public void unLock() {
		//Moves to S1 state when unlock operation is performed
		context.setState(context.getS1State());
		
	}

}
