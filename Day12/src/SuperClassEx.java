
public class SuperClassEx {

	
	String className;
	
	public SuperClassEx() {
		System.out.println("SuperClassEx ����");
		this.className = "�ƺ�Ŭ�����Դϴ�.";
	}
	
	public SuperClassEx(String className) {
		System.out.println("SŬ���� �����ִ� ������ ȣ��");
		this.className = className;
	}
	
	public void printClassName() {
		System.out.println(this.className);
	}
}
