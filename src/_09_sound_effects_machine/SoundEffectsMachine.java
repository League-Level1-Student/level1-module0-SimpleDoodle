package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener, MouseListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public void start() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		frame.pack();
		button1.setText("Saw");
		button2.setText("Yoda");
		button3.setText("Error");
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String woodsaw = "sawing-wood-daniel_simon.wav";
		if (e.getSource() == button1) {
			playSound(woodsaw);
		}
		String Yoda = "Yoda-KevanGC-1045432419.wav";
		if (e.getSource() == button2) {
			playSound(Yoda);
		}
		String error ="Computer Error-SoundBible.com-1655839472.wav";
		if (e.getSource()==button3) {
			playSound(error);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
