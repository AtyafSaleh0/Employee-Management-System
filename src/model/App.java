package model;

import model.PayRoll.ManagerPayRoll;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//انشاء دالة employee
		Employee emp1= new Employee(1102,"Saleh abdullah",30,"0552156837","Saleh@email.com","Software Engineer",9500.0,"Active");
		//طباعة بيانات الموظف الاساسيه
		System.out.println("----------Employee Basic information----------");
		emp1.displayEmployee();
		//عرض الملف الشخصي للموظف
		System.out.println("\n----------Employee Profile----------");
		emp1.viewEmployeeProfile();
		//تحديث الراتب
		System.out.println("\n----Updating Salary----");
		emp1.updateSalary(8200.0);
		System.out.println("New salary:"+ emp1.getSalary());
		//تغيير حالة العمل
		emp1.changeEmploymentStatus("on leave");
		System.out.println("Employment status upbated successfully");
		//عرض البيانات بعد التحديث
		System.out.println("\n------Employee Details After update-----");
		emp1.displayEmployee();
	



	// TODO Auto-generated method stub
	
	        System.out.println("==============================================");
	        System.out.println("   Employss and Departments OS      ");
	        System.out.println("==============================================\n");

	        // 1. إنشاء كائن مدير
	        manager manager = new manager(
	            101, "Ali Ahmed ", 42, "0501234567", 
	            "ahmed@company.com", "IT manager ", 18000.0, "Full-time",
	            "Senior Manager", 3000.0, 5, 204, "High"
	        );

	        
	        // 2. إنشاء كائن قسم
	        Department dept = new Department(
	            10, "IT Department", "Ali Ahmed", "Second floor", 5
	        );

	        // 3. عرض بيانات المدير والقسم
	        System.out.println("---Manager Information ---");
	        manager.displayManagerInfo();
	        System.out.println();

	        System.out.println("--- Department Information ---");
	        dept.displayDepartmentInfo();
	        System.out.println();

	        // 4. إضافة الموظف للقسم
	        System.out.println("--- Add employee to Department   ---");
	        dept.addEmployeeToDepartment(emp1);
	        System.out.println("Number of employees in Department" + dept.countDepartmentEmployees());
	        System.out.println();

	        // 5. تطبيق دوال المدير على الموظف
	        System.out.println("--- Manager operation on employee    ---");
	        manager.assignTask("UI programing   ", emp1);
	        manager.approveLeave(emp1);
	        manager.evaluateEmployee(emp1, "Excellent");
	        manager.generateEmployeeReport();
	        manager.scheduleMeeting("Review meeting ", "10:00 AM");
	        System.out.println();

	        // 6. حذف الموظف وتحديث بيانات القسم
	        System.out.println("--- Department Managemnt  ---");
	        dept.removeEmployeeFromDepartment(201);
	        System.out.println("Number of employees after removal: " + dept.countDepartmentEmployees());
	        {
	    
	    		// إنشاء كائن راتب موظف عادي
	            PayRoll empPayRoll = new PayRoll(101, 442201, 8000.0, 500.0, 200.0, "2026-08-01");
	            System.out.println("---Regular Employee Payroll test---");
	            empPayRoll.displayPayrollInfo();
	            empPayRoll.generatePayslip();
	            
	            System.out.println("---Manager Payroll inheritance test---");
	            //إنشاء كائن راتب مدير يورث من Payroll
	            ManagerPayRoll mgPayRoll = new ManagerPayRoll (201,443215,15000.0, 2000.0,
	            500.0,"2026-08-01", 3000.0);
	            mgPayRoll.displayPayrollInfo();
	            mgPayRoll.generatePayslip();
	            
	    	}

	    }

	    }




