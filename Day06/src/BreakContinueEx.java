import java.util.Scanner;

public class BreakContinueEx {
	
	public static void main(String args[]) {
		
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

