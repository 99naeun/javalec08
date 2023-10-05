package winterface;

public class PaymentProcess {

	public void paygo(Paymethod p) {
		p.pay();
	}
	
	public static void main(String args[]) {
		PaymentProcess pp = new PaymentProcess();
		//Paymethod p = new Paymethod();//Payment 인터페이스 new X
		Paymethod cash = new Cash();
		Paymethod card = new Card();
		Bank bank = new Cash();//다형성
		
		pp.paygo(card);
		System.out.println("===========");
		pp.paygo(cash);
		System.out.println("===========");
		bank.저축();
		
		//Paymehtod cash;
		cash.pay();
		//cash.저축();//Paymethod의 통신규약에 pay밖에 없기 때문(정의되어있어도 둘중 하나만 가능)
		
		//타입캐스팅
		((Bank)cash).저축();
		
		//Bank bank = new Cash();
		bank.저축();
		//bank.pay();//에러->뱅크에는 페이가 없기 때문
		((Paymethod)bank).pay();
		
		Cash c = new Cash();
		c.저축();
		c.pay();
		
		//paygo 메서드는 pay타입의 메서드를 받기 때문에 가능하다.
		
		//pp.paygo(p);
		
		cash.payback();//cash는 payback() 지원 - 재정의
		card.payback();//card는 payback() 미지원 - 재정의 안함
		
		
		//익명구현객체
		Paymethod pp2 = new Paymethod() {

			@Override
			public void pay() {
				System.out.println("익명구현객체");
			}
			
		};
		
		pp2.pay();
		
		if(pp2 instanceof Paymethod) {
			System.out.println("pp2는 Paymethod의 자식이거나 본체");
		}
		
	}
}


