package week9_11;

public class Buds implements EarPhone {
	public Buds() {
		System.out.println("\n버즈 이어폰 연결");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("버즈 음악 재생중");
	}

	@Override
	public void stop() {
		System.out.println("버즈 음악 중지합니다.");
		// TODO Auto-generated method stub

	}

}
