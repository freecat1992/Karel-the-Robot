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
		// 0) Turn to north
		turnLeft();
		if (noBeepersPresent()) {
			putBeeper();
		}
		
		// 1) Move forward until blocked, put beepers at empty slots
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
		
		// 2) Move 4 units East
		turnRight();
		for (int i=0; i<4; i++) {
			
		}
		
		// 3) Turn to south, repeat 1) - 2)
		// 4) Turn left, move 4 units East, repeat 0) - 3)
		
		
		
		/*
		turnLeft();
		 
		while (noBeepersPresent()) {
			putBeeper();
			while (beepersPresent()) {
				move();
			}
		}
		if (frontIsBlocked()){
			if (facingNorth()){
				turnRight();
				for (int i=0; i<4; i++){
				move();}
				turnRight();
			}
			if (facingSouth()){
				turnLeft();
				for (int i=0; i<4; i++){
					move();}
				turnLeft();
			}
		}
		*/
			
	
 }
}


/*private void gotoColumn(){
		if (frontIsBlocked()){
			if (facingNorth()){
				turnRight();
				for (int i=0; i<4; i++){
				move();}
				turnRight();
			}
			if (facingSouth()){
				turnLeft();
				for (int i=0; i<4; i++){
					move();}
				turnLeft();
			}
		}
	}
		
	
*/
		
		
/*finishFirstColumn();
		finishSecondColumn();
		finishThirdColumn();

	}
	private void finishFirstColumn(){
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