
public class Car extends Vehicle {

	public void �˳���() {
		System.out.println("�� ������");
	}
	@Override
	public void moveForward() {
		System.out.println("�ڵ��� ������ �̵�");
		System.out.println("�ü� 100km");
	}
	@Override
	public void moveBackward() {
		System.out.println("�ڵ��� �ڷ� �̵�");
		System.out.println("�ü� 50km");
	}
}
