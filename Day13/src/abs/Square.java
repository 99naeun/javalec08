package abs;

public class Square extends Shape {
	
	//�⺻������
	public Square() {
	
		this.type = "�簢��";
		
	}
	//���������޼���(Shape �� �߻�޼���)
	@Override
	public void ���̱��ϱ�() {
		this.printMyType();
		System.out.println("���� : " + x );
		System.out.println("�غ� : " + y );
		int result = x * y;
		System.out.println("���� : " + result);
	}

}
