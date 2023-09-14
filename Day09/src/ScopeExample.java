
public class ScopeExample {
	
	static String name = "하악하악";// 클래스 전역변수

	public static void main(String args[]) {
		String name = "이종석"; //지역변수
		System.out.println(name);
//		{
//			int age = 10;
//		}
//		System.out.println(age);
		printName();
		
		int i;
		for(int i = 0; i < 10; i++) { //선생님꺼 보고 뭐가 틀렸는지 비교하기
			
		}
		System.out.println(i);
	}//main 메서드 정의부 끝
	
	public static void printName() {
		
		System.out.println(name);
	}//printName 메서드 정의부 끝
	
}//클래스 정의부 끝
