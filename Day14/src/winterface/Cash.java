package winterface;

public class Cash implements Paymethod, Bank {

		@Override
		public void pay() {
			System.out.println("�������� �����մϴ�.");
			System.out.println("������ 0%");
	}
		@Override
		public void payback() {
			System.out.println("���� ȯ��");
		}

		@Override
		public void ����() {
			System.out.println("�����ϴ�");
			
		}

}
