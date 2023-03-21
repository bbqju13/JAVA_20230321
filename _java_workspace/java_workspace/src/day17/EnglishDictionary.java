package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDictionary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		Word w = new Word();

		while (true) {
			System.out.println(">메뉴");
			System.out.println("1. 단어등록");
			System.out.println("2. 단어출력");
			System.out.println("3. 종료");

			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("단어입력 :");
				String strWord = scan.next();
				System.out.println("뜻 입력 :");
				String strMean = scan.nextLine();

				w.addWord(strWord, strMean);
			} else if (menu == 2) {
				w.printword();

			}else if(menu == 3) {
				System.out.println("-종료-");
				break;
			}else {
				System.out.println("잘못된 입력");
			}
			System.out.println();
		}

	}

}

class Word {
	private Map<String, ArrayList<String>> words = new HashMap<String, ArrayList<String>>();
	Scanner scan = new Scanner(System.in);

	public void addWord(String word, String mean) {
		if (words.containsKey(word)) {
			ArrayList<String> means = words.get(word);
			means.add(mean);
		} else {
			ArrayList<String> means = new ArrayList<String>();
			means.add(mean);
			words.put(word, means);
		}
	}

	public void printword() {
		System.out.println("-등록된 단어-");
		for (String word : words.keySet()) {
			System.out.println(word + " : " + words.get(word));
		}
	}

}
