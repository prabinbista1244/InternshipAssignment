package internshipQn4;

public class EndInput {
	String title;
	String auther;
	Float price;
	String publisher;
	Long ISBN;
	
	public void display() {
		System.out.println(title + "\t\t" +  auther + " \t" + price + " \t" + publisher + " \t" + ISBN);
	}
	
	public static void main(String[] args) {
		EndInput ei1 = new EndInput();
		ei1.title = "OOP Programming";
		ei1.auther = "Graham Winter";
		ei1.price = (float) 32.50;
		ei1.publisher = "OReally";
		ei1.ISBN = 471974555L;
		
		EndInput ei2 = new EndInput();
		ei2.title = "QoS";
		ei2.auther = "Geoff Winter";
		ei2.price = (float) 12.99;
		ei2.publisher = "wiley";
		ei2.ISBN = 19919721323l;
		
		EndInput ei3 = new EndInput();
		ei3.title = "Java first";
		ei3.auther = "Anthony Jones";
		ei3.price = (float) 8.00;
		ei3.publisher = "pearson";
		ei3.ISBN = 4321567321l;
		
		System.out.println("Title \t\t\t Auther \t Price \t Publisher \t ISBN");
		System.out.println("==== \t\t\t ==== \t\t ==== \t ==== \t\t ====");
		
		ei1.display();
		ei2.display();
		ei3.display();
		
		
	}

}
