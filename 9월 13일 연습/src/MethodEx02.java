import java.util.Arrays;

public class MethodEx02 {

	static int getAddAll(int[]x) {
		int result = 0;
		for(int val : x) {
			result += val;
		}
		return result;
	}
	static void printAddAll(int ... x) {
		int result = 0;
		for(int val : x) {
			result += val;
		}
		System.out.println(result);
			
	}
	static void printAddAllDoubleParam(String name, int ... x) {
		System.out.println("나는 " + name + "입니다.");
		System.out.println("저한테 넘어온 int ...x 는");
		for( int i = 0; i < x.length; i ++) {
			System.out.print(x[i] + "\t"); 
		}
	}
public static void main(String[] args) {
		
		printAddAll(1,2,3,4,5,6,7,8,9); // int ... x 
									 // 가변인자 : 인자의 수를 제한하지 않음
		int[] param = {1,2,3,4,5,6,7,8,9};
		
		int result = getAddAll(param); // int[] x 
									// 배열인자 : 인자의수를 제한하지만, 그 값은 배열의
									// 길이 제한이 없다. 
		
		System.out.println(result);
		
		printAddAllDoubleParam("이종석",1,2,3,4,5,6,10); 

		int[] a = {1,2,3,4,5,6,7,8,9,10}; 
		int[] b = sliceArray(a, 2); 
		System.out.println();
		System.out.println(Arrays.toString(b)); // [3, 4, 5]
		// Arrays 맨 위에다가 import java.util.Arrays;
}
	
}


