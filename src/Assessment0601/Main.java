package Assessment0601;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		
		employee1.setEmployeeName("Employee1");
		employee1.setEmployeeId(1);
		employee1.setEmployeeAge(32);
		employee1.setDepartment("Accoundance");
		employee1.setBasicSalary(28000.0);
		employee1.setBand("c1");
		employee1.setJoinDate(LocalDate.now());
		employee1.setEmployeeAddress("135, South street, Bangalore");
		
		employee2.setEmployeeName("Employee2");
		employee2.setEmployeeId(2);
		employee2.setEmployeeAge(28);
		employee2.setDepartment("Electrical Maintance");
		employee2.setBasicSalary(18000.0);
		employee2.setBand("c2");
		employee2.setJoinDate(LocalDate.now());
		employee2.setEmployeeAddress("180, North street, Bangalore");
		
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		
		customer1.setName("Customer1");
		customer1.setCustomerId(1);
		customer1.setAge(28);
		customer1.setAddress("25, Karnom Street, Bangalore");
		
		
		customer2.setName("Customer2");
		customer2.setCustomerId(2);
		customer2.setAge(21);
		customer2.setAddress("105, Karnom Street, Bangalore");
		
		Branch branch1=new Branch();
		Branch branch2=new Branch();
		
		branch1.setBranchManagerName("Manager1");
		branch1.setBranchAddress("Kottinampakkaam, Banagalore");
		branch1.setAllowance(2000.0);
		
		
		branch2.setBranchManagerName("Manager2");
		branch2.setBranchAddress("Whitefield, Banagalore");
		branch2.setAllowance(2800.0);
		
		Company company=new Company();
		
		company.setCompanyName("Company1");
		company.setAddress("125, BrokerFiled, Bangalore");
		
		company.addBranches(branch1);
		company.addBranches(branch2);
		
		company.addCustomers(customer1);
		company.addCustomers(customer2);
		
		company.addEmployees(employee1);
		company.addEmployees(employee2);
		
		System.out.println(branch1.getSalaryOFManager(employee1));
		System.out.println(branch2.getSalaryOFManager(employee1));
		
		

	}

}
