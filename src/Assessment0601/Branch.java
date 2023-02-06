package Assessment0601;

public class Branch {
	
	private String branchManagerName;
	private String branchAddress;
	private double allowance;

	
	public String getBranchManagerName() {
		return branchManagerName;
	}
	public void setBranchManagerName(String branchManagerName) {
		this.branchManagerName = branchManagerName;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public double getSalaryOFManager(Employee employee) {
		double result=this.allowance+ employee.getBasicSalary();
		return result;
	}
}
