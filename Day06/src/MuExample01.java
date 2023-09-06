
// 중첩된 for문
// --혼공얄코( 혼자서 공부하는 얇팍한 코딩지식 )
// 우리는 git을 이렇게 사용하고 있어요 git-flow
public class MuExample01 {
	
	public static void main(String args[]) {
		// 구구단
		// x * y = ( x * y )
		
		System.out.println("## 구구단 ##");
		for(int x = 2; x<10; x++) {
			for(int y = 1; y<10; y++) {
				//System.out.println(x + " x " + y + " = " + (x * y));
				
				System.out.print(x + " x " + y + " = " + (x * y)+"\t");
				//println();->new line(출력하고 엔터까지)
				//print();->엔터없음.
			}
			
			System.out.println("\n"); 
			//System.out.println("");
			
			
			
//			System.out.println("## 구구단 ##");
//			for(int x = 1; x<10; x++) {
//				for(int y = 2; y<10; y++) {
//					//System.out.println(x + " x " + y + " = " + (x * y));
//					
//					System.out.print(y + " x " + x + " = " + (x * y)+"\t");
//					//println();->new line(출력하고 엔터까지)
//					//print();->엔터없음.
//				}
//				
//				System.out.println("\n"); 
//				//System.out.println("");
		}
	}

}
