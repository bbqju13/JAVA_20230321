package day17;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		/*
		 * 배열에서 짝수만 출력(정렬) 중복되는 값은 삭제
		 */
		int[] arr = { 1, 3, 33, 14, 12, 6, 8, 1, 2, 12, 24 };

		Arrays.stream(arr).sorted().distinct().filter(n -> n % 2 == 0).forEach(System.out::println);

		// 짝수 배열을 생성
		int res[] = Arrays.stream(arr).distinct().filter(n -> n % 2 == 0).sorted().toArray();
		System.out.println("--------------------------------");
		for (int tmp : res) {
			System.out.print(tmp + " ");
		}
	}

}
