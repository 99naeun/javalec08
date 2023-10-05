package winterface;

public class PaymentProcess {

	public void paygo(Paymethod p) {
		p.pay();
	}
	
	public static void main(String args[]) {
		PaymentProcess pp = new PaymentProcess();
		//Paymethod p = new Paymethod();//Payment �������̽� new X
		Paymethod cash = new Cash();
		Paymethod card = new Card();
		Bank bank = new Cash();//������
		
		pp.paygo(card);
		System.out.println("===========");
		pp.paygo(cash);
		System.out.println("===========");
		bank.����();
		
		//Paymehtod cash;
		cash.pay();
		//cash.����();//Paymethod�� ��űԾ࿡ pay�ۿ� ���� ����(���ǵǾ��־ ���� �ϳ��� ����)
		
		//Ÿ��ĳ����
		((Bank)cash).����();
		
		//Bank bank = new Cash();
		bank.����();
		//bank.pay();//����->��ũ���� ���̰� ���� ����
		((Paymethod)bank).pay();
		
		Cash c = new Cash();
		c.����();
		c.pay();
		
		//paygo �޼���� payŸ���� �޼��带 �ޱ� ������ �����ϴ�.
		
		//pp.paygo(p);
		
		cash.payback();//cash�� payback() ���� - ������
		card.payback();//card�� payback() ������ - ������ ����
		
		
		//�͸�����ü
		Paymethod pp2 = new Paymethod() {

			@Override
			public void pay() {
				System.out.println("�͸�����ü");
			}
			
		};
		
		pp2.pay();
		
		if(pp2 instanceof Paymethod) {
			System.out.println("pp2�� Paymethod�� �ڽ��̰ų� ��ü");
		}
		
	}
}


