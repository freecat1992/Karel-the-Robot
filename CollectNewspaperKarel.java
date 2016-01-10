/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		gotoDoor();
		pickBeeper();
		goBack();
		
	}
	/*go to the place where the beeper is */
	private void gotoDoor(){
		if (frontIsClear()){
			move();
			move();
		} else {
			turnRight();
			move();
		}
		if (leftIsClear()){
			turnLeft();
			move();
		}
	}
	
	private void goBack(){
		turnAround();
		move();
		turnRight();
		moveBack();
	}
	
	private void moveBack(){
		if (frontIsClear()){
			move();
		}else {
			turnLeft();
			move();
		}
	}
	
}
