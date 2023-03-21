package day17;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/* 문자열(이름)을 담는 리스트 생성 후, 스트림으로 생성
		 * 정렬하여 출력
		 * */
		
		ArrayList<String> word = new ArrayList<String>();
		word.add("마");
		word.add("자자자자자");
		word.add("하");
		word.add("카카카카카카카");
		word.add("가가가");
		word.add("다다");
		word.add("파파파파");
		
		Stream<String> w = word.stream();
		w.sorted().forEach(s->System.out.println(s));
		System.out.println();
		word.stream().sorted().forEach(s->System.out.println(s));
		
		//글자가 5글자 이상인 이름만 출력
		System.out.println("====================");
		word.stream().filter(b->b.length()>=5).forEach(System.out::println);
		
		//각자 이름의 글자수를 출력
		System.out.println("=========================");
		word.stream().map(n->n.length()).forEach(System.out::println);
	}

}
