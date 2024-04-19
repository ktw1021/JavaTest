package javaTest;

//	User 클래스는 추상 클래스로 정의.
public abstract class User {

	// User 클래스의 필드에 대한 접근 제어자는 
	// 자식 클래스(Customer, Staff)에서 직접 접근할 수 있도록
	protected String id;
	protected String pw;
	protected String name;
	
	public User() {
		
	}
	
	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "아이디:" + getId() + "\t비번:" + getPw() + "\t이름:" + getName();
	}

	public abstract void showInfo();
	
}
