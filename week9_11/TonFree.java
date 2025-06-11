package week9_11;

public class TonFree implements EarPhone {
	public TonFree() {
		System.out.println("\n LG 블루투스 이어폰 톤프리  연결");
	}

	@Override
	public void play() {
		System.out.println("LG 톤프리 음악 재생중~");
	}

	@Override
	public void stop() {
		System.out.println("LG톤프리 음악 중지합니다");

	}

}
