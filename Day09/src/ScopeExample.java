
public class ScopeExample {
	
	static String name = "�Ͼ��Ͼ�";// Ŭ���� ��������

	public static void main(String args[]) {
		String name = "������"; //��������
		System.out.println(name);
//		{
//			int age = 10;
//		}
//		System.out.println(age);
		printName();
		
		int i;
		for(int i = 0; i < 10; i++) { //�����Բ� ���� ���� Ʋ�ȴ��� ���ϱ�
			
		}
		System.out.println(i);
	}//main �޼��� ���Ǻ� ��
	
	public static void printName() {
		
		System.out.println(name);
	}//printName �޼��� ���Ǻ� ��
	
}//Ŭ���� ���Ǻ� ��
