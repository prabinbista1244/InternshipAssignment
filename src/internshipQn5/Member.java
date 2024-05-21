package internshipQn5;

public class Member {
	String name;
	Integer age;
	Long phone_num;
	String address;
	Long salary;
	
	void printSalary() {
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Prabin Bista";
		e.age = 24;
		e.phone_num = 9806224974l;
		e.address = "Shantinagar-2";
		e.salary = 30000l;
		
		Manager m = new Manager();
		m.name = "Bishnu Magar";
		m.age = 24;
		m.phone_num = 9806224975l;
		m.address = "Bamgalachuli";
		m.salary = 40000l;
		
		e.printEmployee();
		m.printManager();
		
	}
	
	
	
}

class Employee extends Member {
	int specialization;
	void printEmployee() {
		System.out.println("Name : " + name + "\nAge : " + age + "\nPhone number : " + phone_num + "\nAddress : " + address + "\nddress : " + salary);
	}
}
class Manager extends Member {
	int department;
	void printManager() {
		System.out.println("\n\nName : " + name + "\nAge : " + age + "\nPhone number : " + phone_num + "\nAddress : " + address + "\nsalary : " + salary);
		
	}
}

