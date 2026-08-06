package model;

public class PayRoll {
	private int payrollID;
	private int employeeID;
	private double basicSalary;
	private double bonus;
	private double deductions;
	private double netSalary;
	private String paymentDate;
	
	public PayRoll(int payrollID,int employeeID,double basicSalary,double bonus,
			double deductions,String paymentDate) {
		this.payrollID = payrollID;
		this.employeeID = employeeID;
		this.basicSalary = basicSalary;
		this.bonus =bonus;
		this.deductions = deductions;
		this.paymentDate = paymentDate;
	    this.netSalary = calculateSalary();//حساب صافي الربح تلقائيًا عند الإنشاء
	}
	//1.calculateSalary()دالة حساب صافي الراتب
	public double calculateSalary() {	
		this.netSalary = (this.basicSalary + this.bonus) - this.deductions;
		return this.netSalary;
	}
		
	//2.دالة إضافة مكافأة()addBonus	
	public void addBonus (double amount) {
		if (amount>0) {
			this.bonus += amount;
			calculateSalary();//تحديث صافي الراتب
			System.out.println("Additional bonus amount added successfully:"+amount);
		}	
}
   //3.دالة خصم مبلغ من الراتب deductSalar()
	public void deductSalary(double amount) {
		if (amount>0) {
			this.deductions += amount;
			calculateSalary();//تحديث صافي الراتب
			System.out.println("Amount deducted successfully:"+amount);
		}
	}
	
	//4.دالة إنشاء كشف راتب generatePayslip()
	public void generatePayslip() {
		System.out.println("=== (payslip) ===");
		System.out.println("Payroll ID:"+ payrollID);
		System.out.println("Employee ID:"+ employeeID);
		System.out.println("Basic Salary:"+ basicSalary);
		System.out.println("Bonus:"+ bonus);
		System.out.println("Deductions:"+ deductions);
		System.out.println("Net Salary:"+ netSalary);
		System.out.println("Payment Date:"+ paymentDate);
		System.out.println("====================");
	}
	
	//5.دالة عرض تفاصيل الراتب displayPayrollInfo()
	public void displayPayrollInfo() {
		System.out.println("Payroll ID: " + payrollID + " - Employee ID: " + employeeID + " - Net Salary: " + netSalary);
	}
	//6.دالة للحصول على صافي الراتب (Getter)
		public double getNetSalary() {
			return netSalary;
		}	
			//صنف راتب المدير يرث من صنف الرواتب الأساسي
			public static class ManagerPayRoll extends PayRoll{
				private double executiveAllowance;
				
				public  ManagerPayRoll(int payrollID,int employeeID,double basicSalary,double
	bonus,double deductions, String paymentDate, double executiveAllowance) {
			super (payrollID, employeeID, basicSalary, bonus, deductions, paymentDate);
			this.executiveAllowance = executiveAllowance;
			calculateSalary();
				}
				public double calculateSalary() {
				double baseNet = super.calculateSalary();
				return baseNet + executiveAllowance;
				
				}
				
				public void generatePayslip() {
					super.generatePayslip();
					System.out.println("Executive Allowance" + executiveAllowance);
					System.out.println("Total net salary:" + calculateSalary() );
				}
				
			}
		}



