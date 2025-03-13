package week2;

public class Productprice {

	public static void main(String[] args) {
		int so = 7;
		int price = 5700;
		//단가 = 총 금액 / 개수
		//int/int => 결과도 int
		double  ao = (double)price/so;
		System.out.printf("구매 수량:%d\n",so);
		System.out.printf("총 구매 금액:%d\n",price);
		System.out.printf("상품 단가: %.1f ",ao);
	}

}
