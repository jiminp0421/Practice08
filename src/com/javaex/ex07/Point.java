package com.javaex.ex07;

import com.javaex.ex07.Point;

public class Point {

	private int p1;
	private int p2;
	private int p3;
	private int p4;
	private int x;
	private int y;
	
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public int getP2() {
		return p2;
	}
	public void setP2(int p2) {
		this.p2 = p2;
	}
	public int getP3() {
		return p3;
	}
	public void setP3(int p3) {
		this.p3 = p3;
	}
	public int getP4() {
		return p4;
	}
	public void setP4(int p4) {
		this.p4 = p4;
	}




	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(this.x==p.x) {
			return true;
		}else if (this.y==p.y){
			return false;
		}
		return false;
	}


	
	
	}

	
	
	

