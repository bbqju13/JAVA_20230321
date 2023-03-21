package day15;

import java.util.Scanner;

public interface Program {
	/*
	 * 1. 학생 리스트 출력 2. 학생 등록 3. 학생 검색 4. 수강 신청 5, 수강 철회
	 */

	void printStudent(); // 학생 전체 리스트

	void insertStudent(Scanner scan); // 스캐너로 입력 받기

	void searchStudent(Scanner scan);

	void registerSubject(Scanner scan);

	void deleteSubject(Scanner scan);
}
/*
 * 수강 관리 프로그램-배열을 이용
 * 
 * interface - program 1. 학생 리스트 출력 2. 학생 등록 3. 학생 검색 4. 수강 신청 5, 수강 철회
 * 
 * class - subject(별도생성) 과목클래스: 한 과목의 정보를 나타내는 클래스(수학 과목코드1, 과학 과목코드2, 국어 과목코드3,
 * 영어 과목코드4) -과목코드, 과목명, 학점, 시수, 교수명, 학기, 분류, 수업시간표
 * 
 * class - student(별도생성) 학생클래스: 한 학생의 정보를 나타내는 클래스 -학번, 이름, 주민번호(생년월일), 학부, 학과,
 * 수강과목(과목클래스를 배열로 생성 5개) -수강과목의 번지를 대신할 count 변수로 나타내기(getter/setter추가) -메서드
 * -수강과목 추가(배열이 다 찼다면 늘려주기) -수강과목 삭제
 * 
 * class - studentManager 인터페이스 구현 interface - program 1. 학생 리스트 출력 2. 학생 등록 3.
 * 학생 검색 4. 수강 신청(수강과목 추가 메서드) 5, 수강 철회(수강과목 삭제 메서드)
 * 
 * class -main -메뉴구성 1.학생등록 2.학생확인(학생리스트) 3.학생검색(한 학생의 정보가 출력-학생정보와 수강정보 같이 출력)
 * 4.수강신청 5.수강철회 6.종료
 */
