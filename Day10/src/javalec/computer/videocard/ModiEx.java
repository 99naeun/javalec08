package javalec.computer.videocard;

public class ModiEx {
	
	public static void main(String args[]) {
		Geforce video1 = new Geforce();
		video1.defaultPrintName();
//		video1.protectedPrintName();
//		video1.privatedPrintName(); // private�� �ڱ��ڽŸ� 
		                            // ModiEx�� Geforce�� �ٸ� ��ü�ϱ�
	
		Geforce video2 = new Geforce();
		Geforce video3 = new Geforce("�ɳɳ�");
		
		System.out.println(video2.modelName);
		System.out.println(video3.modelName);
	
	}

}
