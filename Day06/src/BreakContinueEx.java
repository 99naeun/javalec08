import java.util.Scanner;

public class BreakContinueEx {
	
	public static void main(String args[]) {
		
		
		byte b =(byte)128;
		System.out.println(b); //�ּڰ��� ���
		System.out.println(~b); //�ִ��� ���
		
		byte c = 1; 
		System.out.println((byte)(c<<7)); // => 10000000
		System.out.println(~(c<<7)); // => 00000001
		
		byte d = -1; // 1111 1111
		System.out.println((byte)(d>>>1)); // 0111 1111
		
		int command = 0;
		
		for(;;) { //���ѷ���
			System.out.print("���ڸ� �Է��ϼ���.(���α׷� ����� -) : ");
			Scanner in = new Scanner(System.in);  
			// System.in Ű���� ���� �д´�(Ű���� �� ���)
			command=in.nextInt();
			
			if(command < 0) { //������� �Է°��� �����̸�
				break; //�ݺ����� �����ڴ�.
			}
			System.out.println("�Է°���" + command + "�Դϴ�.");
				
		}// for loop�� ��
				//<--
			System.out.println("���α׷� ����");
					
	}

}

