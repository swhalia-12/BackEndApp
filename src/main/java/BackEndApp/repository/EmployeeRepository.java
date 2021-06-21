package BackEndApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import BackEndApp.models.Employee;

/**
 * The Interface EmployeeRepository.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
