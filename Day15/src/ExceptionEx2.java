import java.util.InputMismatchException;
import java.util.Scanner;

class Student{
	
	String name;
	int grade;
	
	Student(String name, int grade){//������
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student[name : " + name + ", grade : " + grade + "]";
	}
}

public class ExceptionEx2 {
	
	static Student[] students = new Student[3];//�л����
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int grade = 0;
		int studentIdx = 0;//--�迭 �ε���
		
		while(true) {
		System.out.println("�̸��� �Է��ϼ���. : ");
		name = scanner.nextLine();
		try {
		System.out.println("�г��� �Է����ּ���. : ");
		grade = Integer.parseInt(scanner.nextLine());
		students[studentIdx++] = new Student(name,grade);
		}catch(InputMismatchException ex) {
			System.out.println("�г��� ���ڸ� �Է��� �ּ���.");
			continue;
		}catch(ArrayIndexOutOfBoundsException ex) { //�迭 ���� �ʰ�
			System.out.println("���� �� á���ϴ�.");
			break;
		}catch(Exception ex) {
			System.out.println("�� �� ���� ���ܰ� �߻��Ͽ����ϴ�.");
			continue;
		}
		System.out.println(studentIdx + "���� �л��� ����Ǿ����ϴ�.");
		
		for(Student std : students) {//���� for��
			System.out.println(std);//or System.out.println(std.toString());
		}
		
		
		System.out.println("�Է� : " + name);
		System.out.println("�г� : " + grade);
		
	}
	}
}
