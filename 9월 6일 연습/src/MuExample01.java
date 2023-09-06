//중첩된 for문

public class MuExample01 {
	
	public static void main(String args[]) {
		//구구단
		//x * y =(x * y)
		
		System.out.println("##구구단##");
		for(int x=2; x<10; x++) {
			for(int y = 1; y<10; y++) {
				System.out.print(x+"x"+y+"y"+"="+(x*y)+"\t");
			}
			System.out.println("\n");
		}
	}

}
