
// ���������� class Ŭ������{
   //..Ŭ���� ���Ǻ�
   //..1.�ʵ�(�Ӽ�) - �繰�� ������ ������(��)
   //..2.������()
   //..3.�޼���() - ���� ���

//}
public class CalClassEx01 {
	
	//�ʵ�(�Ӽ�) = Ŭ���� ����
	//���������� ���������� ����/�����
	public int x;
	int y;
	public String name = "CalClassEx01�Դϴ�.";

	//public int myAssets = 100000000;
	//�޼���(����/���)
	//���������� static or blank ����Ÿ�� �޼����(�Ű�����){
	//..�޼��� ���Ǻ�
	//}
	public int add(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public float ������(int x) {
		return x * x * 3.14f;
	}
	public void printMyName(){
		System.out.println(name);
	}
}
