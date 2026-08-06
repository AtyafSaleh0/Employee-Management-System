package model;

public class Department {
    // 1. (Attributes)
    private int departmentID;
    private String departmentName;
    private String departmentManager;
    private int employeeCount;
    private String departmentLocation;
    private Employee[] employeesList;

    // 2. (Constructor)
    public Department(int departmentID, String departmentName, String departmentManager, 
                      String departmentLocation, int maxCapacity) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentManager = departmentManager;
        this.departmentLocation = departmentLocation;
        this.employeeCount = 0;
        this.employeesList = new Employee[maxCapacity];
    }

    // 3.  Getters and Setters
    public int getDepartmentID() { return departmentID; }
    public void setDepartmentID(int departmentID) { this.departmentID = departmentID; }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public String getDepartmentManager() { return departmentManager; }
    public void setDepartmentManager(String departmentManager) { this.departmentManager = departmentManager; }

    public int getEmployeeCount() { return employeeCount; }

    public String getDepartmentLocation() { return departmentLocation; }
    public void setDepartmentLocation(String departmentLocation) { this.departmentLocation = departmentLocation; }

    // 4. (Methods)
    public void addEmployeeToDepartment(Employee emp) {
        if (employeeCount < employeesList.length) {
            employeesList[employeeCount] = emp;
            employeeCount++;
			System.out.println("Employee " + emp.getEmployeeName() + " has been successfully added to" + departmentName);
        } else {
            System.out.println("The department has reached its maximum capacity. Cannot add employee.");
        }
    }

    public void removeEmployeeFromDepartment(int empID) {
        boolean found = false;
        for (int i = 0; i < employeeCount; i++) {
            if (employeesList[i].getEmployeeID() == empID) {
                for (int j = i; j < employeeCount - 1; j++) {
                    employeesList[j] = employeesList[j + 1];
                }
                employeesList[employeeCount - 1] = null;
                employeeCount--;
                found = true;
                System.out.println("Employee " + empID + " has been successfully added to " + departmentName);
                break;
            }
        }
        if (!found)  {
            System.out.println("Employee with ID " + empID + " does not exist in the department" );
        }
    }

    public void updateDepartmentInfo(String newName, String newManager, String newLocation) {
        this.departmentName = newName;
        this.departmentManager = newManager;
        this.departmentLocation = newLocation;
        System.out.println("Department information updated successfully.");
    }

    public int countDepartmentEmployees() {
        return employeeCount;
    }

    // 5.  (Display Method)
    public void displayDepartmentInfo() {
        System.out.println("Department ID:" + departmentID);
        System.out.println("epartment Name: " + departmentName);
        System.out.println("Department Manage: " + departmentManager);
        System.out.println("Department Location: " + departmentLocation);
        System.out.println("Current Total Employees:: " + employeeCount);
    }
}

