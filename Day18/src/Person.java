
public class Person {
	int stdNo;//�й�
	String name;//�̸�
	int point;//�������
	
Person(int stdNo, String name, int point){
	this.stdNo = stdNo;
	this.name = name;
	this.point = point;
}


@Override
public String toString() {
	return String.format("�й� : %d / �̸� : %s / ���� : %d",stdNo, name, point);
}
}
