package abs;

public class Tri extends Shape {
	
	public Tri() {
		this.type = "�ﰢ��";
	}
	
//	@Override
//	public void �������Ǿȵ�() {//final �޼��� ������ �ȵ�(����)
//		
//	}
	
	
	@Override
	public void ���̱��ϱ�() {
		this.printMyType();
		System.out.println("���� : " + x);
		System.out.println("�غ� : " + y);
		int result = (int)(x * y * 0.5f);
		System.out.println("���� : " + result);
	}

}
