package week7;

public class KoreanEX {

	public static void main(String[] args) {
		//실행 클래스
		//객체 생성
		Korean k1 = new Korean("일길동","05070212301234","010-1111-1111");
		System.out.println("k1.nation="+k1.name);
		System.out.println("k1.name="+k1.name);
		System.out.println("k1.ssn="+k1.ssn);
		System.out.println("k1.phone="+k1.phone);
		
		Korean k2 = new Korean("이길동","12345678912345","010-2222-3333");
		System.out.println("k1.nation="+k1.name);
		System.out.println("k1.name="+k1.name);
		System.out.println("k1.ssn="+k1.ssn);
		System.out.println("k1.phone="+k1.phone);

	}

}
