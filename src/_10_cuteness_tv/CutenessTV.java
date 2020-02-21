package _10_cuteness_tv;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements MouseListener {
	JButton button1;
	JButton button2;
	JButton button3;

	public void no() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		button1.setText("Rick Roll");
		button2.setText("Phrog");
		button3.setText("Suspicious");
		frame.pack();
	}

	void showSuspicious() {
		playVideo("https://www.youtube.com/watch?v=MTW4sIL9Dpw");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=VLVdjLbXdm4");
	}

	void showNothingSuspicious() {
		playVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent z) {
		// TODO Auto-generated method stub
		if (z.getSource() == button1) {
			playVideo("https://www.youtube.com/watch?v=MTW4sIL9Dpw");
		}
		if (z.getSource() == button2) {
			playVideo("https://www.youtube.com/watch?v=VLVdjLbXdm4");
		}
		if (z.getSource() == button3) {
			playVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
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
