package com.mydomain;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class PickUpBallAndDrive implements Behavior{
	
	private boolean suppressed = false;
	//private boolean hasBall = false;
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		return true;
	}
	
	public void action(){
		//if(!hasBall){//if there is no ball
		//	Motor.A.rotate(20);//pick up ball
		//
		
		//drive forward
		Motor.C.forward();
		Motor.B.forward();
	}

}
