package week9_11;

public class AirPods implements EarPhone {

	public AirPods() {
		System.out.println("\n 새로 구입한 apple airpods 연결");
	}

	@Override
	public void play() {
		System.out.println("apple airpods 음악 재생중~");
	}

	@Override
	public void stop() {
		System.out.println("apple airpods 음악 중지합니다.");
	}
}
