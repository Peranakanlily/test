
public class Manager extends Employee {
	
	
	
	public Manager(int id, String name, String designation, int mid, String nickname) {
		super(id, name, designation);
		// TODO Auto-generated constructor stub
		this.mid = mid;
		this.nickname = nickname;
		
	}
	

	private int mid;
	private String nickname;
	public int getMid() {
		return mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
	

}
