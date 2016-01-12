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
	
//1 put a beeper at the starting unit
	putBeeper();
//2  while front is clear, move, move, put beeper
	while (frontIsClear()) {
		move();
		move();
		putBeeper();
	}
// if front is blocked, 
// 1) if facing east, turn left
//    if there is beeper, move, turn left,move, put beeper, repeat 2
//	  if no beeper, move, put beeper, turn left,repeat 2
	while (frontIsBlocked()) {
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
}
// 2) if facing west, turn right
//    if there is beeper, move, turn right,move, put beeper, repeat 2
//	  if no beeper, move, put beeper, turn right,repeat 2

	
	
}
	
	
	
	
	
	
	
	
	
	
}
