package model;

public class Employee {
//الخصائص
	private int employeeID;
	private String employeeName;
	private int age;
	private String phoneNumber;
	private String email;
	private String jobTitle;
	private double salary;
	private String employmentStatus;
	
// constructor 
 public Employee(int employeeID, String employeeName, int age, String phoneNumber, String email, String jobTitle, double salary, String employmentStatus) {   
 super();
	        this.employeeID = employeeID;
	        this.employeeName = employeeName;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	        this.employmentStatus = employmentStatus;
}
// methods
public void displayEmployee() {
	System.out.println("Employee ID:" + employeeID);
	System.out.println("Name:" + employeeName);
	System.out.println("Job Title:" + jobTitle);
	System.out.println("Salary:" + salary);
	System.out.println("Status:" + employmentStatus);
}
public void updateEmployeeinfo(String nwePhone, String newEmail) {
	this.phoneNumber= nwePhone;
	this.email=newEmail;
}
public void updateSalary(double newSalary) {
	this.salary=newSalary;
}
public void viewEmployeeProfile() {
	displayEmployee();
	System.out.println("age:" + age);
	System.out.println("Phone:" + phoneNumber);
	System.out.println("Email:" + email);
}
public void changeEmploymentStatus(String newStatus) {
	this.employmentStatus=newStatus;
}
public int getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getEmploymentStatus() {
	return employmentStatus;
}
public void setEmploymentStatus(String employmentStatus) {
	this.employmentStatus = employmentStatus;
}

}
