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
//1 put beeper
    putBeeper();
//2 while there is beeper, move; while no beeper, move, put beeper
	if (beepersPresent()) {
		move();
	    } else {
		move();
		putBeeper();
	}
// if front is blocked, 
// 1) if facing east, turn left
//    if there is beeper, move, turn left
//	  if no beeper, move, put beeper, turn left,repeat 2
	
// 2) if facing west, turn right
//    if there is beeper, move, turn right,move, put beeper, repeat 2
//	  if no beeper, move, put beeper, turn right,repeat 2

	
	
}
	
	
	
	
	
	
	
	
	
	
}
