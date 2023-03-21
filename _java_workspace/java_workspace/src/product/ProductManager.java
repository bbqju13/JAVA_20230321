package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements ProductInterface {

//	private ArrayList<Product> productList;
//	private ArrayList<Product> orderList;
//
//	public ProductManager() {
//		productList = new ArrayList<Product>();
//		orderList = new ArrayList<Product>();
//
//	}
//
//	public void addProduct(String menu, int price) {
//		Product newProduct = new Product(menu, price);
//		productList.add(newProduct);
//		orderList.add(newProduct);
//
//	}
//
//	public void printProductList() {
//		for (int i = 0; i < productList.size(); i++) {
//			Product product = productList.get(i);
//			System.out.println((i + 1) + "/" + product.getMenu() + " - " + product.getPrice() + "원");
//		}
//	}
//
//	public void orderProduct(String menu, int count) {
//		for (Product product : productList) {
//			if (product.getMenu().equals(menu)) {
//				Product orderProduct = new Product(menu, product.getPrice() * count);
//				orderList.add(orderProduct);
//				break;
//			}
//		}
//	}
//
//	public void printOrderList() {
//		int totalPrice = 0;
//		for (int i = 0; i < orderList.size(); i++) {
//			Product product = orderList.get(i);
//			System.out.println((i + 1) + "/" + product.getMenu() + " - " + product.getPrice() + "원");
//			totalPrice += product.getPrice();
//		}
//		System.out.println("총금액 : " + totalPrice + " 원");
//	}
	private ArrayList<Product> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();

	public void addMenu() { // 기본메뉴

		menu.add(new Product("햄버거", 15000));
		menu.add(new Product("피자", 20000));
		menu.add(new Product("음료", 2000));
		menu.add(new Product("과자", 1000));
		menu.add(new Product("사탕", 500));
	}

	@Override
	public void add(Scanner scan) {
		System.out.println("추가할 메뉴를 입력하세요.");
		String menu = scan.next();
		System.out.println("메뉴의 가격을 입력하세요.");
		int price = scan.nextInt();
		this.menu.add(new Product(menu, price));
	}

	@Override
	public void printProduct() {
		System.out.println("----menu----");
		for (Product p : menu) {

			System.out.println(p); // p = Product 클래스의 toString 호출

			// 메서드로 print를 만들어 놓은 경우
			// p.메서드명();
		}
		System.out.println("------------");

	}

	@Override
	public void orderPick(String name, int count) { // 메뉴명, 개수
		// 매개변수로 입력받을 경우 scan 으로 입력받으면 됨.
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMenu().equals(name)) {
				int price = menu.get(i).getPrice();
				Order order = new Order(); // 주문 객체
				order.setMenu(name);
				order.setPrice(price);
				order.setCount(count);
				order.setTotal(price * count);
				this.order.add(order);
			}
		}

	}

	@Override
	public void printOrder() {
		int sum = 0;
		System.out.println("----주문내역----");
		for (int i = 0; i < order.size(); i++) {
			order.get(i).print();
			sum += order.get(i).getTotal();
		}
		System.out.println("--------------");
		System.out.println("지불하실 총 금액 :" + sum);

	}

	@Override
	// 메뉴 삭제
	public void delete(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("삭제할 메뉴: ");
		String menu1 = scan.next();
//		int index=-1;
		// menu List에서 menu를 찾아서 remove
		// remove(index), remove(object)
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMenu().equals(menu1)) {
//				index=i; // 메뉴의 위치 추출
				menu.remove(i);
				System.out.println("해당 제품 삭제 완료");
				return;
			}
		}
//		if(index==-1){
//		System.out.println("찾는메뉴가 없습니다");
		System.out.println("해당 제품이 없음");
	}

	@Override
	public void update(Scanner scan) { // 가격수정
		// TODO Auto-generated method stub
		System.out.println("가격 수정할 메뉴: ");
		String menu1 = scan.next();

		for (Product product : menu) {
			if (product.getMenu().equals(menu1)) {
				System.out.println("해당메뉴의 가격 수정 : " + menu1);
				int price = scan.nextInt();
				product.setPrice(price);
				System.out.println("수정된 가격 : " + price + "원");
				return;
			}

		}
		System.out.println("=오류=");
		
//		System.out.println("가격");
//		int price=scan.nextInt();
//		int index = -1;
//		
//		for(int i=0; i<menu.size(); i++) {
//			if(menu.get(i).getMenu().equals(menu1)) {
//				menu.get(i).setPrice(price);
//				System.out.println("수정완료");
//				return;
//				
//			}
//		}
//		if(index==-1) {
//			System.out.println("메뉴를 찾을수없음");
//		}

	}

}
