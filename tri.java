
 package org.karthik.spring.objects;


public class tri {
	private point pointA,pointB,pointC;
	
	public point getPointA() {
		return pointA;
	}

	public void setPointA(point pointA) {
		this.pointA = pointA;
	}

	public point getPointB() {
		return pointB;
	}

	public void setPointB(point pointB) {
		this.pointB = pointB;
	}

	public point getPointC() {
		return pointC;
	}

	public void setPointC(point pointC) {
		this.pointC = pointC;
	}

	public void draw()
	{
		
		System.out.println("point a are"+pointA.getX()+" "+pointA.getY());
		System.out.println("point b are"+pointB.getX()+" "+pointB.getY());
		System.out.println("point c are"+pointC.getX()+" "+pointC.getY());
	}

}

