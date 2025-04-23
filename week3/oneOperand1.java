package week3;

public class oneOperand1 {

	public static void main(String[] args) {
		//단항 연산자 : + , - , ++ , -- , ! , ~
		int iValue1 = 100;
		int iValue2 = -100;
				
		double dValue1 = 3.14;
		double dValue2 = -10.5;
		
		int result1 = +iValue1;
		int result2 = -iValue2;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short sValue = 100;
		//int보다 크기가 작은 데이터 타입의 연산은 결과가 int 타입이다.
		
		// 이건 안됌 short sResult = -sValue;
		//1.short sResult = (short)-sValue; 
		/*또는*/	int sResult =-sValue;
		System.out.println("sValue = "+sValue);
		
		byte bValue = -100;
		int bResult = -bValue;
		
		long lValue = 100;
		long lResult = -lValue;
		
		
		
		
		
	}

}
