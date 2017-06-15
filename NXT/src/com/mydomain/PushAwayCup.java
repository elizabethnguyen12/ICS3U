package com.mydomain;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class PushAwayCup implements Behavior{

	private boolean suppressed = false;
	private UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S4); 
	private double lengthOfRobot = 15; //replace 0 with length of robot

	public void suppress(){
		suppressed = true;
	}

	public boolean takeControl(){
		if(ultra.getDistance() <= lengthOfRobot + 3){//checks if something is 3 cm in front of robot
			return true;
		}
		return false;
	}

	public void action(){

		//turn slightly to avoid cup
		Motor.C.rotate(45);
		Motor.B.rotate(-45);
		
		//move up to prepare to push out of way
		Motor.C.rotate(360, true);
		Motor.C.rotate(360);
		
		//turn back an push cup out of the way
		Motor.C.rotate(-45);
		Motor.B.rotate(45);
	}
}
