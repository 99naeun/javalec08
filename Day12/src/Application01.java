
//JVM -> Application01.main();



public class Application01 {
	
	String className; //Applicaiton01 �ɹ�(����)
	                  //��ü�����ɹ�
	
	static String className2;//Application01 �ɹ�(����)
	                          //static ���� ����
	
	public void nonStaticMethod() {//��ü�����޼���
		className = "�Ͼ� non Static";
		className2 = "������";
	}

	public static void main(String args[]) {
		
		className2 = "�� �̸��� className2";
//	    this.className = "�� �̸��� classNmae�̾�"; ����
		Application01 a01 = new Application01();
		a01.className = "�Ͼ�";
		
//		Application01.className2 = "����"; static �Ӽ� ���ٹ�
//		a01.className2 = "�Ͼ�";
		
		//1.SuperClassEx
		SuperClassEx ex1 = new SuperClassEx();
		ex1.printClassName();
//		ex1.printMySmartPhone();//�ڽ����� �ִ� �޼���
		
		System.out.println("=====================");
		
		//2.SubClassEx(extends SuperClassEx)
		SubClassEx ex2 = new SubClassEx();
//		ex2.className = "�Ͼ��Ͼ�";// �ƹ������� ��ӹ��� �Ӽ�(�ɹ�����)
		ex2.printClassName();// �ƹ������� ��ӹ��� �޼���
		ex2.printMySmartPhone();// �ڽ����׸� �ִ� �޼���
		ex2.printMyClassName();// �ڽ��� className���
		
		
	}
}
