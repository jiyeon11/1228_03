package sungjuk.VO;

import java.util.ArrayList;

public class ScoreDAO {

	ArrayList<ScoreVO> svoList = new ArrayList<ScoreVO>();
	
	public void delete(int row) {
		svoList.remove(row);
	}
	public void insert(ScoreVO svo) {
		svoList.add(svo);
	}
	public ArrayList select() {
		return svoList;
	}
}
