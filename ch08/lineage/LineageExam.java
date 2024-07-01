package ch08.lineage;

import java.util.Scanner;

import ch08.lineage.DTO.Account;
import ch08.lineage.DTO.ElfDTO;
import ch08.lineage.DTO.HumanDTO;
import ch08.lineage.DTO.KnightDTO;
import ch08.lineage.service.CharacterService;
import ch08.lineage.service.LoginService;

public class LineageExam {
	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10]; //사용자 계정 들어갈 배열
	public static Account loginAccount; //로그인 성공시 객체(세션역할)
	public static KnightDTO knightDTO = new KnightDTO(); //**배열에 안넣으려면 static위로 빼서 공유하는게 좋다.
	public static ElfDTO elfDTO = new ElfDTO();
	public static HumanDTO humanDTO = null;
	
	static {		
		knightDTO.setSword("양손검");
		knightDTO.setArmor("징박힌갑옷");
		knightDTO.setShield("징박힌방패");
		knightDTO.setName("징박힌방패");
		knightDTO.setSex("남");
		knightDTO.setLevle(1);
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);
		
		
		elfDTO.setBow("양손활");
		elfDTO.setDress("천사드레스");
		elfDTO.setArrow("크리티컬화살");
		elfDTO.setName("저요정");
		elfDTO.setSex("여");
		elfDTO.setLevle(1);
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(10000000);
		
		Account account = new Account(); //테스트용 계정생성
		account.setId("kkk");
		account.setPw("kkk");
		account.setNickName("kkk");	
		accounts[0] =account; //배열 0번에 계정객체 연결
	}//DB대신 초기값 지정(생성자 대신)
	

	public static void main(String[] args) {
		// 객체 간의 상속을 알아본다.
		// 부모 객체는 자식 객체에게 모든 정보를 상속한다.
		// 자식 객체는 부모 객체의 정보를 받아 사용하며 추가적인 정보를 생성하여 활용함
		
		System.out.println("===== 리니지 게임을 시작합니다. =====");
		boolean run = true;
		
		while(run) {
			System.out.println("1.로그인 | 2.캐릭터 선택 | 3.게임실행 | 4.종료");
			System.out.print(">>>");
			int select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("로그인을 시작합니다.");
				loginAccount = LoginService.menu(scanner, accounts, loginAccount);
				break;
			case 2:
				System.out.println("캐릭터를 선택합니다.");
				CharacterService.menu(scanner, loginAccount, knightDTO, elfDTO,humanDTO);
				break;
			case 3:
				System.out.println("게임을 시작합니다.");
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;
			default : 
				System.out.println("입력오류 : 1~4값만 입력하세요.");
			}//--switch()
		}//--while()

	}//--main()

}//--class
