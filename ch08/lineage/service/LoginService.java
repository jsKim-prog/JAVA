package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;

public class LoginService {
	// 로그인에 관한 부메뉴용
	public static Account menu(Scanner scanner,Account[] accounts,Account loginAccount) {
		System.out.println("1.로그인 | 2.회원가입 | 3.회원수정 | 4.닫기");
		System.out.print(">>>");
		int select = scanner.nextInt();

		switch (select) {
		case 1:
			System.out.println("로그인을 시작합니다.");
			System.out.print("id : ");
			String id = scanner.next();
			System.out.print("pw : ");
			String pw = scanner.next();
			Account account = new Account();
			account.setId(id);
			account.setPw(pw); //새로만든 account 객체에 id, pw 삽입
			
			//배열에 있는 값과 비교
			for(int i=0; i<accounts.length;i++) {
				if(accounts[i]!=null) {
					if(accounts[i].getId().equals(account.getId())) {
					 System.out.println("해당하는 ID가 있습니다.");
					 if(accounts[i].getPw().equals(account.getPw())) {
						 System.out.println("해당하는 PW가 있습니다.");
						 loginAccount = accounts[i];
						 System.out.println("로그인 성공");
						 break;
					 }else {
						 System.out.println("해당하는 PW가 없습니다.");
					 }//pw비교
					}else {
						System.out.println("해당하는 ID가 없습니다.");
					}//id비교
				}else {
					System.out.println("해당하는 계정이 없습니다.");
					break;
				}//빈객체 비교
			}//--for()
			
			
			break;
		case 2:
			System.out.println("로그인을 시작합니다.");
			break;
		case 3:
			System.out.println("로그인을 시작합니다.");
			break;
		case 4:
			System.out.println("로그인을 시작합니다.");

			break;
		default:
			System.out.println("입력오류 : 1~4값만 입력하세요.");
		}// --swict()
		return loginAccount;
	}// --menu()

}
