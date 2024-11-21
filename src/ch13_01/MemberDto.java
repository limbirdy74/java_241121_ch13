package ch13_01;

public class MemberDto {
	
	private String mname;  // 회원 이름
	private int mage;  // 회원 나이
	private String maddr; // 회원 주소
	private String mphone;  // 회원 전화번호
	private String memail;  // 회원 이메일
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String mname, int mage, String maddr, String mphone, String memail) {
		super();
		this.mname = mname;
		this.mage = mage;
		this.maddr = maddr;
		this.mphone = mphone;
		this.memail = memail;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMage() {
		return mage;
	}

	public void setMage(int mage) {
		this.mage = mage;
	}

	public String getMaddr() {
		return maddr;
	}

	public void setMaddr(String maddr) {
		this.maddr = maddr;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}
	

}
