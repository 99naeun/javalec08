
public class CalExample2 {
	
	public static void main(String args[]) {
		
		// 1. And ���� ���� ��� �� true������ true/ �� �ܿ��� ��� false
		// A && B, A & B 
		System.out.println("true&&true "+(true&&true));
		
		int a = 10;
		int b = 20;
		boolean result = a > 5 && b <21 && ( a + 10 < 0 );
		// --> result - false / ( true && true) && false
		
		// 2. OR ���� ���� �ǿ����� �� �ϳ��� true�� true.
		// A||B, A|B
		result = a > 5 || b < 21 || ( a + 10 < 0);
		// --> result = true/(true||true)&& false
		
		// 3. XOR ������ ���� �� �ϳ��� true�� �� true
		// A ^ B
		result = a>5^b<21^(a+10<0);
		//--> result = false => (true^true)^false
		System.out.println(result);
		
		result=!result; // not false -> true
		
		// !)&&,&/ ||,|�� ����
		int x = 100;
		int y = 110;
		boolean z = x>y&& ++x == 101;
		//x�� y���� ũ'��',++x�� 101�� ����?
		//&&�� �տ��ִ� �ǿ����ڰ� false�� ���, �ڿ��ִ� �����ڴ� ����� �ʿ䵵 ���� 
		//false�̱� ������ ������ �������� �ʾƼ�, ���� ��쿡�� x=100�� ��.
		
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		z=x<y||++x==101;
		//x�� y���� ��'�ų�' ++x�� 101�� ����?
		//||�� �� �ǿ����ڰ� true�� ���, �� �ǿ����ڴ� ����� �ʿ� ����
		//true�̱� ������ ������ �������� �ʴ´�.
		
		System.out.println("z="+z);
		System.out.println("x="+x);
		
	}

}
