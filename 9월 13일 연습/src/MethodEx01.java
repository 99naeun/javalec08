
public class MethodEx01 {
	
	static void printName() {
		System.out.println("나의 이름은?");}
		
	static void printUrName(String urName, int urAge) {
		System.out.println("너의 이름은 "+urName+"("+urAge+")");
	}
     static String returnName() {
    	 return "이종석";
     }
     static int add(int x, int y) {
    	 return x + y;
    	 
     }
     public static void main(Stirng args[]) {
    	 
    	 printName();
 		printName();
 		printName();
    	 
 		printUrName("이종석", 20); 
		printUrName("박은진", 21); 
		
		String name = returnName();
		System.out.println(name); 
		String name2 = returnName();
		System.out.println(name2); 
		
		
		int result = add(1 , 100); 
		System.out.println(result);
		System.out.println(add(100,-100)); 
     }
}
