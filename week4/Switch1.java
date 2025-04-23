package week4;

public class Switch1 {

	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("A등급");
			break;
		case 'B':
		case 'b':
			System.out.println("B등급");
			break;
		default:
			System.out.println("기타 등급");
		}

	}

}
