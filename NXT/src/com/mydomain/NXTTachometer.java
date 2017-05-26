package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class NXTTachometer {

	public static void main(String[] args) {
		System.out.println("Program 2");
		Button.waitForAnyPress();
		Motor.B.forward();
		Motor.B.setSpeed(720);
		Delay.msDelay(2000);
		System.out.println(Motor.B.getTachoCount());
		Motor.B.stop();
		Delay.msDelay(2000);
		while (Motor.B.getTachoCount() > 0) {
			Motor.B.backward();
		}
		System.out.println(Motor.B.getTachoCount());
		Motor.B.stop();
		System.out.println(Motor.B.getTachoCount());
		Delay.msDelay(5000);
	}

}
