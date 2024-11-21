package ch13_02;

import java.util.LinkedList;
import java.util.Queue;

import ch13_01.MemberDto;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// queue --> FIFO.  offer 넣고, poll 빼고
		Queue<MemberDto> queue = new LinkedList<MemberDto>();  // 큐 구현은 이렇게
		
		// offer 로 넣어준다
		queue.offer(new MemberDto("홍길동", 27, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		queue.offer(new MemberDto("이순신", 31, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		queue.offer(new MemberDto("김유신", 37, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		queue.offer(new MemberDto("강감찬", 45, "서울시 용산구", "010-1111-2222", "hong@abc.com"));
		
		while(!queue.isEmpty()) {
			MemberDto memberDto = queue.poll();
			System.out.println(memberDto.getMname());
		}

	}

}
