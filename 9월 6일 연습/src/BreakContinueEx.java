import java.util.Scanner;

public class BreakContinueEx {
	
	public static void main(String args[]) {
		
		int command = 0;
		
		for(;;) {//무한루프
			System.out.println("숫자를 입력하세요(프로그램 종료는 -) : ");
			Scanner in = new Scanner(System.in);
			// System.in 키보드 값을 읽는다(키보드 값 출력)
			command=in.nextInt();
			
			if(command < 0) {// 사용자의 입력값이 음수이면
				break; // 반복문을 끝내겠다
			}
			System.out.println("입력값은"+command+"입니다.");
		}//for loop문 끝
		//<==
		System.out.println("프로그램 종료");
	}

}
