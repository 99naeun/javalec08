
public class ForExample01 {
	
		
		public static void main(String args[]) {
			
			//for
			//for(�ʱ�ȭ��;���ǹ�;������){
			//���๮
			//}
			
			// 1-10������ ������ ¦���� ����ϼ���.
			
			for(int i = 1; i<=10;i++) {
				if(i % 2 == 0)System.out.println(i);
				
				
				int a;
				for(a=1;a<10;a++) {
					if(a%2==0)System.out.println(a);
					
					int b = 1;
					for(; b<=10 ; b++) {
						if(a%2==0)System.out.println(a);
					}
				}
				
				for(;;) { //���ǽĺκ��� ������ true ���ѷ���)
				
				
				}
			}

		}
	}



