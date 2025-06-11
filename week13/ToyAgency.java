package week13;

public class ToyAgency implements Rentable<Toy> {
	@Override
	public Toy rent() {
		return new Toy();
	}
}
