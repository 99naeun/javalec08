
public class DataTypeExample1 {
	
	public static void main(String args[]) ; {
	
	// �ڹ��� ���� ������Ÿ���� ũ�� 2����
	// a) �⺻Ÿ�� b) ����Ÿ��
	
	// �۰� 4������ �ִ�.
	// a)���� b)�Ǽ� c)�� (�⺻Ÿ�� primitive type)
	// /d)����
	
	//��� �̸�;
	// 1����Ʈ�� ������, age�� �����غ��ô�.
	byte age; //->�޸𸮿� 1byte ������ ����� - �̸��� age�� ������.
	age=10;
	//age = age+ 10 ; //<--�� ������? �⺻������ ����(����)�� ����ϰ� �Ǹ�, �� ������ int�� �ν�(4byte)
	            //������ ����� ���������� int
	System.out.println(age);//->���
	
	
	
	
	long b = 100;
	b = age + 100; // long 8 bytes = age + 100 (int 4bytes)
	               // ������ �ȳ�
	
	char charValue=65;
	System.out.println("65="+charValue);

	
	float a = 1.1f; // �Ǽ����� �⺻ ������Ÿ���� double�̱� ������ float ������ �Ǽ��� ���� ������ f�� ����ؼ�
	                // "�� ģ���� float��"��� �����Ϸ����� �˷���� �մϴ�.
	
	long b = 100;
	a = b;
	
	
	double a2 = 100.0; //�Ҽ���(�Ǽ�)�� �⺻ double�̱� ������ f���̵� ��밡��
	
	boolean isName = true; //false
	// �Ϲ������� ���� 0�� ����=false
	// 0���� ��� ���� true
	
	// ����� ���� ����
	int address1 = 100;
	address1 = 200;
	
	int address3;
	//�������
	address3 = 100;
	
	// ���
	final int address2 = 100; // ����� �Ϲ������� ����� ���ÿ� �� �Ҵ�
	address2 = 100-100; // �ѹ� ���� �Ҵ�Ǹ�, ���� �Ұ�
	//������� �Ϲ������� ��� �빮�ڸ� ���
	//hello world��� �������� ������ �� -> int helloWorld
	//hello world��� ����� ������ �� -> final int HELLOWORLD;
	final int HELLO_WORLD = 100;
	
	
	//����� Ű�е� (ex)
	final int ARROW_UP = 100;
	final int ARROW_DOWN = 200;
	
	int x = 10;
	x = 10 + 100;
	}
}


