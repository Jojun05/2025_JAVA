package week3;

public class price {

	public static void main(String[] args) {
		double rate = 25;

		int m_cnt = 1;
		int m_price = 4500;

		int c_cnt = 3;
		int c_price = 1000;

		int s_cnt = 2;
		int s_price = 1500;

		int m_total = m_cnt * m_price;
		int c_total = c_cnt * c_price;
		int f_total = s_cnt * s_price;

		int total = m_total + c_total + f_total;
		System.out.println("할인 전 상품 가격 : " + total + "원");

		double discount = (m_total + f_total) * (rate / 100);
		double final_price = total - discount;

		System.out.println("할인 금액 : " + discount + "원");
		System.out.println("최종 결제 금액 : " + final_price + "원");
	}
}
