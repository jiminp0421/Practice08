package com.javaex.ex03;

public class Point {
	
	 int x;
	 int y;
	
	 
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}



	@Override
	public String toString() {
		return "[포인트] x:" + x + ", y:" + y + "입니다.";
	}


	public class ToStringEx {
	 public void main(String[] args) {
		 
		 Point p01 = new Point(3,3);
		 
		 System.out.println(p01);
		 System.out.println(p01.toString());
		 
	 } 
	
}
	
	
	
	
	
	
	
	
	

}
