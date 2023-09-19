
//Math Ŭ������ ����
//Method Overloading(���� �̸��� ���� ��ø)
class Math{
	float add(int x, int y) {
		return x + y;
	}

//	returnŸ�Ը� �ٸ� ���� �޼��� �����ε��� ���� �ʴ´�.
//	int add(int x, int y) {//����Ÿ�Ը� �ٸ� ��쿡�� ��ø�� ������� �ʴ´�.
//		return x + y;				
//	}
	
	int add(int x) {
		return x + x;
	}
	
	float add(float x, float y) {
		return x + y;
	}
}

public class MethodOverloadEx {
	public static void main(String[]args) {
		Math math = new Math();
		System.out.println(math.add(10));
		System.out.println(math.add(10,20));
		System.out.println(math.add(10.0f, 20.0f));
		
		
				
	}

}
