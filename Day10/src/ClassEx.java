
// �⺻������ �ڹٶ�� ���� ��� Ŭ������ �̷�����ֽ��ϴ�.
// �ּ� ���� 1���� �ϳ�(Ȥ�� �ϳ� �̻�)�� Ŭ������ ���ǵǾ�� �մϴ�.
// Ŭ���� ���� ����
// ���������� class Ŭ������{ ��� ... }
// �ɹ��� �����伭
// 1.�ʵ�/�������/�Ӽ� -> Ŭ���� ��������/���
// 2.�޼��� -> Ŭ������ ���/������ ����
// 3.������(�޼���) -> Ŭ������ ��ü�� �����ϴ� ����/����� ����
// ! ���� 3���� �ɹ��� �� ���ǵǾ�� �ϴ� ���� �ƴϴ�.

class Nvidia{
	String modelName;
	String modelNo;
	void echoModel() {//�𵨸��� ���ϴ� ��
		System.out.println("modelName : "+modelName);
		System.out.println("modelNo : "+ modelNo);
	}
	
	void showMonitor() { //����Ϳ� �׷����� ǥ���ϴ�.
		System.out.println("����;� ���Ͷ�!");
	}
}


public class ClassEx {
	
	public static void main(String args[]) {// main �޼���
		                                    // App ��Ÿ�� ���ε�
		// 1. Nvidia ��ü�� ��������.
		Nvidia video = new Nvidia();//Nvidia();<--������ �޼���
		// 2. ��ü�� �޼��峪, �Ӽ��� �����ϰ��� �� �� ����ϴ� ������
		//.<-- ��~
		// �Ӽ��� ���� ����
		video.modelName = "Geforce";
		video.modelNo = "3770";
		
		System.out.println(video.modelName);
		
		// �޼��� ���� ȣ��
		video.echoModel();
		video.showMonitor();
		
		String a ="������";
		java.lang.String b ="������";
		//java/lang/String.class
		

	}

}

//
//class ClassEx2{
//	
//}