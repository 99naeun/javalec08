// �޼��带 ����
// �޼������ sliceArray
// ���ڴ� int[], int from
// ����� return int[]
// ���๮�� ���ڷ� ���� int[]�� �迭�� from �ε������� �������� �迭���� �����ؼ� return�ض�.
// ex) ���� int[] a = {1,2,3,4,5};
// int[] b = sliceArray(a,1);
// System.out.println(Arrays.toString(b)); -->{2,3,4,5}

import java.util.Arrays;

public class Assignment {
	
	// �޼��带 ����
	// �޼������ sliceArray
	// ���ڴ� int[], int from
	// ����� return int[]
	static int[] sliceArray(int[] x, int from) {
		
		//1. ������ temp �迭�� ���������.
		int[] result = new int[x.length - from];
		
		//2.������� �迭������ ���ڷ� �Ѿ�� x �迭���� ���� ����
		// i = result�� �ε���, from�� x �迭�� �ε���
		// for(a;b;c) -> a,b,c�� ����/ ���� �� �� �ִ�.
		// (�ݵ�� ���� ��� �� �ƴ�)
		for(int i = 0;from<x.length;from++) {
			result[i++] = x[from];
		}
		return result;
		// ex) ���� int[] a = {1,2,3,4,5}; 5-1, 5-2 ...
		// int[] b = sliceArray(a,1);
		// System.out.println(Arrays.toString(b)); -->{2,3,4,5}

	}
	public static void main(String args[]) {
		
		int[]x = {1,2,3,4,5,6,7,8,9,10}; 
		//{4,5,6,7,8,9,10}�� �� 7��¥�� �迭�� ����� �ʹ�.
		//sliceArray( x, 3);
		int[] r = sliceArray(x,3);
		int[] a = sliceArray(r,4);
		
		//�ֻ�ܿ� import java.util.Arrays;�߰�
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(a));
		
		
	}

}
