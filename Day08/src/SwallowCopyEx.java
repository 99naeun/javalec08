import java.util.Arrays;

public class SwallowCopyEx {

	public static void main(String args[]) {
		
		//���� ����� �ּҰ��� �����Ѵ�.(��������-stack��)
		int a[]= {1,2};
		int b[]= {3,4,5};
		System.out.println("a = "+Arrays.toString(a));
		System.out.println("b = "+Arrays.toString(b));
		
		a=b; //���� ����
		b[1]=-10;
		
		System.out.println("�������� a = "+Arrays.toString(a));
		System.out.println("�������� b = "+Arrays.toString(b));
	}
}
