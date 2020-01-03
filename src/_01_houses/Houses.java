package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
int roof = 60;
int y = 60;
	public void run() {
		rob.penDown();
		rob.setSpeed(1000000000);
		rob.setX(10);
		rob.setY(600);
		rob.setPenWidth(5);
		rob.move(100);
		rob.turn(roof);
		rob.move(30);
		rob.turn(roof);
		rob.move(30);
		rob.turn(60);
		rob.move(100);
		rob.setPenColor(25, 98, 1);
		rob.turn(-90);
		rob.move(40);
		rob.turn(-90);
		rob.setPenColor(0, 0, 0);

		for (int i = 0; i < 9; i++) {
			String size = JOptionPane.showInputDialog(null, "Do you want the house to be small, medium, or large?");
			String colour = JOptionPane.showInputDialog(null,"What colour do you want the house to be? Red, orange, yellow, green, blue, or purple?");
			String roofshape = JOptionPane.showInputDialog(null, "Do you want the roof to be pointy or flat?");
			if (roofshape.equalsIgnoreCase("pointy")) {
				pointyRoof();
			}
			if (roofshape.equalsIgnoreCase("flat")) {
				flatRoof();
			}
			if (colour.equalsIgnoreCase("red")) {
				red();
			}
			if (colour.equalsIgnoreCase("orange")) {
				orange();
			}
			if (colour.equalsIgnoreCase("yellow")) {
				yellow();
			}
			if (colour.equalsIgnoreCase("green")) {
				green();
			}
			if (colour.equalsIgnoreCase("blue")) {
				blue();
			}
			if (colour.equalsIgnoreCase("purple")) {
				purple();
			}
			if (size.equalsIgnoreCase("small")) {
				makeHouseSmall();
			}
			if (size.equalsIgnoreCase("medium")) {
				makeHouseMedium();
			}
			if (size.equalsIgnoreCase("large")) {
				makeHouseLarge();
			}
		}

	}

	void makeHouseSmall() {
		rob.move(60);
		rob.turn(roof);
		rob.move(30);
		rob.turn(y);
		rob.move(30);
		rob.turn(roof);
		rob.move(60);
		rob.setPenColor(25, 98, 1);
		rob.turn(-90);
		rob.move(40);
		rob.turn(-90);
		rob.setPenColor(0, 0, 0);
	}

	void makeHouseMedium() {

		rob.move(120);
		rob.turn(roof);
		rob.move(30);
		rob.turn(y);
		rob.move(30);
		rob.turn(roof);
		rob.move(120);
		rob.setPenColor(25, 98, 1);
		rob.turn(-90);
		rob.move(40);
		rob.turn(-90);
		rob.setPenColor(0, 0, 0);
	}

	void makeHouseLarge() {

		rob.move(250);
		rob.turn(roof);
		rob.move(30);
		rob.turn(y);
		rob.move(30);
		rob.turn(roof);
		rob.move(250);
		rob.setPenColor(25, 98, 1);
		rob.turn(-90);
		rob.move(40);
		rob.turn(-90);
		rob.setPenColor(0, 0, 0);
	}

	void red() {
		rob.setPenColor(255, 0, 0);
	}

	void orange() {
		rob.setPenColor(255, 154, 3);
	}

	void yellow() {
		rob.setPenColor(255, 247, 0);
	}

	void green() {
		rob.setPenColor(0, 255, 0);
	}

	void blue() {
		rob.setPenColor(0, 0, 255);
	}

	void purple() {
		rob.setPenColor(186, 0, 255);
	}
	void pointyRoof() {
		roof = 60;
		y = 60;
	}
	void flatRoof() {
		roof = 90;
		y = 0;
	}
	}
	

