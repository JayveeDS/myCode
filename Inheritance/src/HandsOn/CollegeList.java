package HandsOn;
import java.util.Scanner;

public class CollegeList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput;
		
		Person person = new Person();
		Employee employee = new Employee();
		Student student = new Student();
		Faculty faculty = new Faculty();
		
		System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
		userInput = scan.nextLine();
		if(userInput.equals("e") || (userInput.equals("E"))) {
			System.out.println("Type employee's name, contact number, salary, and department.");
			employee.setName(scan.nextLine());
			employee.setContactNum(scan.nextLine());
			employee.setSalary(scan.nextDouble());
			scan.nextLine();
			employee.setDepartment(scan.nextLine());
			
			System.out.println("-------------------------------------------");
			System.out.println("Name: " + employee.getName());
			System.out.println("Contact Number: " + employee.getContactNum());
			System.out.println("Salary: " + employee.getSalary());
			System.out.println("Department: " + employee.getDepartment());
			
		} else if(userInput.equals("f") || (userInput.equals("F"))) {
			System.out.println("Type employee's name, contact number, salary, department, status.");
			faculty.setName(scan.nextLine());
			faculty.setContactNum(scan.nextLine());
			faculty.setSalary(scan.nextDouble());
			scan.nextLine();
			faculty.setDepartment(scan.nextLine());
			System.out.println("Press Y if faculty member, Press N if regular/tenured");
			String status = scan.nextLine();
			if(status.equals("y") || (userInput.equals("Y"))) {
				faculty.setStatus("Regular/Tenured");
			} else if(status.equals("n") || (userInput.equals("N"))) {
				faculty.setStatus("Not Regular/Tenured");
			}
			
			System.out.println("-------------------------------------------");
			System.out.println("Name: " + faculty.getName());
			System.out.println("Contact Number: " + faculty.getContactNum());
			System.out.println("Salary: " + faculty.getSalary());
			System.out.println("Department: " + faculty.getDepartment());
			System.out.println("Status: " + faculty.getStatus());
			
		} else if(userInput.equals("s") || (userInput.equals("S"))) {
			System.out.println("Type student's name, contact number, program, year level.");
			student.setName(scan.nextLine());
			student.setContactNum(scan.nextLine());
			student.setProgram(scan.nextLine());
			student.setYearLevel(scan.nextInt());
			
			System.out.println("-------------------------------------------");
			System.out.println("Name: " + student.getName());
			System.out.println("Contact Number: " + student.getContactNum());
			System.out.println("Program: " + student.getProgram());
			System.out.println("Year Level: " + student.getYearLevel());
		}
	}

}