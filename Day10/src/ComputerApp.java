import javalec.computer.videocard.Geforce;
import javalec.computer.videocard.Radeon;



public class ComputerApp {
	
	public static void main(String args[]) {
		// �ٸ� ������ �ִ� GeForce�� Radeon ��ü�� �����ϰ� �ϰ� �ʹ�. ���?
		
//		javalec.computer.videocard.Geforce video1 = new javalec.computer.videocard.Geforce();
		Geforce video1 = new Geforce();
		video1.turnOnMonitor();
//		video1.defaultPrintName();
//		video1.protectedPrintName();
		
		Radeon video2 = new Radeon();
		video2.turnOnMonitor();
				
	}

}
