
public class Application {

	//�̵��ϴٶ�� ������ �ְ�, ������ ���ڷ�(Ż��)
	public void �̵��ϴ�(Vehicle vh) {
		vh.moveForward();
		vh.moveBackward();
		//vh.�˳���();
		((Car)vh).�˳���();
	}
		public void �̵��ϴ�(CarWoExtend vh) {
			vh.moveForward();
			vh.moveBackward();
	}
	
	public static void main(String args[]) {
		Application ap = new Application();
//		Vehicle vh = new Vehicle();
//		Vehicle vh = new Car();//������
		Vehicle vh = new Bus();
		CarWoExtend cw = new CarWoExtend();
		ap.�̵��ϴ�(vh);
//		ap.�̵��ϴ�(cw);
	}
}
