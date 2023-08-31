
public class CastingExample {
	
	public static void main(String args[]) {
		
		// 1. 묵시적(자동) 형변환
		byte a1 = 10; // 1byte
		int b1 = a1;
		
		// 2. 명시적(강제) 형변환
		//a1 = b1; //-->에러. 크기가 차이가 나므로 강제로 형변환 필요
		a1 = (byte)b1; //b1에 있는 값을 1바이트로 잘라줘라
		//a1 = (byte)b1 +(byte)20;//-->에러. 정수 연산의 결과는 int
		a1 = (byte)(b1 +20); //(작은 크기의 자료형)을 넣고 (큰 크기의 자료형)을 넣는다.
		
		// 3. 아이 궁금해
		int test1 = 128;
		byte bTest2 = (byte)test1;
		
		System.out.println("int test1 = " + test1);
		System.out.println("byte bTest2 = " + bTest2);
		
		// 128을 2진수로 바꾸는 방법
		// 128을 2로 계속 나눠서 나머지가 없도록(혹은 1만 남도록)해서 역으로 더해준다.
		// -1을 2진수로 바꾸는 법
		// 먼저 1을 2로 나눈다 -> 00000001
		// 마이너스로 만드는 법 : 뒤집는다 11111110에 +1 = 11111111 = -1
		
		//변수는 메모리에 잡혀있는 공간(김치냉장고),변수명(배추김치, 총각김치), 데이터타입(몇리터가 들어가는지)
		
		
		
		
	}
}
