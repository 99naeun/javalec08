// ���ڸ� ���Ѿ��� �޴� ���
// 1. ���ڸ� �迭�� �ޱ�
//    �޼����(������Ÿ��[] ������)
// 2. ���ڸ� ������Ÿ�� ... ������ ���� �ޱ�
//    �޼����(������Ÿ�� ... ������)

import java.util.Arrays;

public class MethodEx02 {
	
	static int getAddAll(int[] x) {
		int result = 0;
		for(int val : x) {
			result += val;
		}
		return result;
	}
	
	static void printAddAll(int ... x) { //��������
		int result = 0;
		for(int val : x) {
			result += val;
		}
		System.out.println(result);
	}
	
	
//	static void printAddAllDoubleParam(int ... x, String name) -> error
//	�������ڴ� ������ �� �ڿ� ����
	static void printAddAllDoubleParam(String name, int ... x) {
		System.out.println("���� " + name + "�Դϴ�.");
		System.out.println("������ �Ѿ�� int ... x ��");
		for(int i = 0; i < x.length; i++ ) {
			System.out.print(x[i]+"\t");
		}
	}
	
	public static void main(String args[]) { 
		printAddAll(1,2,3,4,5,6,7,8,9); //int ... x 
		                                //������ ���� ������(�ϰ� ���ϴ´��)���� �ްڴ�.(���� ����X)//
		                                //�������� : ������ ���� �������� �ʴ´�.
		
		int [] param = {1,2,3,4,5,6,7,8,9};
		int result = getAddAll(param); //int[]x -> x:�ּҰ��� ���� ���̴ٶ�� ������
		                               //���ڴ� �ϳ��������� �迭�� ���� ���� �ѱ� �� �ִ�.(���� ����O)//
		                               //�迭���� : ������ ���� ����������, �� ���� �迭�� ���� ������ ����.
				
		System.out.println(result);
		
		printAddAllDoubleParam("������",1,2,3,4,5,6,10);
		

		 int[] a = {1,2,3,4,5};
		 int[] b = sliceArray(a,2);
		 System.out.println();
		 System.out.println(Arrays.toString(b));//[3,4,5]
		 // Arrays �� �����ٰ� import java.util.Arrays;
	}



// �޼��带 ����
// �޼������ sliceArray
// ���ڴ� int[], int from
// ����� return int[]
// ���๮�� ���ڷ� ���� int[]�� �迭�� from �ε������� �������� �迭���� �����ؼ� return�ض�.
// ex) ���� int[] a = {1,2,3,4,5};
// int[] b = sliceArray(a,1);
// System.out.println(Arrays.toString(b)); -->{2,3,4,5}


	  
	static int[] sliceArray(int[] x, int from) {
		
		  
		  return null;
	  
	  }
	  
	
}
	
	
	
