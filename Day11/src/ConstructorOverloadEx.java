
//������(�޼���)�����ε�
//�޼��� �����ε��� �Ȱ���(������ ��, ������ ������Ÿ��)



class Student{
	String name;//�л� �̸�
	int grade;//�г�
	
	
	//�⺻������ ����
	public Student() {
		this("ȫ�浿",1);
	}
	
	
	//���� �ϳ�(String)�� �޴� ������ �����ε�
	public Student(String stdName) {
		this(stdName,1);
		name = stdName;
		grade = 1;
	}
	//���� �ΰ�(String, int)�� �޴� ������ �����ε�
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	//�Ű������� ������Ÿ���� �޶� �����ε��� ����
	public Student(int grade, String name) {
		this.name = name;
		this.grade = grade;
	}
	
	public void printMe() {
		System.out.println("�� �̸��� "+name+" "+grade+"�г��Դϴ�.");
	}
}

public class ConstructorOverloadEx {
	public static void main(String args[]) {
		
		Student std1 = new Student(); //�⺻������
		Student std2 = new Student("�Ͼ���");//�����ϳ�
		Student std3 = new Student("�Ͼ��Ͼ�",6);//����2��
		Student std4 = new Student(7,"�Ͼ��Ͼ�2");//����2��
		
		std1.printMe();
		std2.printMe();
		std3.printMe();
		std4.printMe();
				
	}

}
