package internshipQn7;

public class Rectangle implements Shape{
	private int length;
	private int breadth;
	

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}



	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	
	
	@Override
	public void getArea() {
		System.out.println("Enter the length for Rectangle");
		length  = sc.nextInt();
		
		System.out.println("Enter the breadth for Rectangle");
		breadth  = sc.nextInt();
		
		int areaOfRectangle = length*breadth;
		System.out.println("Area of Rectangle is : " + areaOfRectangle);
	}

}
