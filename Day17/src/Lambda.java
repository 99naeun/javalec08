//선생님꺼 확인해서 문제풀이 하기

class User{
	String name;
	int age;
	User(String name, int age){
		this.name = name;
		this.age = age;
		}
	
	boolean isSameUser(User user) { //동명이인이냐?
		return this.name.equals(user.name);
	}
	boolean isSameUser2(User user) { //동명이인+나이도 같냐?
		return this.name.equals(user.name)&& this.age == user.age;
}
}
	
	interface InterA{
		boolean isSameUser(User user1, User user2);
		boolean isSameUser2(User user1, User user2);
	}
	




public class Lambda {

	public static void main(String args[]) {
		
		User user1 = new User("이종석",10);
		User user2 = new User("이종석",29);
		System.out.println("동명이인? : "+user1.isSameUser(user2));//동명이인?
		System.out.println("동명이인+동갑? : "+user1.isSameUser2(user2));
		
		
		//선생님꺼 확인해서 문제풀이 하기
	//boolean isSameUser(User user1, User user2);
		InterB a = (x,y) -> {
			return x.name.equals(.name);
		};
		
		InterB b = (t,v) -> t.name.equals(v,name) && t.age == v.age;
	}
	
}
}
