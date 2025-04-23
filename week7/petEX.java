package week7;

public class petEX {
	public static void main(String[] args) {

		pet pet1 = new pet("바둑이", "강아지", 3);
		System.out.println(pet1.name);
		System.out.println(pet1.type);
		System.out.println(pet1.age);
		
		pet mypet = new pet("초코", "고양이");
		System.out.println(mypet.name);
		System.out.println(mypet.type);
		System.out.println(mypet.age);
		System.out.println(mypet.color);
		
		pet pet2 = new pet("구름", "강아지", 3, "흰색");
		System.out.println(pet2.name);
		System.out.println(pet2.type);
		System.out.println(pet2.age);
		System.out.println(pet2.color);
	}
}
