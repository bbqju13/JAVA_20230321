package day15;

public class Subject {

	/*
	 * 과목클래스: 한 과목의 정보를 나타내는 클래스(수학 과목코드1, 과학 과목코드2, 국어 과목코드3, 영어 과목코드4) -과목코드, 과목명,
	 * 학점, 시수, 교수명, 학기, 분류, 수업시간표 -멤버변수 선언, 생성자, getter/setter, 그외 필요한
	 * toString(print 메서드)
	 */

	// 멤버변수 선언 - 일반적으로 private 으로 선언

	private String subCode; // 과목코드 //기본값 = null
	private String subName; // 과목명
	private double subCredite; // 학점
	private int subTime; // 시수
	private String subProfessor; // 교수명
	private String subSemester; // 학기
	private String subCategory; // 분류
	private String subScheduler; // 수업시간표

	// 생성자: 객체를 생성할때 기본으로 setting 하고자 하는 값을 미리 입력받아서 객체를 생성
	// 생성자는 기본 아무것도 없는 값을 가지고 있음. => 생성자를 추가하지 않는다면 자동 생성.
	// 추가 생성자를 만든다면 기본 생성자는 사라짐.(자동 생성하지 않음 => 직접 만들어야함.)

	public Subject() {
	} // 기본 생성자.
	
	public Subject(String subName, String subProfessor) {
		this.subName=subName;
		this.subProfessor=subProfessor;
	}

	// 과목명만 받는 생성자
	public Subject(String subName) {
		this.subName = subName;
	}

	// 과목코드 과목명 학점만 받는 생성자
	public Subject(String subCode, String subName, double subCredite) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
	}

	// 전체 데이터를 받는 생성자.
	public Subject(String subCode, String subName, double subCredite, int subTime, String subProfessor,
			String subSemester, String subCategory, String subScheduler) {
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}

	// getter/setter
	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public double getSubCredite() {
		return subCredite;
	}

	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}

	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester + ", subCategory="
				+ subCategory + ", subScheduler=" + subScheduler + "]";
	}

}
