package week7;

public class CarEX {

	public static void main(String[] args) {
		// 객체 생성
		// Car(): 생성자
		Car mycar = new Car();

		// 필드 값 읽기
		System.out.println(mycar.company);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		System.out.println(mycar.speed);
		// 필드값 변경
		mycar.speed = 100;
		System.out.println(mycar.speed);
		// 다른 객체 생성
		Car yourcar = new Car();
		System.out.println("yourcar");
		System.out.println(yourcar.company);
		System.out.println(yourcar.model);
		System.out.println(yourcar.color);
		System.out.println(yourcar.maxSpeed);
		System.out.println(yourcar.speed);

		// 매개변수를 이용한 객체 생성
		Car mycar2 = new Car("그랜저", "white", 300);
		System.out.println(mycar2.company);
		System.out.println(mycar2.model);
		System.out.println(mycar2.color);
		System.out.println(mycar2.maxSpeed);
		System.out.println(mycar2.speed);

		Car yourcar2 = new Car("소나타", "black", 250);
		System.out.println(yourcar2.company);
		System.out.println(yourcar2.model);
		System.out.println(yourcar2.color);
		System.out.println(yourcar2.maxSpeed);
		System.out.println(yourcar2.speed);
	}

}
