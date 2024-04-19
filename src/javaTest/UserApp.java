package javaTest;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
	
		Staff admin = new Staff();
		Customer cs1 = new Customer();
		Customer cs2 = new Customer();
		Customer cs3 = new Customer();
		
		admin.setName("운영자");	admin.setId("master");	admin.setPw("m7788");		admin.setSalary(3500000);		
		cs1.setName("정우성");	cs1.setId("jung-ws");	cs1.setPw("j1357913579");	cs1.setPoint(1000);
		cs2.setName("이효리");	cs2.setId("LeeHR"); 	cs2.setPw("a123!!");		cs2.setPoint(2500);
		cs3.setName("박명수");	cs3.setId("ms-park");	cs3.setPw("y2345");			cs3.setPoint(1200);
		
		System.out.println("----------------------회원+운영자 전체리스트----------------------");
		
		// - 1개의 ArrayList를 사용하여 Customer와 Staff를 모두 관리하세요.
		List <User> userlist = new ArrayList<User>();
		userlist.add(admin);	userlist.add(cs1);
		userlist.add(cs2);		userlist.add(cs3);
		
		// - 반복문을 사용하여 회원+운영자 리스트를 출력하세요.
		// - 회원+리스트를 출력할 때 맨 앞에 일련번호를 추가하세요. 
		for (int i = 0; i<userlist.size(); i++) {
			System.out.print(i+1+".");
			System.out.println(userlist.get(i));
		}
		
		// - 리스트의 운영자 월급 값을 가져오고 연봉(월급*12)을 계산하여 출력하세요. 
		System.out.println();
		System.out.println("운영자의 연봉은 "+admin.getSalary()*12+" 입니다.");
		
	}
	
}
