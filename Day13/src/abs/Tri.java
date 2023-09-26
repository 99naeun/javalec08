package abs;

public class Tri extends Shape {
	
	public Tri() {
		this.type = "삼각형";
	}
	
//	@Override
//	public void 나제정의안돼() {//final 메서드 제정의 안됨(에러)
//		
//	}
	
	
	@Override
	public void 넓이구하기() {
		this.printMyType();
		System.out.println("높이 : " + x);
		System.out.println("밑변 : " + y);
		int result = (int)(x * y * 0.5f);
		System.out.println("넓이 : " + result);
	}

}
