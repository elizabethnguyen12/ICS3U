package nguyen;

import java.awt.Color;

import hsa_new.Console;
/**
 * HelloConsole.java
 * console intro
 * February 24th, 2017
 * @author Elizabeth Nguyen
 */
public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
		int age;
		c.setTextColor(Color.blue);
		c.println("Please enter your age.");
		age = c.readInt();
		c.println("Your age is: " +  age);
		age = age + 10;
		c.println("In ten years, your age will be " + age + ".");
		c.setColor(Color.red);
		c.fillMapleLeaf(5, 105, 100, 100);
		c.drawMapleLeaf(0, 100, 100, 100);
	}

}
