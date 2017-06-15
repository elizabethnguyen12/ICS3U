package com.mydomain;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior{
	
	@Override
public boolean takeControl() {
		if (Button.ESCAPE.isDown()) {
			return true;
		}
		return false;
	}
	
	//exits the program
	@Override
	public void action() {
		System.exit(0);

	}
	//action is  never suppressed
	@Override
	public void suppress() {
		
	}

}
