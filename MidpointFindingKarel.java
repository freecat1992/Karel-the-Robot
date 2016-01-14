/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
public void run() {
//fill the row with beepers
while (frontIsClear()) {
	putBeeper();
	move();
  }
	putBeeper();
//pick beeper from the east end, pick beeper from west end, repeat
while (beepersPresent()) {
//pick the east most beeper
 //---go to the east most point where there is beeper, pick the beeper, turn around
      turnAround();
    if (beepersPresent()) {
    	pickBeeper();
    }
     while (frontIsClear()) {
    	move();
    }
	
	// pick the west most beeper
  //---go to the west most point where there is beeper, pick the beeper, turn around
	
	
	
 }



}
}
