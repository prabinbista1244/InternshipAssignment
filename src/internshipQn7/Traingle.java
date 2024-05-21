package internshipQn7;

public class Traingle implements Shape {
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
		System.out.println("Enter the length for Traingle");
		length  = sc.nextInt();
		System.out.println("Enter the breadth for Traingle");
		breadth  = sc.nextInt();
		
		int areaOfTraingle = (length*breadth)/2;
		System.out.println("Area of Rectangle is : " + areaOfTraingle);
	}

}
