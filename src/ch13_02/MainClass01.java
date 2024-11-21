package ch13_02;

import java.util.Stack;

import ch13_01.MemberDto;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// stack --> LIFO. push 넣고, pop 빼고
		// stack 는 클래스. new Stack<>();  이렇게 해도 되지만 써주는게 좋다
		Stack<MemberDto> stack = new Stack<MemberDto>(); 
		
		stack.push(new MemberDto("홍길동", 27, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		stack.push(new MemberDto("이순신", 31, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		stack.push(new MemberDto("김유신", 37, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		stack.push(new MemberDto("강감찬", 45, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		
		MemberDto memberDto1 = stack.pop(); // 강감찬
		System.out.println(memberDto1.getMname());
		
		System.out.println("=======================");
		
		while(!stack.isEmpty()) {  // 강감찬은 빠져서 나머지 3요소만 찍힘. pop하면 빠짐
			MemberDto memberDto = stack.pop();
			System.out.println(memberDto.getMname());
		}

	}

}
