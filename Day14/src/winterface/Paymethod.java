package winterface;

//���������� interface �������̽���

public interface Paymethod {

	abstract void pay();//�߻�޼���
	//void payback();//�߻�޼���->�߰��� �߰��� ��� ���� ���� Ŭ������ ����(payback() ��������)
	
	default void payback() { //**����ȣȯ���� ����
		System.out.println("ȯ��");
	}
	
	//void pay();����
//	void pay2() {
//		//������
//	}
		
	
}
