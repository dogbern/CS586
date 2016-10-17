package statePatternImp;
//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * MDA_EFSM Class - Context class for state pattern Implementation
 */

//This class uses the State class to capture platform independent behavior


import abstractFactoryPatternImp.*;
import output.OutputProcessor;

public class MDA_EFSM {
	
	State state = null;
	
	State start = new Start(this);
	State idle = new Idle(this);
	State checkPin = new CheckPin(this);
	State ready = new Ready(this);
	State suspend = new Suspended(this);
	State s1 = new S1(this);
	State lock = new Locked(this);
	State overdrawn = new Overdrawn(this);
	State close = new Close(this);
	
	int attempts;
	
	OutputProcessor output = null; //initialization of OuputProcessor
	AbstractFactory af = null;  //initialization of the AbstractFactory

   public MDA_EFSM(AbstractFactory af, OutputProcessor output){
	      state = start;
	      attempts = 0;
	      this.af = af;
	      this.output = output;
	   }
	
   public void setState(State state){ //Sets State
	      this.state = state;		
	   }

   public State getState(){ //Gets State
	      return state;
	   }
   public State getIdleState(){ //gets idle state
	   return idle; 
   }
   
   public State getCheckpinState(){ //gets checkpin State
	   return checkPin;
   }
   
   public State getReadyState(){ //gets Ready State
	   return ready;
   }
   
   public State getSuspendedState(){ //gets Suspended State
	   return suspend;
   }
   
   public State getS1State(){ //gets S1 State
	   return s1;
   }
   
   public State getLockedState(){ //gets Locked State
	   return lock;
	   
   }
   
   public State getOverdrawnState(){ //Gets overdrawnState
	   return overdrawn;
   }
   
   public State getCloseState(){ //gets Close State
	   
	   return close;
   }
   
   //These operations define the MDA-EFSM Events
   public void open(){
		
		state.open();
		displayState();
	}
	
	public void login(){
		state.login();
		displayState();
		
	}
	
	public void IncorrectLogin(){
		state.incorrectLogin();
		displayState();
	}
	
	public void incorrectLogin(){
		state.incorrectLogin();
		displayState();
	}
	public void incorrectPin(int max){
		state.incorrectPin(max);
		displayState();
	}
	public void correctPinBelowMin(){
		state.correctPinBelowMin();
		displayState();
		
	}
	public void correctPinAboveMin(){
		state.correctPinAboveMin();
		displayState();
	}
	public void deposit(){
		state.deposit();
		displayState();
	}
	public void belowMinBalance(){
		state.BelowMinBalance();
		displayState();
	}
	public void aboveMinBalance(){
		state.AboveMinBalance();
		displayState();
	}
	public void logout(){
		state.logout();
		displayState();
	}
	public void balance(){
		state.balance();
		displayState();
	}
	public void withdraw(){
		state.withdraw();
		displayState();
	}
	public void withdrawBelowMinBalance(){
		state.withdrawBelowMinBalance();
		displayState();
	}
	public void noFunds(){
		state.noFunds();
		displayState();
	}
	public void lock(){
		state.lock();
		displayState();
	}
	public void incorrectLock(){
		state.incorrectLock();
		displayState();
	}
	public void unlock(){
		state.unLock();
		displayState();
	}
	public void incorrectUnlock(){
		state.incorrectUnlock();
		displayState();
	}
	public void suspend(){
		state.suspend();
		displayState();
	}
	public void activate(){
		state.activate();
		displayState();
	}
	public void close(){
		state.close();
		displayState();
		
	}
	
	public void displayState(){ // for displaying current state
		//test purposes
		
	
		System.out.println("\n" +"**********Current State: " +state.getClass().getName() +"******************");
		
	}
	

}
