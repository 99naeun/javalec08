
public class CalExample01 {
	
	public static void main(String args[]) {
		
		//��Ʈ���� = 2���� ����
		// true : 1, false : 0
		// &,|,^,~
		
		int x = 10;
		int y = 7;
		System.out.println("10 = " + Integer.toBinaryString(x));
		System.out.println("7 = " + Integer.toBinaryString(y));
		
		// 1. x & y
		System.out.println("x & y = " + (x&y));
		
		// 2. x | y
		System.out.println("x | y = " + (x|y));
		
		// 3. x ^ y
		System.out.println("x ^ y = " + (x^y));
		
		// 4. not(~)
		System.out.println("~ (x & y) = " + ~(x&y));
		
		//int x1 = 2*2*2*2*2; //(2 5��);
		int x1 = -1;
		System.out.println(Integer.toBinaryString(x1));
		
		
		// << Left Shift
		int r1 = x1 << 2;
		System.out.println(Integer.toBinaryString(r1));
		
		
		System.out.println("Right Shift");
		//>>right shift
		byte r2 = -128;
		System.out.println(Integer.toBinaryString(r2));
		System.out.println(Integer.toBinaryString(r2 >> 2));
		
		
		r2 = 127;
		System.out.println(Integer.toBinaryString(r2));
		System.out.println(Integer.toBinaryString(r2 >> 2));
		
		// byte���� 2������ ���� ���� ����
		// 1 000 0000 = -128
		// ���� ū ����?
		// 0 111 1111
		
		
		// >>> �� ģ���� ���� �̵���, ������ �ִ� ��ȣ��Ʈ+�������� ��� 0���� ä���ش�.
		
		System.out.println("Right Shift >>>");
		//>>right shift
		r2 = -10;
		System.out.println(r2 + "=" + Integer.toBinaryString(r2));
		System.out.println((r2 >>> 2) + "=" + Integer.toBinaryString(r2 >>> 2));
		
		
//		x = 2;
//		x = x *2 *2; // 2�� 3��
//		
//		y = 2;
//		y = y << 3;//2�� 3��
		
		int z1 = 10;
		System.out.println("z1 = "+ Integer.toBinaryString(z1));
		System.out.println("5 = "+ Integer.toBinaryString(5));
		
		z1 &= 5;// z1 = z1 & 5;
		System.out.println("z1&5 = "+ Integer.toBinaryString(z1));
		System.out.println("z1&5 = "+ z1);
		
		boolean b1 = true;
		b1 &= (z1>1||z1<<2>10);
		// b1 = b1 &(z1>||Z1<<2>10);
		System.out.println(b1);
		
		// 3�׿�����
		
		int grade = 6; // 5�г�
		int age = 0;
		
		age = grade == 5 ? 12 : -1; //3�׿���
		// ���ǽ� ? true�϶� : false �϶�;
		
		System.out.println("�г� : " + grade + " ���� : " + age);
		
		age = ++age * 10;
		System.out.println(age);
		
		age = age++ * 10;
		System.out.println(age);
		
		
	
		
		
	}

}
