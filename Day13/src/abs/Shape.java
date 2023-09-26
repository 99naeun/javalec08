package abs;

public abstract class Shape {
	
	int x;
	int y;
	String type = "도형타입";
	
	public void printMyType() {
		System.out.println(type);
	}

	public abstract void 넓이구하기();
}
