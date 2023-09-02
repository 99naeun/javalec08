
public class CalExample02 {
	
	public static void main(String args[]) {
		
		// 1. And 연산은 양쪽 모두 true여야지 true, 그 외에는 모두 false
		// A && B, A & B
		System.out.println("true && true = "+(true&&true));
		
		int a = 10;
		int b = 20;
		boolean result = a > 5 && b < 21 && ( a + 10 < 0);
		// boolean -> true/false중 하나 출력되는 것
		// --> result - false / ( true && true ) && false
		
		// 2. OR 연산은 양쪽 피연산자 중 하나만 true면 true
		// A || B, A | B
		result = a > 5 || b < 21 || ( a + 10 < 0 );
		// --> result - true / ( true || true) || false
		
		// XOR 연산은 양쪽 중 하나만 true 일 때 true
		// A ^ B
		result = a > 5 ^ b < 21 ^ ( a + 10 < 0 ); 
		// --> result = false => (true^true)^false
		System.out.println(result);
		
		result=!result; // not false -> true
		
		// ! && & || |의 차이
		int x = 100;
		int y = 110;
		boolean z  = x > y && ++x == 101;
		// x가 y보다 크"고", ++x가 101과 같냐?
		// &&는 앞에 있는 피연산자가 false인 경우,
		// 뒤에 있는 연산자는 계산할 필요도 없이
		// false이기 때문에 연산을 수행하지 않아서
		// 위의 경우에는 x=100이 됩니다.
		
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		z = x < y || ++x == 101;
		// x가 y보다 작"거나" ++x가 101과 같냐?
		// ||는 앞에 있는 연산자가 true일 경우,
		// 뒤에 있느 연산자는 계산할 필요 없이
		// true이기 때문에 연산을 수행하지 않는다.
		
		System.out.println("z = "+z);
		System.out.println("y = "+y);
	}

}
