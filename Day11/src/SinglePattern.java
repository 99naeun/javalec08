
public class SinglePattern {
	int sharedData = 0; //��ü �������
	private static SinglePattern sp = null;
	//static��ü��������
	
	//�̱��� �������� ��ü ����
	public static SinglePattern getInStance() {
		if(sp == null) {
			sp = new SinglePattern();
	}
	return sp;
}
	public void printSharedData() {//��ü �ɹ� �޼���
		System.out.println(++sharedData);
	}
}
