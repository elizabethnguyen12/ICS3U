package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class NXTMotors {

	public static void main(String[] args) {
		System.out.println("Program 1");
		Button.waitForAnyPress();
		LCD.clear();
		System.out.println("FORWARD");
		Motor.B.forward();
		Button.waitForAnyPress();
		System.out.println("BACKWARD");
		Motor.B.backward();
		Button.waitForAnyPress();
		Motor.B.stop();

	}

}
