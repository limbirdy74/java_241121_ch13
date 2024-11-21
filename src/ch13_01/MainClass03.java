package ch13_01;

import java.util.HashMap;
import java.util.Map;

public class MainClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// map 는 검색에 강점이 있음. 잘 쓸일은 없을 듯
		Map<String, Integer> map = new HashMap<String, Integer>();
		// key는 중복허용 X, value는 중복 허용O, 저장순서 X. <key, value>
		
		// 자료를 넣어주는 put
		map.put("홍길동", 27);
		map.put("이순신", 27);
		map.put("김유신", 27);
		map.put("홍길동", 35);  // 중복된 key를 입력해도 오류는 안남. 하지만 마지막 값으로 저장됨
		
		System.out.println(map.get("홍길동"));
		System.out.println(map.size());  // 맵내 원소의 개수
		
		map.remove("김유신");  // 김유신 key 제거
		System.out.println(map.size());
		
		for (String key: map.keySet()) {
			System.out.println("key: "+key+", value: "+map.get(key));
		}

	}

}
