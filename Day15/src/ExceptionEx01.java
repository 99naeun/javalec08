
public class ExceptionEx01 {

	public static void main(String args[]) {
	
		int x = 10;
		int y = 0;
		int result = 0;
		
		try {
		  result = x / y;//���ܰ� �߻��� �� �ִ� ����
		}catch(ArithmeticException ex) {
			//�߻��ϸ�, ex������ �Ҵ�
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			System.out.println(ex.getMessage());
		}catch(Exception ex) {
			System.out.println("�˼� ���� ���ܰ� �߻��Ͽ����ϴ�.");
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("�ڿ��ݳ�");
			result = -1;
					
		}
		
		System.out.println("result : "+ result);
	}
}
