package internshipQn5;

public class SubClass extends SuperClass{
	void printSub() {
		System.out.println("This is child class");
	}
	
//	Cannot reduce the visibility of the inherited method from SuperClass
//	private void printSuper(){
//		System.out.println("This is super class method as a private");
//	}
	
	public static void main(String[] args) {
		SubClass subC = new SubClass();
		SuperClass supC = new SuperClass();
		
		supC.printSuper();
		subC.printSub();
		subC.printSuper();
	}
}
