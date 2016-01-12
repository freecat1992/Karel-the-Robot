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
		while (frontIsClear()) {
			// Adjust direction
			// if turn-L, turn left;
			if (rightIsBlocked()) {
				turnLeft();
			}
			// else if L, turn right
			else {
				if (leftIsBlocked()) {
					turnRight();
				}
			}
			
			// Sweep a line put beepers 
			// check/put beeper 
			// While front is clear, 1) move, 2) check/put beeper	
			 if (noBeepersPresent()) {
				 putBeeper();
			 }	 
			 while (frontIsClear()) {
				 move();
				 if (noBeepersPresent()) {
					 putBeeper();	 
				 }
		
			 }

			// Shift 4 steps to East
			if (facingNorth()) {
				turnRight();	
			}
			if (facingSouth()) {
				turnLeft();
			}
			for (int i=0; i<4; i++){
				move();
			}
					
		}
		
		//while front is blocked
		//1)if  left is blocked--turn right
		//2)if right is blocked--turn left
		//3)sweep column
			if (leftIsBlocked()) {
				turnRight();
			} else {
			    if (rightIsBlocked()){
			    	turnLeft();
			    }
			}
			
			if (noBeepersPresent()) {
				 putBeeper();
			 }	 
			 while (frontIsClear()) {
				 move();
				 if (noBeepersPresent()) {
					 putBeeper();	 
				 }
			 }
			 
			 //go back to facing east
			 if (facingNorth()) {
				 turnRight();
			 } else {
				 if (facingSouth()) {
					 turnLeft();
				 }
			 }
		

	}
}
		
		
		
		
		
		
		
		
	