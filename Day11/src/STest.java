
public class STest {

	public static void main(String args[]) {
		
		//1. �׳� ��ü�� ����������.
		SinglePattern s1 = new SinglePattern();
		SinglePattern s2 = new SinglePattern();
		SinglePattern s3 = new SinglePattern();
		s1.printSharedData();
		s2.printSharedData();
		s3.printSharedData();
		System.out.println("s1 = " + System.identityHashCode(s1));
		System.out.println("s2 = " + System.identityHashCode(s2));
		System.out.println("s3 = " + System.identityHashCode(s3));
		
		//2.�̱��� �޼��� getInstance();
		SinglePattern s11 = SinglePattern.getInStance();
		SinglePattern s12 = SinglePattern.getInStance();
		SinglePattern s13 = SinglePattern.getInStance();
		s11.printSharedData();
		s12.printSharedData();
		s13.printSharedData();
		System.out.println("s11 = " + System.identityHashCode(s11));
		System.out.println("s12 = " + System.identityHashCode(s12));
		System.out.println("s13 = " + System.identityHashCode(s13));
		
		
	}
}
