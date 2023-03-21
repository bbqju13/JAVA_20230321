package day15;

public class student {
	/*
	 * 학생클래스: 한 학생의 정보를 나타내는 클래스 -학번, 이름, 주민번호(생년월일), 학부, 학과, 수강과목(과목클래스를 배열로 생성 5개)
	 * -수강과목의 번지를 대신할 count 변수로 나타내기(getter/setter추가) -메서드 -수강과목 추가(배열이 다 찼다면 늘려주기)
	 * -수강과목 삭제 -생성자, getter/setter, 출력메서드(print) - 2가지 형태로
	 */

	// 멤버변수 선언
	private String stdNum; // 학번
	private String stdName; // 이름
	private String birth; // 주민,생년월일
	private String faculty; // 학부
	private String major; // 학과
	private Subject[] subjectList = new Subject[5]; // 수강과목 // subject 클래스를 배열로 선언.
	private int subCount; // 수강과목 개수

	// 기본 생성자
	public student() {
	}

	// 전체 요소를 받는 생성자
	public student(String stdNum, String stdName, String birth, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.birth = birth;
		this.faculty = faculty;
		this.major = major;
	}

	// 메서드
	// print method : 학생 정보만 출력
	public void stdPrint() {
		System.out.println("학생명(학번): >" + stdName + "(" + stdNum + ")");
		System.out.println("학부(학과): >" + faculty + "(" + major + ")");
	}

	// 수강과목을 출력하는 메서드
	public void subPrint() {
		// 수강과목이 없을때
		if (subCount == 0) {
			System.out.println("수강중인 과목이 없습니다.");
		}
		// 수강과목이 있을때 : 수강과목이 여러개 있을 수 있음.
		for (int i = 0; i < subCount; i++) {
			System.out.println(subjectList[i]); // toString을 이용한 출력
			// print 메서드로 직접 sysout을 했을 경우
			// subjectList[i].print(); //subject 클래스에 print메서드가 있을 경우
		}
	}

	// 수강과목 추가
	/*
	 * 매개변수 : Subject subName 리턴타입 : void
	 */
	public void insertSubject(Subject subName) {
		// 배열이 다 찼다면 늘려주기
		if (subCount == subjectList.length) {
			// new를 이용해서 배열 생성 (신 배열을 생성)+5
			Subject[] tmp = new Subject[subjectList.length + 5]; // subCount+5 같은 의미

			// arraycopy를 이용한 배열복사
			// System.arraycopy(구배열, 시작번지, 신배열, 시작번지, 총개수)
			System.arraycopy(subjectList, 0, tmp, 0, subjectList.length); // subCount 사용해도 가능

			// 새로만든 배열로 연결
			subjectList = tmp;
		}
		// subName 추가
		subjectList[subCount] = subName;
		subCount++; // 값을 추가했기 때문에 subCount 증가
	}

	// 수강과목 삭제
	/*
	 * 매개변수 : String subName 리턴타입 : void
	 */
	public void deleteSubject(String subName) {
		int index = -1; // 찾는 과목의 위치를 나타내는 변수
		// 만약에 매개변수의 값이 null이라면 return (메서드를 빠져나감)
		if (subName == null) {
			return;
		}
		// subName을 subjectList에 있는지 검색
		for (int i = 0; i < subCount; i++) {
			if (subjectList[i].getSubName().equals(subName)) {
				// 있다면 번지를 index에 저장
				index = i;
				break;
			}
		}

		// 찾는 과목이 없다면 return
		if (index == -1) {
			System.out.println("철회할 과목이 없습니다.");
			return;
		}

		// 찾았을 경우 삭제.
		// 찾은 위치부터 뒷번지의 과목을 앞번지로 옮기는 작업.
		// subCount = 1 1과목이 있다는것을 의미 subjectList = 0 번지
		for (int i = index; i < subCount - 1; i++) {
			subjectList[i] = subjectList[i + 1];
		}

		// 마지막 번지는 null
		// ex)과목이 3개가 있다면 0 1 2
		subjectList[subCount - 1] = null;
		subCount--;

	}

	// getter/setter
	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}

	public int getSubCount() {
		return subCount;
	}

}
