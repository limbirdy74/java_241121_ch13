package ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김유신");
		set.add("이순신");
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		
		System.out.println(set.size());  // 3 반환. 중복된 자료를 입력 안됨
		
		Iterator<String> iterator = set.iterator();  // iterator(반복자) 생성
		
		while (iterator.hasNext()) {  //hasNext() --> boolean 타입반환
			System.out.println(iterator.next()); 
		}
		System.out.println("=======================");
		set.remove("홍길동");  // 해당되는 원소명으로 가능
		
		for (String element : set) {
			System.out.println(element); 
//			System.out.println(iterator.next()); 
		}  // iterator.next() 를 쓰면 오류남. next가 더이상 옯겨 갈때가 없어서. element 는 됨
		System.out.println("=======================");
		
		MemberDto memberDto1  = new MemberDto("홍길동", 27, "서울 용산구", "010-1234-5678", "hong@abc.com"); 
		MemberDto memberDto2  = new MemberDto("이순신", 32, "서울 종로구", "010-1234-1111", "lee@abc.com"); 
		MemberDto memberDto3  = new MemberDto("김유신", 44, "서울 은평구", "010-1234-2222", "kim@abc.com"); 
		
		Set<MemberDto> setDtos = new HashSet<MemberDto>();
		
		setDtos.add(memberDto1);
		setDtos.add(memberDto2);
		setDtos.add(memberDto3);
		setDtos.add(memberDto1);
		setDtos.add(memberDto1);
		setDtos.add(memberDto2);  // 많이 넣어도 중복은 제거 됨
		
		Iterator<MemberDto> iterator2 = setDtos.iterator();  // iterator(반복자) 생성
		
		while (iterator2.hasNext()) {  //hasNext() --> boolean 타입반환
//			String name = iterator2.next().getMname();
//			int age = iterator2.next().getMage();
//			String addr = iterator2.next().getMaddr();
//			String phone = iterator2.next().getMphone();
//			String email = iterator2.next().getMemail();
//			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
			// 이렇게 하면 오류남. next()를 만날 때 마다 이동함. 3개 인데 3개 이상
			System.out.println(iterator2.next().getMname()); 
		}	
		System.out.println("=======================");
		for (MemberDto memberDto : setDtos) {
			String name = memberDto.getMname();
			int age = memberDto.getMage();
			String addr = memberDto.getMaddr();
			String phone = memberDto.getMphone();
			String email = memberDto.getMemail();
			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
		}  // 이렇게 하면 오류 안남
		System.out.println("=======================");
		// 삭제
//		set.remove("홍길동");  // 해당되는 원소명으로 가능
		set.clear();  // set내에 존재하는 모든 원소 제거. 인덱스가 없어서 한번에 삭제.
		
		for (String element : set) {
			System.out.println(element); 
		}
		
		System.out.println("=======================");
		System.out.println(set.isEmpty()); // bool 타입으로 반환 -> 비어있으면 true, 1개라도 있으면 false
		

	}

}
