package model;

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
	}

}
