package week3;

public class productprice {

	public static void main(String[] args) {
		int milk = 4500;
		int car = 1000;
		int ga = 1500;
		int as = milk + (car * 3) + (ga * 2);
		double hal = as * 0.1;
		//25 나누긱 100
		System.out.println("할인 전 상품 가격: " + as);
		System.out.println("할인 가격:" + hal);

		double ad = as -= hal;
		System.out.println("최종 금액 : " + ad);

	}

}
