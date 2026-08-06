package model;

public class manager extends Employee {
    // 1. (Attributes)
    private String managerLevel;
    private double bonus;
    private int managedEmployees;
    private int officeNumber;
    private String authorityLevel;

    // 2. (Constructor)
    public manager(int employeeID, String employeeName, int age, String phoneNumber, 
                   String email, String jobTitle, double salary, String employmentStatus, 
                   String managerLevel, double bonus, int managedEmployees, 
                   int officeNumber, String authorityLevel) {
        super(employeeID, employeeName, age, phoneNumber, email, jobTitle, salary, employmentStatus);
        this.managerLevel = managerLevel;
        this.bonus = bonus;
        this.managedEmployees = managedEmployees;
        this.officeNumber = officeNumber;
        this.authorityLevel = authorityLevel;
    }

   {
		// TODO Auto-generated constructor stub
	}

	// 3.  Getters and Setters
    public String getManagerLevel() { return managerLevel; }
    public void setManagerLevel(String managerLevel) { this.managerLevel = managerLevel; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public int getManagedEmployees() { return managedEmployees; }
    public void setManagedEmployees(int managedEmployees) { this.managedEmployees = managedEmployees; }

    public int getOfficeNumber() { return officeNumber; }
    public void setOfficeNumber(int officeNumber) { this.officeNumber = officeNumber; }

    public String getAuthorityLevel() { return authorityLevel; }
    public void setAuthorityLevel(String authorityLevel) { this.authorityLevel = authorityLevel; }

    // 4. (Methods)
    public void assignTask(String taskName, Employee emp) {
        System.out.println("The manager " + getEmployeeName() + " Assigned the task: '" + taskName + "' To the employee: " + emp.getEmployeeName());
    }

    public boolean approveLeave(Employee emp) {
        System.out.println("Leave request approved for employee: " + emp.getEmployeeName());
        return true;
    }

    public void evaluateEmployee(Employee emp, String rating) {
        System.out.println("Employee performance evaluation " + emp.getEmployeeName() + "Is: " + rating);
    }

    public void generateEmployeeReport() {
        System.out.println("Supervising " + managedEmployees + " employee for report summary generation.");
    }

    public void scheduleMeeting(String meetingTitle, String time) {
        System.out.println("Meeting: '" + meetingTitle + "' has been scheduled: " + time);
    }

    // 5.  (Display Method)
    public void displayManagerInfo() {
        System.out.println("Manager level: " + managerLevel);
        System.out.println("bouns: " + bonus);
        System.out.println("Number of supervised employees: " + managedEmployees);
        System.out.println("Number of office : " + officeNumber);
        System.out.println("Authority level" + authorityLevel);
    }
}

