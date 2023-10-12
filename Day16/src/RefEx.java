import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import members.User;

public class RefEx {

	public static void main(String args[]) throws Exception {
		Class c1 = Class.forName("members.User");
		System.out.println("������ ���==============================");
		Constructor[] con = c1.getConstructors();
		for(Constructor v : con) {
			System.out.println(v);
		}
	
	
	System.out.println("�Ӽ�===========================");
	Field[] fields = c1.getFields();
	for(Field v : fields) {
		System.out.println(v);
	}
	
	System.out.println("����(�޼���)=====================");
	//c1.getMethods();// �θ����� �ڽ��� ��� �޼��� ��Ÿ�����͸� ������ �Ͷ�
	Method[] members = c1.getDeclaredMethods();
	for(Method v : members) {
		System.out.println(v);
	}
	
	//��ü ����
	//User a = new User();
//	Constructor constructor = c1.getConstructor();
//	User user = (User)constructor.newInstance("������","lodossw","12345");
//	user.printUserInfo();
	
	System.out.println("��ü ���� -> printUserInfo()");
	Constructor constructor = c1.getConstructor(String.class, String.class, String.class);
	User user = (User)constructor.newInstance("������","lodossw","12345");
	user.printUserInfo();
//	user.printUserPassword();//Private�ϱ� ȣ���� �Ұ�
	
	System.out.println("Method��ü�� ȣ��(invoke) -> printUserInfo()");
	Method printUserInfo = c1.getDeclaredMethod("printUserInfo", null);
	printUserInfo.invoke(user, null);
	
	System.out.println("Method ��ü�� private ȣ��(invoke) ->printUserPassword()");
	Method haak = c1.getDeclaredMethod("printUserPassword", null);
	haak.setAccessible(true);//private����ȭ(ĸ��ȭ ����ȭ��)
	haak.invoke(user, null);
}
}
