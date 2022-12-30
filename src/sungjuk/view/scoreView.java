package sungjuk.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import sungjuk.VO.ScoreVO;

public class scoreView extends JPanel{
	JTable table;
	DefaultTableModel model;
	ArrayList<ScoreVO> scoreVOList;
	String[] header = {"성명","학번","학년","반","국어","영어","수학","과학","총점","평균"};
	JPanel panS;
	JLabel[] lbls = new JLabel[header.length-2];
	JTextField[] textField = new JTextField[header.length-2]; //얘로 입력받음
	JButton buttonAdd = new JButton("성적추가");
	
	public scoreView() {
		//JPanel은 기본 배치관리자가 FlowLayout임. 그래서 BorderLayout으로 setLayout해줌.
		setLayout(new BorderLayout());
		panS = new JPanel();
		panS.setLayout(new GridLayout(5,4));//
		
		for(int i = 0; i<header.length-2; i++) { //입력칸
			lbls[i] = new JLabel(header[i]);  //헤더넣어서 label만들고
			panS.add(lbls[i]);            //패널에 추가
			textField[i] = new JTextField(); //텍스트필드 만듦
			panS.add(textField[i]);  //텍필도 패널에 추가
		}
		
		for(int i = 0; i<3; i++) {
			panS.add(new JLabel(""));
		}
		panS.add(buttonAdd);
	}
	public void initView() {
		model = new DefaultTableModel(header, scoreVOList.size()) {
			@Override
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		table = new JTable(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);//성명
		table.getColumnModel().getColumn(1).setPreferredWidth(50);//학번
		table.getColumnModel().getColumn(2).setPreferredWidth(50);//학년
		table.getColumnModel().getColumn(3).setPreferredWidth(50);//반
		table.getColumnModel().getColumn(4).setPreferredWidth(50);//국어
		table.getColumnModel().getColumn(5).setPreferredWidth(50);//영어
		table.getColumnModel().getColumn(6).setPreferredWidth(50);//수학
		table.getColumnModel().getColumn(7).setPreferredWidth(50);//과학
		table.getColumnModel().getColumn(8).setPreferredWidth(50);//총점
		table.getColumnModel().getColumn(9).setPreferredWidth(50);//평균
		
		JScrollPane scroll = new JScrollPane(table);
		
		putResult();
		
		add("Center",scroll);
		add("South",panS);
	}
	
	public void putResult() {
		//model의 행 개수 설정
		model.setRowCount(scoreVOList.size());
		ScoreVO vo = null;
		for(int i = 0; i<scoreVOList.size(); i++) {
			vo = scoreVOList.get(i);
			model.setValueAt(vo.getStu_name(), i, 0);
			model.setValueAt(vo.getStu_id(), i, 1);
			model.setValueAt(vo.getGrade(), i, 2);
			model.setValueAt(vo.getStu_class(), i, 3);
			model.setValueAt(vo.getKor(), i, 4);
			model.setValueAt(vo.getEng(), i, 5);
			model.setValueAt(vo.getMath(), i, 6);
			model.setValueAt(vo.getScience(), i, 7);
			model.setValueAt(vo.getTotal(), i, 8);
			model.setValueAt(vo.getAvg(), i, 9);
		}
	}
	
	public void setScoreVOList(ArrayList<ScoreVO> scoreVOList) {
		this.scoreVOList = scoreVOList;
	}
	
	public JButton getButtonAdd() {
		return buttonAdd;
	}
	
	public ScoreVO neededInsertData() {
		ScoreVO vo = new ScoreVO();
		vo.setStu_name((textField[0].getText()));
		vo.setStu_id((textField[1].getText()));
		vo.setGrade((textField[2].getText()));
		vo.setStu_class((textField[3].getText()));
		vo.setKor((Integer.parseInt(textField[4].getText())));
		vo.setEng((Integer.parseInt(textField[5].getText())));
		vo.setMath((Integer.parseInt(textField[6].getText())));
		vo.setScience((Integer.parseInt(textField[7].getText())));
		vo.setTotal(vo.getTotal());
		vo.setAvg(vo.getAvg());
		return vo;
	}
	public void initInsertData() { //아마도 초기화 시키는 메서드인듯함...아마도?
		for(int i = 0; i<textField.length; i++) {
			textField[i].setText("");
		}
	}
	public JTable getTable() {
		return table;
	}
}
