package Assessment0601;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private String companyName;
	private String address;
	private List<Employee> employees;
	private List<Customer> customers;
	private List<Branch> branches;
	
	public Company() {
		employees=new ArrayList<Employee>();
		customers=new ArrayList<Customer>();
		branches=new ArrayList<Branch>();
	}
	
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public void addEmployees(Employee employee) {
		this.employees.add(employee);
	}
	public void addCustomers(Customer customer) {
		this.customers.add(customer);
	}
	public void addBranches(Branch branch) {
		this.branches.add(branch);
	}
}
