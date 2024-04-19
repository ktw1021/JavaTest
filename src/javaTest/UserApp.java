package javaTest;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
	
		User admin = new Staff("master","m7788","운영자",3_500_000);
		User cs1 = new Customer("jung-ws","j1357913579","정우성",1_000);
		User cs2 = new Customer("LeeHR","a123!!","이효리",2_500);
		User cs3 = new Customer("ms-park","y2345","박명수",1_200);
				
		// - 1개의 ArrayList를 사용하여 Customer와 Staff를 모두 관리하세요.
		List <User> userList = new ArrayList<User>();
		userList.add(admin);	userList.add(cs1);
		userList.add(cs2);		userList.add(cs3);
		
		System.out.println("----------------------회원+운영자 전체리스트----------------------");
		// - 반복문을 사용하여 회원+운영자 리스트를 출력하세요.
		// - 회원+리스트를 출력할 때 맨 앞에 일련번호를 추가하세요. 
		for (int i = 0; i<userList.size(); i++) {
			System.out.print( i + 1 + "." );
			System.out.println(userList.get(i));
		}
		
		// - 리스트의 운영자 월급 값을 가져오고 연봉(월급*12)을 계산하여 출력하세요. 
		System.out.println();
		System.out.println("운영자의 연봉은 "+((Staff)admin).getSalary()*12+" 입니다.");
		
	}
	
}
