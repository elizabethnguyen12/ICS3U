package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class NXTProgramThree {

	public static void main(String[] args) {
		System.out.println("Program 3");
		Motor.B.rotate(1440);
		System.out.println(Motor.B.getTachoCount());
		Motor.B.stop();
		
		Motor.B.rotateTo(0);
		System.out.println(Motor.B.getTachoCount());
		Button.waitForAnyPress();
		
		//prints out ram1 but rest is done
	}

}
