package BackEndApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BackEndApp.repository.EmployeeRepository;
import BackEndApp.models.Employee;

/**
 * The Class EmployeeService.
 */
@Service
public class EmployeeService {

	/** The repo. */
	@Autowired
	private EmployeeRepository repo;
	
	/**
	 * Gets the employees.
	 *
	 * @return the employees
	 */
	public List<Employee> getEmployees(){
		
		return repo.findAll();
	}
	
	/**
	 * Upload employee.
	 *
	 * @param emp the emp
	 * @return the string
	 */
	public String uploadEmployee(Employee emp)
	{
		String Result="OK";
		try {
		  repo.save(emp);
		}
		catch(Exception ex) {
			Result="Error";
		}
		return Result;
	}
	
	/**
	 * Update employee.
	 *
	 * @param emp the emp
	 * @return the string
	 */
	public String updateEmployee(Employee emp)
	{
		String Result="OK";
		try {
		  repo.save(emp);
		}
		catch(Exception ex) {
			Result="Error";
		}
		return Result;
	}
}
