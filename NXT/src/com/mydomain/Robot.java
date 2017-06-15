package com.mydomain;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Robot {

	public static void main(String[] args) {
		Behavior b1 = new AvoidBlack();
		Behavior b2 = new PushAwayCup();
		Behavior b3 = new DropInCastle();
		Behavior b4 = new PickUpBallAndDrive();
		Behavior b5 = new Stop();

		 
		Behavior[] behaviors = {b1, b2, b3, b4, b5};
		Arbitrator arby = new Arbitrator(behaviors);  
		arby.start();

	}

}