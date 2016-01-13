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
	
	// Sweep row, until end
	// end condition: 
	// front is blocked AND (left is blocked OR right is blocked) 
	while (/*end condition*/) {
		// move forward, put beepers, until front is blocked
		while (frontIsClear()) {
			putBeeper();
			move();
			move();
			// TODO: even/odd column check
		}
		
		// change direction, two conditions (left -> right, or right -> left)
		if (facingEast()) {
			turnLeft();
			move();
			turnLeft();
		} else {
			if (facingWest()) {
				turnRight();
				move();
				turnRight();
			}
		} 
		
		// TODO: check id hit ceiling
	}
	
	
	
	
	
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
			putBeeper();
		} else {
			move();
			putBeeper();
			turnLeft();
		}
	  }
	
	while (frontIsClear()) {
		if (beepersPresent()) {
		move();
	    } else {
		move();
		putBeeper();
	}
  }
	
// 2) if facing west, turn right
//    if there is beeper, move, turn right,move, put beeper, repeat 2
//	  if no beeper, move, put beeper, turn right,repeat 2
    
	if (facingWest()) {
		turnRight();
		if (beepersPresent()) {
			move();
			turnRight();
			move();
			putBeeper();
		} else {
			move();
			putBeeper();
			turnRight();
		}
	  }
	
	while (frontIsClear()) {
		if (beepersPresent()) {
		move();
	    } else {
		move();
		putBeeper();
	}
  }
	
}
	
	
	
	
	
	
	
	
	
	
}
