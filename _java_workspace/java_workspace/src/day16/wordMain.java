package day16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class wordMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		wordBook wb = new wordBook();
		

		System.out.println("= 단어장 =");
		while (true) {
			System.out.println("1. 단어 추가");
			System.out.println("2. 단어 출력");
			System.out.println("3. 단어 검색");
			System.out.println("4. 단어 수정");
			System.out.println("5. 단어 삭제");
			System.out.println("6. 단어 파일");
			System.out.println("7. 종료");
			System.out.println("> 선택");

			int menu = scan.nextInt();
			scan.nextLine();
			
			FileWriter fw = new FileWriter("out.txt");
			

			switch (menu) {
			case 1:
				System.out.println("추가할 단어 입력 :");
				String newWord = scan.next();
				System.out.println("단어 뜻 입력 :");
				String newMean = scan.next();
				wb.addWord(newWord, newMean);
				break;
			case 2:
				wb.printWordBook();
				break;
			case 3:
				System.out.println("검색할 단어 입력 :");
				String searchWord = scan.next();
				wb.searchWord(searchWord);
				break;
			case 4:
				System.out.println("틀린 단어 입력 :");
				String fixWord = scan.next();
				System.out.println("수정할 단어 :");
				String newWord1 = scan.next();
				wb.fixWord(fixWord, newWord1);
				break;
			case 5:
				System.out.println("삭제할 단어 입력 :");
				String delete = scan.next();
				wb.deleteWord(delete);
				break;
			case 6:
				System.out.println("파일저장");
				wb.saveFile();
				
				break;
			case 7:
				System.out.println("= 종료 =");
				break;
			default:
				System.out.println("메뉴를 다시 선택해");
			}
		}

	}
}