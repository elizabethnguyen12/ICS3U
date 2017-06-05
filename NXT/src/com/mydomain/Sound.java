package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.util.Delay;

public class Sound {

	public static void main(String[] args) {
		SoundSensor sound = new SoundSensor (SensorPort.S2, true);
		Button.waitForAnyPress();
		sound.setDBA(true);
		Motor.B.forward();
		Motor.C.forward();

		while (Motor.B.isMoving()){
			while (sound.readValue() >= 10) {
				Motor.B.rotate(360);
				System.out.println(sound.readValue());
			}


			Motor.B.forward();
			Motor.C.forward();
			System.out.println(sound.readValue());



		}
		Button.waitForAnyPress();

	}
}
