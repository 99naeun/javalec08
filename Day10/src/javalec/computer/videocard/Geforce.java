package javalec.computer.videocard;

// ����������
// public > protected > default > private
// ������ �����ϰ��� �ϴ� ���� ����ΰ�?
// Ŭ����, Ŭ���� �ɹ��� ��� ���������ڸ� �� �� �ִ�.
// 1.Ŭ����
// 2.�Ӽ�(�ɹ�����)
// 3.�޼���(�ɹ��޼���)
// 4.������(�޼���) <-- ���� �� ������, �ַ� public

public class Geforce {	
	
	//�ɹ�����
//	public String modelName;
//	private int price = 1000;
	
	//������(�޼���)
	//1.����Ÿ�� ����
	//2.Ŭ������� ������(�޼���)�� ����
	public Geforce() {
		super();
//		modelName = "�Ͼ��Ͼ�";
//		price = 1000;
	}
	
	public Geforce(String model) {
		modelName = model;
		price = 10;
		final int a;
		a = 10;
	}
	
	// �����ڸ޼���
	
	public String modelName;
	private int price;
	
	public void showModel() {
		System.out.println("Radeon");
}

   public void turnOnMonitor() {
	   System.out.println("����� �ѿ�!");
}

   // default �޼���
   void defaultPrintName() {
	   System.out.println("����Ʈ �޼����");
   }
   // protected
   protected void protectedPrintName() {
	   System.out.println("�� ������Ƽ���");
   }
   
   private void privatePrintName() {
	   System.out.println("�� private");
   }
}
