package ch08.lineage.DTO;

public class KnightDTO extends HumanDTO{ //HumanDTO 객체를 상속한다.
	//필드
	private String sword; //검--**추후구현(클래스로 만들어도 됨)
	private String armor; //갑옷
	private String shield; //방패
	
	
	//생성자
	//메서드
	public String getSword() {
		return sword;
	}
	public String getArmor() {
		return armor;
	}
	public String getShield() {
		return shield;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	

}
