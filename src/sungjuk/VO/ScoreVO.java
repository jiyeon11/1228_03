package sungjuk.VO;

public class ScoreVO {
	private String stu_id; //학번
	private String stu_name; //성명
	private String grade;  //학년
	private String stu_class;  //반
	private int kor;  //국어
	private int eng;  //영어
	private int math;  //수학
	private int science; //과학
	private int total;   //총점
	private double avg;  //평균
	
	public ScoreVO() {//기본 생성자
	}
	public ScoreVO(String stu_name, String stu_id, String grade, String stu_class, int kor, int eng, int math, int science, int total, double avg) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.grade = grade;
		this.stu_class = stu_class;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.total = total;
		this.avg = avg;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total =kor+eng+science+math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = (double)total/4;
	}
}
