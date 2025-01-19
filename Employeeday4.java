package day4_btvn;

public class Employeeday4 {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employeeday4(int id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
    }
   
    public int getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public double getEmployeeSalary() {
        return employeeSalary;
    }

}
