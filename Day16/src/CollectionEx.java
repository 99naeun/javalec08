import java.util.*;
public class CollectionEx {
	
	public static void main(String args[]) {
		
		//1.List
		List list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(0);
		System.out.println(list); //1�����
		
		list = Arrays.asList(1,2,3,4,5); //2�����
		System.out.println(list);
		
		list = List.of(1,2,3,4,5,6); //3�����
		System.out.println(list);
		
		int[] t = {1,2,3,4,5}; //4�����
		System.out.println(Arrays.asList(t)); 
		
		//��ü ����ϱ�
		System.out.println("����for��");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("���� for��");
		for(Object v : list) {
			System.out.println(v);
		}
		
		System.out.println("Lambda ��");
		list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);
		
		//List ���̱� �ø���(�迭�� ����� �������� ��)
		System.out.println("List���� ������ ���");
		List testList = new ArrayList();//���(�Һ���ü)
		testList.add(1);
		testList.add(2);
		testList.add(3);
		
		System.out.println(testList);
		
		
		//���� �ø���
		testList.add(10);//->1,2,3,1,1,10
		System.out.println(testList);
		testList.add(2,10);//->1,2,?,3,1,1,10
		System.out.println(testList);
		
		//���� ���̱��?
		testList.remove(0);//->2,-10,3,1,1,10
		System.out.println(testList);
		
		//2.Set
		Set set = new HashSet();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(0);
		System.out.println(set);
		
		
		
//		//��ü ����ϱ�
//				System.out.println("����for��");
//				for(int i = 0; i < set.size(); i++) {
//					System.out.println(set.get(i));
//		}
				
				System.out.println("���� for��");
				for(Object v : list) {
					System.out.println(v);
				}
				
				System.out.println("Lambda ��");
				set.forEach(x -> System.out.println(x));
				set.forEach(System.out::println);
				
				System.out.println("set ���� ������ ���");
				
				//���� �ø���
				set.add(10);//->1,2,3,1,1,10
				System.out.println(set);
				set.add(10);//->1,2,?,3,1,1,10
				System.out.println(set);
				
				//���� ���̱��?
				set.remove(0);//->2,-10,3,1,1,10
				System.out.println(set);
				
				
	}

}
