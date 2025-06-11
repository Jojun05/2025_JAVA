package week9; // week9 패키지에 속함

public class CarEX { // CarEX 클래스 선언
	public static void main(String[] args) { // 메인 메소드 시작

		Car mycar = new Car(); // Car 클래스의 객체 mycar 생성
		// private은 외부에서 접근 불가
		// mycar.company = "현대자동차"; // 직접 접근 불가(컴파일 에러 발생)

		// setter() 이용
		mycar.setCompany("현대자동차"); // mycar의 회사명을 "현대자동차"로 설정
		mycar.setCompany("그랜저"); // 회사명을 "그랜저"로 변경
		mycar.setCompany("기아"); // 회사명을 "기아"로 다시 변경
		// getter() 이용
		System.out.println(mycar.getCompany()); // 회사명 출력 ("기아")
		System.out.println(mycar.getColor()); // 색상 출력 (초기값 또는 기본값)
		System.out.println(mycar.getMaxspeed()); // 최대 속도 출력 (초기값 또는 기본값)
	}
}
