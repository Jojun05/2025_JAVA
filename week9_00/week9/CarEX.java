package week9;

public class CarEX {
	public static void main(String[] args) {

		Car mycar = new Car();
		// private은 외뷰에서 접근 불가
		// mycar.company = "현대자동차";

		// setter()이용
		mycar.setCompany("현대자동차");
		mycar.setCompany("그랜저");
		mycar.setCompany("기아");
		// getter()이용
		System.out.println(mycar.getCompany());
		System.out.println(mycar.getColor());
		System.out.println(mycar.getMaxspeed());
	}
}
