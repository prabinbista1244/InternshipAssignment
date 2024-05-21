package internshipQn6;

import java.util.Scanner;

public class RunEmployee {
	public static void main(String[] args) {
		Employee[] employees = getArrayOfEmployee();
		
		displayEmployee(employees);
		
		//total salary of employee
		totalSalaryOfEmployee(employees);
		
		
		//printing employess of IT department
		employeeByITdept(employees);
		 
		
		//conting the admin department
		countingAdminDept(employees);
		
		
		//counting and printing a particular city's employes
		countingEmployeeByCity(employees);
		
		
		
		//Total Salary of particular department
		totalSalaryBySpecificDept(employees);
		
		
		//finding lowest salary of the employees
		lowestSalaryOfEmployee(employees);
		
		
		
		//finding the highenst salary of the employess
		highestSalaryOfEmployee(employees);	
	}
	
	

	private static void highestSalaryOfEmployee(Employee[] employees) {
		double maxSalary = employees[0].getSalary();  
		for(Employee emp : employees) {
			if(maxSalary <= emp.getSalary()) {
				maxSalary = emp.getSalary();
				
			}
		}
		System.out.println("Maximum salary is : " + maxSalary);
	}

	private static void lowestSalaryOfEmployee(Employee[] employees) {
		double minSalary = employees[0].getSalary();
		for(Employee emp : employees) {
			if(minSalary >= emp.getSalary()) {
				minSalary = emp.getSalary();
				
			}
		}
		System.out.println("Minimum salary is : " + minSalary);
	}

	private static void totalSalaryBySpecificDept(Employee[] employees) {
		double tSalary = 0.0;
		for(Employee emp : employees) {
			if("Admin".equals(emp.getDepartment())) {
				tSalary = tSalary + emp.getSalary();
			}
		}
		System.out.println("Total Salary of admin Department : " + tSalary);
	}

	private static void countingEmployeeByCity(Employee[] employees) {
		int count2 = 0;
		for(Employee emp : employees) {
			if("Ghorahi".equals(emp.getCity())) {
				count2++;
			}
		}
		System.out.println("Ghorahi city's counting is : " + count2);
	}

	private static void countingAdminDept(Employee[] employees) {
		int count1 = 0;
		for(Employee emp : employees) {
			if("Admin".equals(emp.getDepartment())) {
				count1++;
			}
			
		}
		System.out.println(count1);
	}

	private static void employeeByITdept(Employee[] employees) {
		for(Employee emp : employees) {
			if("IT".equals(emp.getDepartment())){
				System.out.println(emp.toString());
			}
		}
	}

	private static void totalSalaryOfEmployee(Employee[] employees) {
		// a.Total salary
		double totalSalary = 0.0;
		for(Employee emp : employees) {
			totalSalary = totalSalary + emp.getSalary();
			 
		}
		System.out.println(totalSalary);
	}

	private static void displayEmployee(Employee[] employees) {
		for(Employee emp : employees) {
			System.out.println(emp.toString());
		}
	}

	private static Employee[] getArrayOfEmployee() {
		Employee[] employees = new Employee[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<employees.length; i++) {
			Employee e = new Employee();
			System.out.println("Enter the Id");
			e.setId(sc.nextInt());
			
			System.out.println("Enter the Name");
			e.setName(sc.next());
			
			System.out.println("Enter the Company");
			e.setCompany(sc.next());
			
			System.out.println("Enter the Salary");
			e.setSalary(sc.nextDouble());
			
			System.out.println("Enter the Department");
			e.setDepartment(sc.next());
			
			System.out.println("Enter the Post");
			e.setPost(sc.next());
			
			System.out.println("Enter the City\n");
			e.setCity(sc.next());
			
			employees[i] = e;
		}
		return employees;
	}

}
