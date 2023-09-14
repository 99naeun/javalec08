//�޼���� ũ�� �ΰ��� Ÿ���� �ֽ��ϴ�.
//1. ����
// -���ڰ� ���� �޼���
// -���ڰ� �ִ� �޼���
// 
//2.�� �����ֱ�(return)
// -���� �����ִ� �޼���
// -���� �������� �ʴ� �޼���

public class MethodEx {
	
	// 1.������ ����, ���ڵ� ���� �޼���
	static void printName() {
		System.out.println("���� �̸���?");
	}
	
	// 2.������ ����, ���ڴ� �ִ� �޼���
	static void printUrName(String urName, int urAge) {
		System.out.println("���� �̸��� " +urName+ "(" +urAge+ ")");
	}
	
	// 3. ������ �ְ�, ���ڴ� ���� �޼���
	static String returnName(){
		return "������";
	}
	
	// 4. ������ �ְ�, ���ڵ� �ִ� �޼���
	// �޼��� ���� add, ���ڴ� x,y (int) �׸��� ����� x+y�� 
	// ������� �����ּ���.
	static int add(int x, int y){
		return x + y;
		
	}
	

	public static void main(String args[]) {
		//�޼��� �̸� : main
		//����(�Ű�����) : String args[] �迭
		//�����ִ� ��(return)�� ������ Ÿ���� void
		//void�� ���� "�ƹ��͵� �������� �ʴ´�."
		
		// 1.���ϰ��� ����, ���ڵ� ���� �޼��� ȣ��
		printName(); //()�� ������ �޼���, ������ ����
		printName();
		printName();
		
		// 2.���ϰ��� ����, ���ڸ� �ִ� �޼��� ȣ��
		printUrName("������",20);
		printUrName("������",21);
		
		// 3. ���ϰ��� �ְ�, ���ڴ� ���� �޼��� ȣ��
		String name = returnName();
		System.out.println(name);
		String name2 = returnName();
		System.out.println(name2);
		
		// 4. ���ϰ��� �ְ�, ���ڵ� �ִ� �޼��� ȣ��
		int result = add(1, 100);
		System.out.println(result);
		System.out.println(add(100,-100));
	}
}
