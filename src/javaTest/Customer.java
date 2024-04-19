package javaTest;

public class Customer extends User {
	
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Customer() {
		super();
	}
	
	public Customer(String id, String pw, String name, int point) {
		super(id, pw, name);
		this.point = point;
	}

	@Override
	public String toString() {
		return super.toString() + "\t포인트:" + point;
	}
	
	@Override
	public void showInfo() {
		
	}
	
}
