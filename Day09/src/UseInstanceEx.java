
public class UseInstanceEx {
	public static void main(String[]args) {
		
		//�� �� �������� ���ϰ� �;�!!;
		//�������� 5��
		CalClassEx01 cal = new CalClassEx01();
		CalClassEx01 cal2 = new CalClassEx01();
		//new�� ���� ������ ��ü�� �ٸ� ��ü��.(�ٸ� ����� ����)
		cal.printMyName();
		float result = cal.������(4);
		System.out.println(result);
		
		cal2.printMyName();
		result = cal.������(10);
		System.out.println(result);
		
		System.out.println(cal == cal2);
		
		
		int a = 10;
		System.out.println("������");
		int[] b = {1,2,3};
		
	}

}
