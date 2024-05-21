package internshipQn7;

public class Circle implements Shape {
	private int redius;
	
	
	

	public int getRedius() {
		return redius;
	}
	public void setRedius(int redius) {
		this.redius = redius;
	}


	
	

	@Override
	public void getArea() {
		Double pi = 3.14159;
		System.out.println("Enter the redius for Circle");
		redius  = sc.nextInt();
		
		Double areaOfCircle = pi * (redius * redius);
		System.out.println("Area of Circle is : " + areaOfCircle);
	}

}
