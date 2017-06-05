package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;


public class Light {

	public static void main(String[] args) {
		
		LightSensor light = new LightSensor(SensorPort.S3);
		Button.waitForAnyPress();
		

		for (int counter = 0; counter <= 10500; counter ++) {
			light.getLightValue();
		if (light.getLightValue()<=32)
		{
			
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(200);
		Motor.B.forward();
		Motor.C.forward();
		}
		
		else 
		{
			Motor.B.stop();
		}
		
		}
		Button.waitForAnyPress();
		Motor.B.stop();
		Motor.C.stop();
	}

	}


