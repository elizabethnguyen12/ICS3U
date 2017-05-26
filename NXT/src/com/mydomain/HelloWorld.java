package com.mydomain;

import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Sound;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
        //Button.waitForAnyPress();
		
		for (int i=0; i<=10; i++){
        Sound.beepSequence();
        Sound.beepSequenceUp();
		}
		for (int j=0; j<=10; j++){
        Sound.buzz();
        Sound.twoBeeps();
		}
		
        Motor.B.setSpeed(720);// 2 RPM
        Motor.C.setSpeed(720);
        Motor.B.forward();
        Motor.C.forward();
        //Thread.sleep (1000);
        Motor.B.stop();
        Motor.C.stop();
        Motor.B.rotateTo( 360);
        Motor.B.rotate(-720,true);
        while(Motor.B.isMoving() )Thread.yield();
        int angle = Motor.B.getTachoCount(); // should be -360
        LCD.drawInt(angle,0,0);


	}

}
