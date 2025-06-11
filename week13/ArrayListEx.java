package week13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // ArrayList 생성
		// list 에 데이터 추가
		list.add("JAVA");
		list.add("OOP");
		list.add("객체지향프로그래밍");
		System.out.println("리스트 총 개수 = " + list.size());
		String item = list.get(2); // 2번 인덱스 값 가져오기
		System.out.println("리스트 2번 인덱스 값 = " + item);
		System.out.println();

		// 향상된 for문으로 전체 출력
		for (String s : list)
			System.out.println(s);
		System.out.println();

		list.remove(1); // 1번 인덱스 제거
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));

			// vector => 동기화 지원하는 리스트 (멀티스레드 환경에서 사용)
			List<String> vector = new Vector<String>();
			vector.add("홍길동");
			vector.add("이순신");
			vector.add("강감찬");

			System.out.println();

			// vector의 데이터 출력
			for (String s : vector)
				System.out.println(s);

			// LinkedList => 삽입, 삭제가 빈번한 경우 유리
			List<String> linkedList = new LinkedList<String>();
			linkedList.add("apple");
			linkedList.add("melon");
			linkedList.add("banana");
			System.out.println();
			for (String s : linkedList)
				System.out.println(s);

			linkedList.remove("apple"); // "apple" 제거
			System.out.println();
			for (String s : linkedList)
				System.out.println(s);

			// Set 컬렉션 (중복 불가, 순서 없음)
			Set<String> set = new HashSet<String>();
			set.add("apple");
			set.add("kiwi");
			set.add("tomato");
			set.add("apple"); // 중복 추가, 무시됨
			set.add("melon");

			System.out.println();

			// Iterator로 Set 데이터 출력
			Iterator<String> iter = set.iterator();
			while (iter.hasNext())
				System.out.println(iter.next());

			System.out.println();

			// 향상된 for문으로 Set 데이터 출력
			for (String s : set)
				System.out.println(s);

			System.out.println();
			// Map (키-값 쌍 관리)
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", "홍길동");
			map.put("nickname", "홍길동");
			map.put("name", "이순신"); // "name"의 값이 "이순신"으로 수정됨
			map.put("gender", "남자");
			map.put("id", "admin");
			map.put("passwd", "1234");

			// Map의 모든 키와 값 출력
			for (String s : map.keySet())
				System.out.println(s + " = " + map.get(s));
		}
	}
}
