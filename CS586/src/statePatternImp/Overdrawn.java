package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * Overdrawn Class
 */

//This class implements State class and defines the state Overdrawn

public class Overdrawn implements State {
	
	MDA_EFSM context = null;
	
	public Overdrawn (MDA_EFSM context){
		this.context = context;
	}
	
	public void open(){
		 
	 }
	 public void login(){
		 
	 }
	 public void logout(){
		 
		 context.setState(context.getIdleState());
		 
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
		 
		 context.output.MakeDeposit();
		 context.setState(context.getS1State());
		 
	 }
	 public void balance(){
		 
		 context.output.DisplayBalance();
		 
	 }
	 public void suspend(){
		 
	 }
	 public void activate(){
		 
	 }
	 public void lock(){
		 
		 context.setState(context.getLockedState());
		 
	 }
	 public void withdraw(){
		 
		 context.output.MakeWithdraw();
		 context.output.NoFundsMsg();
		 
	 }
	 public void AboveMinBalance(){
		 
	 }
	 public void noFunds(){
		 
	 }
	 public void close(){
		 
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
