package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * Ready Class
 */

//This class implements State class and defines the state Ready

public class Ready implements State {
	
	MDA_EFSM context = null;
	
	public Ready(MDA_EFSM context){
		
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
		 
		 context.output.IncorrectlockMsg();
		 
	 }
	 public void deposit(){
		 
		 context.output.MakeDeposit();
		 
	 }
	 public void balance(){
		 
		 context.output.DisplayBalance();
		 
	 }
	 public void suspend(){
		 
		 context.setState(context.getSuspendedState());
		 
	 }
	 public void activate(){
		 
	 }
	 public void lock(){
		 
		 context.setState(context.getLockedState());
		 
	 }
	 public void withdraw(){
		 
		 context.output.MakeWithdraw();
		 context.setState(context.getS1State());
		 
	 }
	 public void AboveMinBalance(){
		 
	 }
	 public void noFunds(){
		 
		 context.output.NoFundsMsg();
		 
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
