
public class CalExample01 {

	public static void main(String args[]) {
		
		// 1. 대입
		int x = 10;
		int y = 2;
		
		// 2. 산술연산
		// +,-,*,/,%
		int result = 0;
		
		result = x + y; //덧셈
		System.out.println("x + y = "+result);
		
		result = x - y; //뺄셈
		System.out.println("x - y = "+result);
		
		result = x * y; //곱셈
		System.out.println("x * y = "+result);
		
		result = x / y; //나눗셈
		System.out.println("x * y = "+result);
		
		result = x % y; //나머지연산
		System.out.println("x % y = "+result);
		
		// 대입 연산자가 산술 연산자랑 같이 쓰이는 경우
		int z = 10;
		z += 20; // z = z + 20;
		z += 20; // z = z - 20;
		z *= 20; // z = z * 20;
		z /= 20; // z = z / 20;
		z %= 20; // z = z % 20;
		
		//증감연산자
		// ++, --, 단항연산자
		
		int x1 = 10;
		++ x1; // x1 = x1 + 1;
		-- x1; // x1 = x1 - 1;
		
		int z1 = 10;
		System.out.println(++z1);
		// 문장이 끝나기 전에 연산을 한다 = 11
		// 전위연산 : ++변수명, 먼저 변수에 1증가 시킨 후 다른 연산을 실행한다.
		
		int y1 = 10;
		System.out.println(y1++);
		// 문장이 끝났을 때 연산을 한다 = 10
		// 후위연산 : 변수명++, 다른 연산 실행 후 변수에 1 증가한다.
	}
}
