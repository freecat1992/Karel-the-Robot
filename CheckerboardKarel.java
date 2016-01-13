/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
	//put beeper at first unit
		putBeeper();
	//finish row
		while (frontIsClear()) {
			if (beepersPresent()) {
				move();
				move();
				putBeeper();
			}else {
				move();
				putBeeper();
			}
			
		}
    //change directions 
		if (facingEast()) {
			if (leftIsClear()) {
				if (beepersPresent()) {
					turnLeft();
					move();
					turnLeft();
					}
			    else {
					turnLeft();
					move();
					putBeeper();
				    turnLeft();}
			}
		} else {
			if (facingWest()) {
				if (rightIsClear()) {
					if (beepersPresent()) {
						turnRight();
						move();
						turnRight();
					} else {
						turnRight();
						move();
						putBeeper();
						turnRight();
						
					
				}
			}
		}
		
		
	}	
		
		
		
		
		
		
		
		

	}
}
		
		
		/*		// While front is clear, sweep row
		
		// Initiate (according to our defined starting state)
		putBeeper();
		
		while (frontIsClear()) {
			// Starting state: Facing to the end of the row, 
			// with beepers under feet (not always)
			
			// While front is clear, move forward put beepers
			while (frontIsClear()) {
				if (beepersPresent()) {
					move();
				} else {
					move(); 
					putBeeper();
				}
			}
			
			// If not hit ceiling, change direction, ...
			// and move to the new row
	 if (facingEast()) {
				if (leftIsClear()) { // not hit ceiling
					if (beepersPresent()) {
						turnLeft();
						move();
						turnLeft();
					} else {
						turnLeft();
						move();
						turnLeft();
						putBeeper();
					}
				}
			} else {
				if (facingWest()) {
					if (rightIsClear()) { // not hit ceiling
						if (beepersPresent()) {
							turnRight();
							move();
							turnRight();
						} else {
							turnRight();
							move();
							turnRight();
							putBeeper();
						}
					}
				}
			}
			
			// Ending state: facing to the end of the new row, 
			// with beeper under feet (not always)
		}
	}
*/
	
	
/*	
public void run1() {
	
//1 put beeper
    putBeeper();
//2 while there is beeper, move; while no beeper, move, put beeper

		while (frontIsClear()) {
		if (beepersPresent()) {
		move();
	    } else {
		move();
		putBeeper();
	}
  }

// if front is blocked, 
// 1) if facing east, turn left
//    if there is beeper, move, turn left,move, put beeper, repeat 2
//	  if no beeper, move, put beeper, turn left,repeat 2
	if (facingEast()) {
		turnLeft();
		if (beepersPresent()) {
			move();
			turnLeft();
			move();
			putBeeper();}
	    else {
			move();
			putBeeper();
		    turnLeft();}
	  }

	
// 2) if facing west, turn right
//    if there is beeper, move, turn right,move, put beeper, repeat 2
//	  if no beeper, move, put beeper, turn right,repeat 2
    
	if (facingWest()) {
		turnRight();
		if (beepersPresent()) {
			move();
			turnRight();
		} else {
			move();
			putBeeper();
			turnRight();
	   }
	  }
	}
	*/

	
	
	
	
	
	
	
	
	
	
