/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run(){
		
		// Repeat the period until goal
		while (true) {
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		/*
		// Repeat the period until goal (front and left are blocked)
		// Finish a single period:
		// 0) Turn to north
		turnLeft();
			
		// 1) Move forward until blocked, put beepers at empty slots
		 if (noBeepersPresent()) {
			 putBeeper();
		 } else {
			 move();
		 }
		 while (frontIsClear()) {
			 move();
			 if (noBeepersPresent()) {
				 putBeeper();	 
			 }
	
		 }
	
	
		
		// 2) Move 4 units East
	    turnRight();
	    for (int i=0; i<4; i++){
			move();
			}
		
			
			// 3) Turn to south, repeat 1)
	    turnRight();
	    if (noBeepersPresent()) {
			 putBeeper();
		 } else {
			 move();
		 }
		 while (frontIsClear()) {
			 move();
			 if (noBeepersPresent()) {
				 putBeeper();	 
			 }
	
		 }
	    		
			// 4) Move 4 units East
		 turnLeft();
		 for (int i=0; i<4; i++){
				move();
				}
	
	*/	 		 
	}	    

	}

/*
		turnLeft();
		while (noBeepersPresent()){
			putBeeper();
			while (beepersPresent()){
				move();
		if (frontIsBlocked()){
			turnRight();
		for (int i=0; i<4; i++){
					move();
					}
		if (leftIsBlocked()){
			  turnRight();
		  }
			}
		}
	  }
	}
	
  
	private void finishSecondColumn(){
	  
		   while (noBeepersPresent()){
				putBeeper();
				while (beepersPresent()){
					move();
			if (frontIsBlocked()){
				turnLeft();
			for (int i=0; i<4; i++){
						move();
						}
			if (rightIsBlocked()){
				  turnLeft();
			  }
				}
			}
		  }
	  
	}
	
	private void finishThirdColumn(){
	    
		 while (noBeepersPresent()){
				putBeeper();
				while (beepersPresent()){
					move();
		
	    }
      }
	}
}*/