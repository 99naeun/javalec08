import computer.persp.*;

public class Computer {
	
	public void ����ī��ޱ�(Radeon rd) {
		rd.showMonitor("ȭ���� ���Ϳ�.");
	}
	
	public void �������ī��ޱ�(VideoCard vd) {
		vd.showMonitor("ȭ���� ���Ϳ�");
	}

	public static void main(String args[]) {
		
		Radeon rd = new Radeon();
		rd.showMonitor("ȭ���� ������ּ���");//�������̵� �� �ڽ� �޼��� ȣ��
		rd.showMonitor();//�����ε� �� �ڽ� �޼��带 ȣ���ϴµ�, �� ������ this.showMonitor(String), super.showMonitor(String)
		
		VideoCard video  = new Radeon();
		VideoCard video2 = new GeForce();
		
		video.showMonitor("�̰� �θ� ȣ���ұ�? �ڽ��� ȣ���ұ�?");
		
		//1.��ü����
		Computer com = new Computer();
		com.����ī��ޱ�(new Radeon()); //OK
//		com.����ī��ޱ�(new GeForce());//����
		
		com.�������ī��ޱ�(new Radeon());
		com.�������ī��ޱ�(new GeForce());
	}
}
