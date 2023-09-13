import java.util.Arrays;

public class DeepCopyEx {
	public static void main(String args[]) {
		
		int a[] = {1,2};
		int b[] = {3,4,5};
		int temp[] = new int[3];
		for(int i=0; i<b.length; i++) {
			temp[i] = b[i];
		}
		
		System.out.println("a="+Arrays.toString(a));
		System.out.println("b="+Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		a=temp;
		b[1] =- 10;
		System.out.println("a="+Arrays.toString(a));
		System.out.println("b="+Arrays.toString(b));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		
		int aa[] = {1,2};
		int bb[] = {0,1,2,3};
		bb=aa;
		
		System.out.println("aa("+System.identityHashCode(aa)+")="+Arrays.toString(aa));
		System.out.println("bb("+System.identityHashCode(bb)+")="+Arrays.toString(bb));
	
	
	
	    int cc[] = {1,2};
	    int dd[] = {1,2,3,4,5,6,7,8,9};
	    int ee[] = Arrays.copyOfRange(dd, 2, 5);
	    System.out.println(Arrays.toString(ee));
	}

}
