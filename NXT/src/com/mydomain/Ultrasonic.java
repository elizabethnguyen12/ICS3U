package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class Ultrasonic {

	public static void main(String[] args) {
		UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
		System.out.println("Press button to start.");
		Button.waitForAnyPress();
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(200);
		Motor.B.forward();
		Motor.C.forward();
		sonar.continuous();
		sonar.getDistance();
		
		while (sonar.getDistance() > 20) {
			Motor.B.forward();
			Motor.C.forward();
		}
		
		Motor.B.backward();
		Motor.C.backward();
		
		Button.waitForAnyPress();
		Motor.B.stop();
		Motor.C.stop();
	}

}
