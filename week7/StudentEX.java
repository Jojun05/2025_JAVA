package week7;
public class StudentEX {
	public static void main(String[] args) {
		//실행할 목적으로 만드는 실행 클래스
		// 라이브러리용 클래스를 이용해서 객체 생성
		// st1클래스 Student 인스턴스이다
		Student st1 = new Student();
		System.out.println("st1 변수가 student 객체를 참조한다");
		Student st2 = new Student();
		System.out.println("st2 변수가 또 다른student 객체를 참조한다");
	}

}
