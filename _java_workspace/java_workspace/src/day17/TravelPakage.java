package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TravelPakage {

	public static void main(String[] args) {

		ArrayList<Travel> list = new ArrayList<Travel>();
		list.add(new Travel("이순신", 40));
		list.add(new Travel("이아가", 10));
		list.add(new Travel("홍길동", 35));

		int total = list.stream().mapToInt(Travel::getMoney).sum();

		System.out.println("-고객정보-");
		list.stream().forEach(t -> System.out.println(t.toString()));
		System.out.println("총 여행비용 :" + total);

		// 20세 이상 성인만 이름을 정렬하여 출력
		System.out.println("20세 이상");
		list.stream().filter(t -> t.getAge() >= 20).sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
				.forEach(n -> {
					String name = n.getName();
					int age = n.getAge();
					int money = n.getMoney();
					System.out.println(name + " " + age + " " + money);
				});

	}

}
