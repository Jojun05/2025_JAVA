package week9_11;

public class VoluemEx {
	public static void main(String[] args) {
		// 익명 구현 객체 만들기
		// 명시적인 구현 클래스는 생략하고 구현 객체를 바로 생성
		// 인터페이스 변수 = new 인터페이스(){};
		Volume vol = new Volume() {

			@Override
			public void voluemUp(int level) {
				System.out.println("익명객체의 볼륨을 올립니다 :" + level);
			}

			@Override
			public void voluemDown(int level) {
				System.out.println("익명객체의 볼륨을 내립니다 :" + level);
			}
		};
		vol.voluemUp(5);
		vol.voluemDown(3);
	}
}
