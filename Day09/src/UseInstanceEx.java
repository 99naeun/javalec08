
public class UseInstanceEx {
	public static void main(String[]args) {
		
		//앗 난 원주율을 구하고 싶어!!;
		//반지름은 5야
		CalClassEx01 cal = new CalClassEx01();
		CalClassEx01 cal2 = new CalClassEx01();
		//new를 통해 생성된 객체는 다른 객체다.(다른 결과값 산출)
		cal.printMyName();
		float result = cal.원주율(4);
		System.out.println(result);
		
		cal2.printMyName();
		result = cal.원주율(10);
		System.out.println(result);
		
		System.out.println(cal == cal2);
		
		
		int a = 10;
		System.out.println("이종석");
		int[] b = {1,2,3};
		
	}

}
