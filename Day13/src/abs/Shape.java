package abs;

public abstract class Shape {
	
	int x;
	int y;
	String type = "����Ÿ��";
	
	public void printMyType() {
		System.out.println(type);
	}
	
	//final�޼���� ����� ����/ ������(override)�� �Ұ�
	public final void �������Ǿȵ�() {
		System.out.println("�Ͼ��Ͼ�");
	}

	//���̱��ϱ�()�޼���� �ݵ�� Override�ϵ��� ����
	public abstract void ���̱��ϱ�();
}
