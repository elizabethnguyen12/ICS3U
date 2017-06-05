package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class Touch {

	public static void main(String[] args) {
		TouchSensor touch = new TouchSensor(SensorPort.S1);

		Button.waitForAnyPress();
		Motor.B.setSpeed(200);
		Motor.C.setSpeed(200);
		Motor.B.forward();
		Motor.C.forward();

		while (Motor.B.isMoving()){
			if (touch.isPressed()) {
				Motor.B.stop();
				Motor.C.stop();
				Motor.B.rotate(360);
			}

		}
		Button.waitForAnyPress();
	}
}