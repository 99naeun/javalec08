
//SubClassEX��� Ŭ������ SuperClassEx�� ��ӹ޴� �ڽ� Ŭ�����Դϴ�.
//A�� B�� ��ӹ޴´�
//A extends B


public class SubClassEx extends SuperClassEx {
//SubClassEx�� �θ�Ŭ������ SuperClassEx�Դϴ�.
	
	//�ƹ������� ���� Ư���� �ڽĿ��� �ְ� �ʹ�.
	String className = "�ڽ�Ŭ������ ClassName";
	String smartPhone = "������";
	
	public SubClassEx() {
		super("�Ͼ��Ͼ�2");//�θ�Ŭ������ ������ ȣ��
		System.out.println("SubClassEx ����");
	}
	
	public void printMySmartPhone() {
		System.out.println(smartPhone);
		
	}
	public void printMyClassName() {
		System.out.println("���� : " + this.className);//�ڱ��ڽ��� className
		System.out.println("�ƺ��� : " + super.className);//�θ�ü�� className
		
		// �ܺ� ��ü���� Application01�� �ִ� clssName static
		// �Ӽ��� �����Ҷ�
		// ���Ŭ����Name.�ɹ����� = ��
		// ���Ŭ����Name.method();		
		Application01.className2 = "�Ͼ��Ͼ�";
	}
	
}
