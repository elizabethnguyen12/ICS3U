package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class NXTProgramFive {

	public static void main(String[] args) {
		System.out.println("Program 5");
		Button.waitForAnyPress();
		LCD.clear();
		Motor.B.setSpeed(720);
		Motor.C.setSpeed(720);
		Motor.B.rotate(720, true);
		Motor.C.rotate(720, true);
		
		for (int i = 0; i<8; i++) {
			Delay.msDelay(100);
			LCD.drawInt(Motor.B.getTachoCount(), 0, i);
			LCD.drawInt(Motor.C.getTachoCount(), 4, i);
		}
		
		while(Motor.B.isMoving() || Motor.B.isMoving())
			Button.waitForAnyPress();

	}

}
