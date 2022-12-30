package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener {
	JButton btn1, btn2;
	JLabel lbl;
	
	public ButtonListener(JButton btn1, JButton btn2, JLabel lbl) {
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.lbl = lbl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon icon = null;
		Object btnSource = e.getSource();
		if(btnSource == btn1) {
			icon = new ImageIcon("Saved Pictures/뉴진스.jpg");
		}else if(btnSource == btn2) {
			icon = new ImageIcon("Saved Pictures/아이브.jpg");
		}else {
			icon = new ImageIcon("Saved Pictures/르세라핌.jpg");
		}
		lbl.setIcon(icon);

	}

}
