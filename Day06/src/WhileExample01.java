
public class WhileExample01 {
	
	//while, do ~ while
	// ex) ������ 1-10������ ���� �� ¦���� ����ϼ���.	
	// �ݺ��� /����(loop)-������
	public static void main(String args[]) {

		for(int i = 1; i<=10;i++) {
			if(i%2==0)System.out.println(i);
		}
		
		int x = 1;
		while(x++ <=10) {
			if(x%2==0)System.out.println(x);
		//	x=x+1;
		}
		
		
		x=1;
		do {
			if(x%2==0)System.out.println(x);
		}while(x++<=10);
		}
		
		}

