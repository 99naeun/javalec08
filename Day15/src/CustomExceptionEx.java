import java.util.Scanner;

class LoginException extends Exception{
	LoginException(String message){
		super(message);
	}
}

public class CustomExceptionEx {
	
	public static void main(String args[]) throws LoginException{
		String dbId = "lodossw";
		String dbPwd = "12345";
		int try_cnt = 0;
		
		while(try_cnt<3) {
		Scanner scanner = new Scanner(System.in);//����� �Է¹޴� ��ü
		System.out.print("���̵� �Է����ּ���. : ");
		String id = scanner.nextLine();//����� �Է� ���(����ĥ������)
		System.out.print("��й�ȣ�� �Է����ּ���. : ");
		String password = scanner.nextLine();//����� �Է� ���(����ĥ������)
		
		if(dbId.equals(id) && dbPwd.equals(password)) {
			System.out.println("�α��� ����");
			break;
		}else {
			try {
			throw new LoginException("���̵�� ��й�ȣ�� Ȯ�����ּ���.");
			}catch(LoginException ex) {
				try_cnt ++;
			System.out.println(ex.getMessage());
			}catch(Exception ex) {	
			System.out.println(ex.getMessage());	
			}
		}
		}
	}

}
