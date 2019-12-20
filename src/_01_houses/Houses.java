package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	public void run() {
		rob.penDown();
		rob.setSpeed(10);
		rob.setX(10);
		rob.setY(600);
		rob.setPenWidth(5);
		JOptionPane.showInputDialog(null, "Do you want the house to be small, medium, or large?");
		if (0 == 0) {
			rob.move(100);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(100);
		}

	}
	void makeHouseSmall(String size){
		if (0==0) {
			rob.move(60);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(60);
		}
		}
	void makeHouseMedium(String size){
		if (0==0) {
			rob.move(120);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(120);
		}
		}
	void makeHouseLarge(String size){
		if (0==0) {
			rob.move(250);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(30);
			rob.turn(60);
			rob.move(250);
		}
		}

}
