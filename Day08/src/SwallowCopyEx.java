import java.util.Arrays;

public class SwallowCopyEx {

	public static void main(String args[]) {
		
		//얕은 복사는 주소값만 복사한다.(변수공간-stack에)
		int a[]= {1,2};
		int b[]= {3,4,5};
		System.out.println("a = "+Arrays.toString(a));
		System.out.println("b = "+Arrays.toString(b));
		
		a=b; //얕은 복사
		b[1]=-10;
		
		System.out.println("얕은복사 a = "+Arrays.toString(a));
		System.out.println("얕은복사 b = "+Arrays.toString(b));
	}
}
