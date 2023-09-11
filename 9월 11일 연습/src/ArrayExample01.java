import java.util.Arrays;

public class ArrayExample01 {
	public static void main(String args[]) {
		int a[];
		int [] b;
		
		int c[] = {1,2,3};
		
		int[]d = new int[10];
		
		System.out.println("c변수에 2번째 방에 있는 값 - c[1]"+c[1]);
		
		int x []= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(x));
		System.out.println("x[0]" + x[0]);
		System.out.println("x[1]" + x[1]);
		System.out.println("x[2]" + x[2]);
		System.out.println("x[3]" + x[3]);
		System.out.println("x[4]" + x[4]);
		System.out.println("x[5]" + x[5]);
		System.out.println("x[6]" + x[6]);
		System.out.println("x[7]" + x[7]);
		
		for(int idx = 0; idx < x.length; idx++) {
			System.out.println("x[" + idx + "] = " + x[idx]);
		
	}
		int idx2 = 0;
		while(idx2<=x.length-1) {
			System.out.println("x{"+idx2+"]="+x[idx2]);
			idx2++;
}
		for(int val : x) {
			System.out.println(val);
		}
}
}