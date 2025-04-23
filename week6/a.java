package week6;

public class a {

	public static void main(String[] args) {
		// 참조 타입 변수 : 클래스 타입
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1 == iVal2 :" + (iVal1 == iVal2 ? true : false));

		// String : 대표적인 클래스 타입
		String sVal1 = "JAVA";
		String sVal2 = "JAVA";

		System.out.println("sVal1 == sVal2:" + (sVal1 == sVal2 ? "참조가 같다" : "참조가 다르다"));

		String sVal3 = new String("java");
		String sVal4 = new String("java");

		System.out.println("sVal3 == sVal4:" + (sVal3 == sVal4 ? "참조가 같다" : "참조가 다르다"));
		System.out.println("sVal3 == sVal4:" + (sVal1 == sVal3 ? "참조가 같다" : "참조가 다르다"));

		// 참조타입 변수는 초기값으로 null을 사용할수있다
		// 스택 영역에만 생성됨
		String sVal5 = null;
		// null 값을 가지고 있을때는 변수를 사용할수 없다
		// nullPointerException 발생
		// System.out.println("sVal5.length = "+sVal5.length());
		sVal5 = "java";

		System.out.println("sVal5 = " + sVal5);
		System.out.println("sVall==sVal5:" + (sVal1 == sVal5 ? "참조가 같다" : "참조가 다르다"));
		// String 객체가 동일한 문자열 값을 가지고 있는지
		// 비교할때는 반드시 equls() 사용
		if (sVal3.equals(sVal4))
			System.out.println("sVal3과 sVal4의 문자열은 동일하다");
		else
			System.out.println("sVal3과 sVal4의 문자열은 다르다");
	}

}
