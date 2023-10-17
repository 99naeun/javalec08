import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyApp {

	public static void main(String args[]) {
		
		List<Person> list = List.of(
				new Person(1, "A",100),
				new Person(2, "B", 40),
				new Person(3,"C",50),
				new Person(4,"D",20)
				);
		//list�� ������ ��ü ����϶�.
		//1.�⺻ for
		System.out.println("for��====================");
		for(int i = 0; i< list.size(); i++) {
		System.out.println(list.get(i));
		}
		
	
		System.out.println("���� for��===============");
		//2.���� for��
		for(Person p : list) {
			System.out.println(p);
		}
		
		//3.forEach(����)�� ����
		System.out.println("forEach(����)��============");
		list.forEach(v -> System.out.println(v));
//		list.forEach(System.out::print);
		
//		����, ������ 50���̻��� ����� goodPersonList�� ��� �ʹ�.
		List<Person>goodPersonList = new ArrayList<Person>();
		//for���� �ǰ�, ���� for���� �ǰ�, forEach�� ����
		list.forEach(x -> {
			if(x.point >= 50) {
				goodPersonList.add(x);
			}
		});
		
		System.out.println(goodPersonList);
		
		//Stream -> �����ڰ� ���� ��(�ʼ��� �ƴ�)
		//1. ���� -> Source(����)
		//2. ó�� -> �߰�ó��(filter(), map()....)
		//3. ���� -> toList(),collect(), reduce()....
		
		//����, ������ 50�� �̻��� ����� goodPersonList2�� ��� �ʹ�.
		//1. ���� ����(Stream<T>) list.stream();->�÷��� API���� stream�ҽ� ����
		
		List<Person> goodPersonList2 = list.stream() //1. ����(Source)
				                           .filter(val -> val.point >= 50)//2.�߰�ó��
				                           .filter(val -> val.name.equals("A"))//
//				                           .collect(Collectors.toList()) //jdk16����
				                           .toList();//3. ����
//				                           .filter(System.out::print);
		
		System.out.println(goodPersonList2);
		
		
//		map/flatmap
//		map : �Ϲ������� AŸ���� BŸ������ ������ ��
//		flatmap : �������� collection�� ��� flat�ϰ� �����Ѵ� -> ������ �����ϴ�.
		
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		//3�̻��� ���鿡 + 65�� �ؼ� char List�� �ٲٰ� �ʹ�.
		List <Character> processed = stream.filter(x -> x >= 3).map((x)->new Character((char)(x+65))).toList();
		
				System.out.println(processed);
				
				String [][] sample = new String [][] {
					{"a","b"},{"c","d"},{"e","f"},{"1","a"}
				};
				
				Stream<String[]> st.stream(arr)
				
				//1. �ҽ� ���(Stream)
				List <String> list2 = 
						
						st.flatMap(arr->Arrays.stream(arr))//2.�߰�ó��
						.distinct()//�ߺ�����
						.sorted()//�⺻ ASC ��������
//						.sorted((x,y) ->{
////							[1,2,3]//stream ������ 1
////							x->2/y->1
//							return Integer.parseInt(x)> Integer.parseInt(y) ? 1 : Integer.parseInt(x) < Integer.parseInt(y) ? -1 : 0 })
						.sorted(Comparator.reverseOrder())//��������
      					.toList();//3.����
		
				System.out.println(list2);
				
				//���� String [][] -> String[]
				//String[] resultArr;
				//st.filter((x)-> true); �̹� st��� Stream�� ���� -> ������� ����Ǿ��� ������ ��Ȱ�� �Ұ�
				
				String[] resultArr = Arrays.stream(sample)
						.flatMap(array -> Arrays.stream(array))
						.filter(x -> {
							return x.equals("a");})
//						.forEach(null) //�����ڶ� ����ϸ� ���ϸ� ��� ����
						.peek(x -> System.out.println(x))//forEach�� 
						.toArray(String[]::new);//�޼��� ������
				
				System.out.println(resultArr);
		
		
	}
}
		
	

