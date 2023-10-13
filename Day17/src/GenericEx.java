import java.util.HashMap;
import java.util.List;

class a{}

class GenericClass<T>{
	
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void getClassInfo() {
		System.out.println(String.format("class info : %s", data.getClass()));
	}
}


public class GenericEx {
	
	public static void main(String args[]) {
		GenericClass<Integer> cls = new GenericClass<Integer>();
		GenericClass<String> cls2 = new GenericClass<String>();
		
		cls.setData(1);
		cls.getClassInfo();
		cls2.setData("이종석");
		cls2.getClassInfo();
		
		Number a = new Integer(1);//공변성
		GenericClass b = (GenericClass)new A();//반공변성
		//불공변성 둘다 안되는거
		
		A c = new GenericClass(); //A<-G
		
//		List<Object>d = new List<Integer>();//오류
		
//		Map<?> map = new HashMap<Integer>();
	}
	
	static int add(List<? extends Number>list) {
		int result = 0;
		for(Number v : list) {
			result += Integer.parseInt(v.toString());			
		}
		return result;
	}

}
