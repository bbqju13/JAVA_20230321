package product;

import java.util.Scanner;

public interface ProductInterface {
	
	void add(Scanner scan);
	void printProduct();
	void orderPick(String name, int count);
	void printOrder();
	void delete(Scanner scan); //메뉴삭제
	void update(Scanner scan); //메뉴수정 - 가격수정

}
