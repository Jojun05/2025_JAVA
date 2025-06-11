package week9;

public class AirPlaneEX {
	public static void main(String[] args) {
		SonicAirPlane sPlane = new SonicAirPlane();
		sPlane.takeoff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.flyMode = SonicAirPlane.SUPERSONIC;
		sPlane.fly();
	}
}
