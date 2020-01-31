package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jackinthebox implements MouseListener {
	JFrame frame1 = new JFrame();
	int clicked = 0;
	public void start() {
		// TODO Auto-generated method stub
		JLabel label1 = new JLabel();
		JButton button1 = new JButton();
		frame1.setVisible(true);
		frame1.add(button1);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.addMouseListener(this);
		frame1.pack();
			}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.add(imageLabel);
			frame1.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		clicked += 1;
		if (clicked >= 5) {
			System.out.println("yeeeeeeeeeeeeeeeeeeee");
			showPicture("jackInTheBox.png");
			frame1.pack();
			playSound("homer-woohoo.wav");
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
}
