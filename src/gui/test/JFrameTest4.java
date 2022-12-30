package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//3. Anonymouse(익명) 클래스로 ActionListener를 구현
public class JFrameTest4 extends JFrame {
	ImageIcon icon = new ImageIcon("Saved Pictures/강해린.jpg");
	JLabel lbl = new JLabel(icon, JLabel.CENTER);
	JButton btn1 = new JButton("뉴진스");
	JButton btn2 = new JButton("아이브");
	JButton btn3 = new JButton("르세라핌");
	public JFrameTest4() {
		JPanel pan = new JPanel();
		
		btn1.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
		btn3.addActionListener(btnListener);
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		add(pan, "North");
		
		add(lbl,"Center");
		setTitle("JFrame 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(800,800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameTest4();

	}
	
	ActionListener btnListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
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
	
	};

}
