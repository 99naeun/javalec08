
public class CalExample {
	
	public static void main(String args[]) {
		
		// 1. ����
		int x = 10;
		int y = 2;
		
		// 2. �������
		// +,-,*,/,%
		int result = 0;
		
		result = x+ y;
		System.out.println("x + y = " + result);
		
		result = x - y;// ����
		System.out.println("x - y = " + result);
		
		result = x * y;// ����
		System.out.println("x * y = " + result);
		
		result = x / y;// ������
		System.out.println("x / y = " + result);
		
		result = x % y; // ����������
		System.out.println("x % y = " + result);
		
		
		// ���� �����ڰ� ��� �����ڶ� ���� ���̴� ���
		int z = 10;
		z += 20; // z = z + 20;
		z -= 20; // z = z - 20;
		z *= 20; // z = z * 20;
		z /= 20; // z = z / 20;
		z %= 20; // z = z % 20;
		
		// ����������
		// ++, --, ���׿�����
		
		int x1 = 10;
		++ x1; // x1 = x1 +1;
		-- x1; // x1 = x1 -1;
		
		int z1 = 10;
		System.out.println(++z1);
		// ������ ������ ���� ������ �Ѵ� = 11
		// �������� : ++������, ���� ������ 1���� ��Ų �� �ٸ� ������ ����/
		int y1 = 10;
		System.out.println(y1++); 
		// ������ ������ �� ������ �Ѵ� = 10
		// �������� : ������++, �ٸ� ���� ���� �� ������ 1����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
