//�����Բ� Ȯ���ؼ� ����Ǯ�� �ϱ�

class User{
	String name;
	int age;
	User(String name, int age){
		this.name = name;
		this.age = age;
		}
	
	boolean isSameUser(User user) { //���������̳�?
		return this.name.equals(user.name);
	}
	boolean isSameUser2(User user) { //��������+���̵� ����?
		return this.name.equals(user.name)&& this.age == user.age;
}
}
	
	interface InterA{
		boolean isSameUser(User user1, User user2);
		boolean isSameUser2(User user1, User user2);
	}
	




public class Lambda {

	public static void main(String args[]) {
		
		User user1 = new User("������",10);
		User user2 = new User("������",29);
		System.out.println("��������? : "+user1.isSameUser(user2));//��������?
		System.out.println("��������+����? : "+user1.isSameUser2(user2));
		
		
		//�����Բ� Ȯ���ؼ� ����Ǯ�� �ϱ�
	//boolean isSameUser(User user1, User user2);
		InterB a = (x,y) -> {
			return x.name.equals(.name);
		};
		
		InterB b = (t,v) -> t.name.equals(v,name) && t.age == v.age;
	}
	
}
}
