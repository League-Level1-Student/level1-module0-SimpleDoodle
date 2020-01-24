package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Button clicked");
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 1) {
JOptionPane.showMessageDialog(null, "no");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "yes");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "bruh");
		} else {
			JOptionPane.showMessageDialog(null, "go away");
		}

	}
}
