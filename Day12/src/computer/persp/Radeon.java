package computer.persp;

public class Radeon extends VideoCard{
	
	@Override
	public void showMonitor(String text) {
		����3d����();
		System.out.println("�������" + text);
	}
	
	//�����ε�
	public void showMonitor() {
		this.showMonitor(" �̰� �ڽİ�ü�� showMonitor");
		super.showMonitor(" �̰� �θ�ü�� showMonitor");
		
	}
	
	
	public void ����3d����() {
		System.out.println("Radeon 3D ����");
	}

}
