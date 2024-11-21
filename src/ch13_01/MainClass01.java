package ch13_01;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MemberDto memberDto1  = new MemberDto(); // 이렇게 만들면 setter 로 채워주어야 함
		MemberDto memberDto1  = new MemberDto("홍길동", 27, "서울 용산구", "010-1234-5678", "hong@abc.com"); 
		// 이렇게 만들면 인수값을 채워서 해줌
		// 여러개를 만들어 줄 것이라 소스가 길어져서 두번째로
		MemberDto memberDto2  = new MemberDto("이순신", 32, "서울 종로구", "010-1234-1111", "lee@abc.com"); 
		MemberDto memberDto3  = new MemberDto("김유신", 44, "서울 은평구", "010-1234-2222", "kim@abc.com"); 
		
//		List<MemberDto> memberDtos = List<MemberDto>(); // List 인터페이스라 이거는 불가능
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();  // 아주 중요한 문장임
		// MemberDto 클래스로 만든 객체를 모으기 위한(컬렉션) 큰 박스 자료타입 선언
//		ArrayList<MemberDto> memberDtos = new ArrayList<MemberDto>();  // 이것도 가능. 차이는 있음
		
		memberDtos.add(memberDto1);
		memberDtos.add(memberDto2);
		memberDtos.add(memberDto3);
		memberDtos.add(new MemberDto("강감찬", 44, "서울 구로구", "010-1234-3333", "kang@abc.com"));  // 이것도 가능
		
		MemberDto memberDto4 = memberDtos.get(3);  // 강감찬. MemberDto 객체로 받아야 한다. 
		
		for (int i=0;i<memberDtos.size();i++) {  // 배열은 length, 리스트는 size 로 길이를 구함
			String name = memberDtos.get(i).getMname();
			int age = memberDtos.get(i).getMage();
			String addr = memberDtos.get(i).getMaddr();
			String phone = memberDtos.get(i).getMphone();
			String email = memberDtos.get(i).getMemail();
			System.out.println(name+"/"+age+"/"+addr+"/"+phone+"/"+email);
		}
	}

}
