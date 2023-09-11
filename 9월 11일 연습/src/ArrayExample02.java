
public class ArrayExample02 {
	public static void main(String args[]) {
		
		
		int [][]matrix;
		
		int[][]matrix2 = new int [2][4];
		
		int m[]= {1,2,3};
		int matrix3[][] = {
				{1,2,3,4},
				{5,6,7,8}
		};
		
		for(int idx1 = 0; idx1 < matrix3.length; idx1++) {
			for(int idx2=0; idx2<matrix3[idx1].length; idx2++) {
				System.out.println("matrix3["+idx1+"]["+idx2+"] = "+matrix3[idx1][idx2]);
				
			}
		}
		int x1[] = {1,2,3,4};
		for(int val : x1 ) {
			System.out.println(val);
		}
		
		for(int[] val1 : matrix3) {
			for(int val2:val1) {
				System.out.println(val2);
			}
		}
	}
}
