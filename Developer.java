package day4_btvn;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee dev1 = new Employee(101, "Mai", 75000);
        Employee dev2 = new Employee(102, "Thao", 80000);
        
        System.out.println("Developer 1:");
        System.out.println("ID: " + dev1.getEmployeeId());
        System.out.println("Name: " + dev1.getEmployeeName());
        System.out.println("Salary: " + dev1.getEmployeeSalary());
        
        dev2.setEmployeeName("Thao"); // Modify name
        System.out.println("\nDeveloper 2:");
        System.out.println("ID: " + dev2.getEmployeeId());
        System.out.println("Name: " + dev2.getEmployeeName());
        System.out.println("Salary: " + dev2.getEmployeeSalary());
        
        System.out.println("\nAnalysis:");
        System.out.println("The salary attribute is private and has no setter method, meaning it cannot be changed after initialization.\n"
                + "This ensures salary data is immutable, maintaining data integrity.");
        
	}

}
