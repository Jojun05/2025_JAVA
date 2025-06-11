package week9;

public class SonicAirPlane extends Airplane {
	// 비행 모드 초기값 설정
	public static final int NORMAR = 1;
	public static final int SUPERSONIC = 2;

	int flyMode = NORMAR;

	private int soundSpeed;
	private int maxSpeed;

	// 부모 메소드를 재정의
	@Override
	public void fly() {
		// 자식이 부모없앰 ㅋㅋ
		if (flyMode == SUPERSONIC) {

			System.out.println("음속비행합니다.");
		} else
			super.fly();

	}

	public int getSoundSpeed() {
		return soundSpeed;
	}

	public void setSoundSpeed(int soundSpeed) {
		this.soundSpeed = soundSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
