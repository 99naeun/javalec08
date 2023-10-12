
//
class Member implements Cloneable {//extend Object
	String name;
	Member(String name){
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println(String.format("Hello, %s", name));
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return String.format("name %s @ %s", this.name, this.hashCode());
	}
	
	@Override
	public boolean equals(Object m) {
		return this.name.equals(((Member)m).name);
	}
}
public class CloneEx {
	
	public static void main(String args[]) throws Exception {
		Member member = new Member("������");
		Member member2 = member; //���� ����
		Member member3 = (Member)member.clone(); //���� ����
		int[] a = {1,2,3};
		int[]b = a; //���� ����
		int[]c = a.clone(); //���� ����
		
		System.out.println(member);
		System.out.println(member2);
		System.out.println(member3);
		
		member2.name = "�Ͼ��Ͼ�";
		
		System.out.println(member);
		System.out.println(member2);
		System.out.println(member3);
		
		//equals
		Member m1 = new Member("������");
		Member m2 = new Member("������");
		System.out.println("m1 == m2 = "+(m1 == m2));
		System.out.println("m1.equals(m2) = "+(m1.equals(m2)));
		
		
	}

}
