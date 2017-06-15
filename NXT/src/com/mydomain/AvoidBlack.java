package com.mydomain;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class AvoidBlack implements Behavior{
	
	private boolean suppressed = false;
	private LightSensor light = new LightSensor(SensorPort.S3);

	public void suppress(){
		suppressed = true;
	}

	public boolean takeControl(){
		if(light.getLightValue() <= 30){//check if ground is black
			return true;
		}
		return false;
	}

	public void action(){

		while(light.getLightValue() <= 30)//while ground is black
		
		//turn right
		Motor.A.rotate(90,true);
		Motor.B.rotate(-90);
		
		//move slightly away from original position
		Motor.A.rotate(360);
		Motor.B.rotate(360);
		
		//turn back
		Motor.A.rotate(-90,true);
		Motor.B.rotate(90);
		
	}
}