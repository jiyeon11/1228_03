package sungjuk.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import sungjuk.VO.ScoreDAO;
import sungjuk.VO.ScoreVO;
import sungjuk.view.scoreView;

public class ScoreController extends JFrame{
	ScoreDAO dao;
	ArrayList<ScoreVO> scoreVOList;
	scoreView view;
	JTable table;
	
	public ScoreController() {
		dao = new ScoreDAO();
		view = new scoreView();
		scoreVOList = dao.select();
		view.setScoreVOList(scoreVOList);
		view.initView();
		JButton buttonAdd = view.getButtonAdd();
		buttonAdd.addActionListener(buttonAddL);
		table = view.getTable();
		table.addMouseListener(tableL);
		add(view,"Center");
		setTitle("성적처리프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200,200);
		setSize(600,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ScoreController();
	}
	ActionListener buttonAddL = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			ScoreVO vo = view.neededInsertData();
			dao.insert(vo);
			scoreVOList = dao.select();
			view.setScoreVOList(scoreVOList);
			view.putResult();
			view.initInsertData();
		}
	};
	
	MouseAdapter tableL = new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			int state = 1;
			//마우스 클릭 횟수 카운트
			if(e.getClickCount() == 2) {//더블클릭하면                              //메세지          타이틀
				state = JOptionPane.showConfirmDialog(ScoreController.this, "정말 삭제하시겠습니까?","삭제 여부",JOptionPane.YES_NO_OPTION);
				if(state == JOptionPane.YES_OPTION) {
					dao.delete(table.getSelectedRow());
					scoreVOList = dao.select();
					view.setScoreVOList(scoreVOList);
					view.putResult();
				}
			}
		}
	};
}
