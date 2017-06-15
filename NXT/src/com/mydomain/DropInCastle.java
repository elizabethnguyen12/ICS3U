package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class DropInCastle implements Behavior{

	private boolean suppressed = false;
	private LightSensor light = new LightSensor(SensorPort.S3);


	public void suppress(){
		suppressed = true;
	}

	public boolean takeControl(){
		if(light.getLightValue() <= 40){ //check if ground is grey (might need to mess with the number)
			return true;
		}
		return false;
	}

	public void action(){
		
		//stop driving
		Motor.C.stop();
		Motor.B.stop();
		
		Motor.A.rotate(-20); //drop ball
		
		
	}
}
