import java.util.Scanner;

class LoginException extends Exception{
	LoginException(String message){
		super(message);
	}
}

public class CustomExceptionEx {
	
	public static void main(String args[]) throws LoginException{
		String dbId = "lodossw";
		String dbPwd = "12345";
		int try_cnt = 0;
		
		while(try_cnt<3) {
		Scanner scanner = new Scanner(System.in);//사용자 입력받는 객체
		System.out.print("아이디를 입력해주세요. : ");
		String id = scanner.nextLine();//사용자 입력 대기(엔터칠때까지)
		System.out.print("비밀번호를 입력해주세요. : ");
		String password = scanner.nextLine();//사용자 입력 대기(엔터칠때까지)
		
		if(dbId.equals(id) && dbPwd.equals(password)) {
			System.out.println("로그인 성공");
			break;
		}else {
			try {
			throw new LoginException("아이디와 비밀번호를 확인해주세요.");
			}catch(LoginException ex) {
				try_cnt ++;
			System.out.println(ex.getMessage());
			}catch(Exception ex) {	
			System.out.println(ex.getMessage());	
			}
		}
		}
	}

}
