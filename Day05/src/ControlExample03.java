// ���
// 1. ��������,  2. �ݺ�����
public class ControlExample03 {
	
	public static void mai(String args[]) {
		
		// 1. ��������� 
		// 1-1 if
		// 1-2 switch ~ case
		
		int a = 1;
		
		if(a<0) { 
			//if(condition) {���๮}
			// condition�� true�� ��쿡 {} �� ���� �����Ų��.
			System.out.println("a�� �����Դϴ�.");
			
		} else {
			//if(condition){���๮}
			//condition�� false�϶� ����
		}
//			if(a>0) {
//				System.out.println("a�� ����Դϴ�.");
//			}
			
		int grade = 5;//�ʵ��б� �г�
		// 1-3 ���г� if(grade<=3) {}
		// 4�г��� �߰� if(grade==4) {}
		// 5-6 ���г� if(grade>=5) {} 
		// �� �ܿ��� �ٽ� �־��ּ���.

		if(grade>=1 && grade <=3) {
			System.out.println("���г�");
		}else if(grade>=5 && grade <=6) {
			System.out.println("���г�");
		}else if(grade==4) { //else{ �� �ᵵ �����ϴ�
			System.out.println("�߰��г�");
		}else {
			System.out.println("�Է°��� 1-6���� �Դϴ�.");
			
		
		}
		
		
		
		//Switch ~ case
		
		int x = 10;
		
		switch(x) {
		
		  case 1 :
			  System.out.println("x�� 1�Դϴ�.");
			  break;
			  
		  case 10 : 
			  System.out.println("x�� 10�Դϴ�.");
			  break;
			  
		  case 3 : 
			  System.out.println("x�� 3�Դϴ�.");
			  break;
			  
		}
			System.out.println("���α׷� ����");
			
	}
	}

	