package javalec.computer.videocard;

public class ModiEx {
	
	public static void main(String args[]) {
		Geforce video1 = new Geforce();
		video1.defaultPrintName();
//		video1.protectedPrintName();
//		video1.privatedPrintName(); // private는 자기자신만 
		                            // ModiEx와 Geforce는 다를 객체니까
	
		Geforce video2 = new Geforce();
		Geforce video3 = new Geforce("냥냥냥");
		
		System.out.println(video2.modelName);
		System.out.println(video3.modelName);
	
	}

}
