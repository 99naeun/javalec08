
public class CastingExample {
	
	public static void main(String args[]) {
		
		// 1. ������(�ڵ�) ����ȯ
		byte a1 = 10; // 1byte
		int b1 = a1;
		
		// 2. ������(����) ����ȯ
		//a1 = b1; //-->����. ũ�Ⱑ ���̰� ���Ƿ� ������ ����ȯ �ʿ�
		a1 = (byte)b1; //b1�� �ִ� ���� 1����Ʈ�� �߶����
		//a1 = (byte)b1 +(byte)20;//-->����. ���� ������ ����� int
		a1 = (byte)(b1 +20); //(���� ũ���� �ڷ���)�� �ְ� (ū ũ���� �ڷ���)�� �ִ´�.
		
		// 3. ���� �ñ���
		int test1 = 128;
		byte bTest2 = (byte)test1;
		
		System.out.println("int test1 = " + test1);
		System.out.println("byte bTest2 = " + bTest2);
		
		// 128�� 2������ �ٲٴ� ���
		// 128�� 2�� ��� ������ �������� ������(Ȥ�� 1�� ������)�ؼ� ������ �����ش�.
		// -1�� 2������ �ٲٴ� ��
		// ���� 1�� 2�� ������ -> 00000001
		// ���̳ʽ��� ����� �� : �����´� 11111110�� +1 = 11111111 = -1
		
		//������ �޸𸮿� �����ִ� ����(��ġ�����),������(���߱�ġ, �Ѱ���ġ), ������Ÿ��(��Ͱ� ������)
		
		
		
		
	}
}