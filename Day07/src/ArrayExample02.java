
public class ArrayExample02 {
	
	
	// ������ �迭 ���
	public static void main(String args[]) {
		
		//1. 2���� �迭 ����
		int[][] matrix; // int matrix[][];
		
		//2. 2�����迭 ����� ���ÿ�, ������ ������ �����(��x)
		//int a[] = new int[5]
		int[][]matrix2 = new int[2][4]; 
		// 2���� ������ �̷�����ִ� ����Ʈ ����
		// �ѵ��� ���� 4���� �����Ǿ��ִ�.
		// = matrix ����Ʈ ������ �� 8������ ���.
		// ? �� ģ���� ���� 1�� 3ȣ �Դϴ�. �� ģ�� �� �ҷ��ּ���.
		//-> 0�� 2ȣ�� ���� -> matrix[0][2];
		
		//3. �迭 ����� ���ÿ� �ʱ�ȭ
		int m[]= {1,2,3};
		int matrix3[][]= { 
				{1,2,3,4},
				{5,6,7,8} 
		};
		
		for(int idx1 = 0; idx1 < matrix3.length; idx1++) {
			for(int idx2=0; idx2< matrix3[idx1].length; idx2 ++) {
				System.out.println("matrix3["+idx1+"]["+idx2+"] = " + matrix3[idx1][idx2]); 
			}
		}
		//���� "matrix3["+idx1+"]["+idx2+"]	<--�� ����� �����ϰ�
		//matrix3[0][0]=1������ ��������ʰ�,
		//�׳� ����� �ִ� ���� ����ϴ� ��������
		//���� for������ ����غ�����.
		

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
		
	


