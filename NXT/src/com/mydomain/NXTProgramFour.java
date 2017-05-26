package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class NXTProgramFour {

	public static void main(String[] args) {
		System.out.println("Program 4");

		Motor.B.rotate(-1440, true);

		while (Motor.B.isMoving()){
			Delay.msDelay(200);
			System.out.println(Motor.B.getTachoCount());
			if (Button.readButtons() > 0) {
				Motor.B.stop();
				break;
			}
		}
		System.out.println(Motor.B.getTachoCount());
		Button.waitForAnyPress();



	}

}