import java.util.Arrays;

public class ArrayExample01 {
	
	public static void main(String args[]) {
		
		// 1. �迭�� �����ϴ� ��. <--�迭����(���� �� ��)�� ������ �ʾҴ�
		int a[];
		int [] b;
		// int d;
		
		// 2. ����� ���ÿ� �ʱ�ȭ
		int c[] = {1,2,3}; // ��3�� ¥�� �迭 ����
		
		// 3. ���� + ����� �Ҵ�
		int[] d = new int[10];
		
	
		System.out.println("c������ 2��° �濡 �ִ� �� - c[1]" + c[1]);
		c[0]= -10;
		System.out.println("c[0] = " + c[0]);
		
		
		// ex
		int x []= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(x)); //�迭�� ����� �ѹ��� ����;��
		System.out.println("x[0]" + x[0]);
		System.out.println("x[1]" + x[1]);
		System.out.println("x[2]" + x[2]);
		System.out.println("x[3]" + x[3]);
		System.out.println("x[4]" + x[4]);
		System.out.println("x[5]" + x[5]);
		System.out.println("x[6]" + x[6]);
		System.out.println("x[7]" + x[7]);
		
		//Array Index Out of Bound Exception �߻�
		//System.out.println("x[8]" + x[8]);->������ �� ������
		
		//hint - �迭�� index�� �迭����-1
		// �迭�� ���̴� �迭����.length
		// for(�ʱⰪ? �迭�� ���� �ε���;�ʱ⺯���� <�迭����;�ʱ⺯��++)
		for(int idx = 0; idx < x.length; idx++) {
			System.out.println("x[" + idx + "] = " + x[idx]);
			
		}
		
		int idx2 = 0;
		while(idx2<=x.length-1) {
			System.out.println("x{"+idx2+"]="+x[idx2]);
			idx2++;
		}
		
		
		//���� for��
		for(int val : x) {
			System.out.println(val);
		}
	}
}
