
 package org.karthik.spring;


public class triangle {
	private String s;
	int height;
	public String getType()
	{
		return s;
	}
	
	public int getHeight() {
		return height;
	}

	/*public void setHeight(int height) {
		this.height = height;
	}

	public void setS(String s) {
		this.s = s;
	}*/
	public triangle(String s) {
		this.s = s;
	}
	public triangle(int height) {
		this.height = height;
	}


	public triangle(String s,int height)
	{
		this.s=s;
		this.height=height;
	}
	/*public void setType(String type)
	{
		this.type=type;
	}*/
	public void draw()
	{
		
		System.out.println(getType()+" drawing trangle "+getHeight());
	}

}

