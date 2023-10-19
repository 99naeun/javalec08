package repository;

import java.util.List;
import entity.Student;

public interface Repository {
	
	//CRUD
	//1. Read(Select)
	//�л���� ��ü ������
	List<Student> selectStudents() throws Exception;
	
	//�л����� �ϳ� �ҷ�����(�й� �������� Where �ؿͶ�)
	Student SelectStudent(int stdNo) throws Exception;
	
	//�л��̸����� �л����� �ҷ�����
	//���������� ������ �� ������ 
	List<Student> selectStudent(String name) throws Exception;
	
	//���� �߰��� �л� �ϳ� �ҷ�����
	Student lastInsertedStudent() throws Exception;

	//2.Create(Insert)
	//�л� �Է��ϱ�
	boolean registStudent(Student student) throws Exception;
	
	//3.Update(update)
	//�л� �Ѹ� �����ϱ�
	int updateStudent(int stdNo, Student student) throws Exception;
	
	//4.Delete(Delete)
	//�л� �Ѹ� �����ϱ�
	boolean deleteStudent(int stdNo) throws Exception;
	
	//5.�ڿ��ݳ�(DB Close)
	void closeRepository() throws Exception;
	
}
