package computer.persp;

public class GeForce extends VideoCard {
	
	
	@Override
	public void showMonitor(String text) {
		this.directX����();
		super.showMonitor("���� geforce " + text);
	}

	public void directX����() {
		System.out.println("���� directX�� ��������");
	}

}
