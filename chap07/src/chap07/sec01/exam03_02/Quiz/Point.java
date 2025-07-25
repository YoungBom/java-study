package chap07.sec01.exam03_02.Quiz;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
		
	}
	public String location() {
		return "x=" + x + ",y=" + y;
	}
}
