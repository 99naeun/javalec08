// 제어문
// 1. 조건제어,  2. 반복제어
public class ControlExample03 {
	
	public static void main(String args[]) {
		
		// 1. 조건제어는 
		// 1-1 if
		// 1-2 switch ~ case
		
		int a = 1;
		
		if(a<0) { 
			//if(condition) {실행문}
			// condition이 true일 경우에 {} 블럭 안을 실행시킨다.
			System.out.println("a는 음수입니다.");
			
		} else {
			//if(condition){실행문}
			//condition이 false일때 실행
		}
//			if(a>0) {
//				System.out.println("a는 양수입니다.");
//			}
			
		int grade = 5;//초등학교 학년
		// 1-3 저학년 if(grade<=3) {}
		// 4학년은 중간 if(grade==4) {}
		// 5-6 고학년 if(grade>=5) {} 
		// 그 외에는 다시 넣어주세요.

		if(grade>=1 && grade <=3) {
			System.out.println("저학년");
		}else if(grade>=5 && grade <=6) {
			System.out.println("고학년");
		}else if(grade==4) { //else{ 만 써도 무관하다
			System.out.println("중간학년");
		}else {
			System.out.println("입력값은 1-6까지 입니다.");
			
		
		}
		
		
		
		//Switch ~ case
		
		int x = 10;
		
		switch(x) {
		
		  case 1 :
			  System.out.println("x는 1입니다.");
			  break;
			  
		  case 10 : 
			  System.out.println("x는 10입니다.");
			  break;
			  
		  case 3 : 
			  System.out.println("x는 3입니다.");
			  break;
			  
		}
			System.out.println("프로그램 종료");
			
	}
	}

	