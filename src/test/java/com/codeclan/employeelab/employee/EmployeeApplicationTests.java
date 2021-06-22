package com.codeclan.employeelab.employee;

import com.codeclan.employeelab.employee.models.Department;
import com.codeclan.employeelab.employee.models.Employee;
import com.codeclan.employeelab.employee.models.Project;
import com.codeclan.employeelab.employee.repositories.DepartmentRepository;
import com.codeclan.employeelab.employee.repositories.EmployeeRepository;
import com.codeclan.employeelab.employee.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Software Development");
		departmentRepository.save(department);

		Employee employee = new Employee("Steven", "Cormack", 54321, department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeeAndProject(){
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee = new Employee("Giuliano", "Giuliano", 12345, department);
		employeeRepository.save(employee);
		
		Project project = new Project("Recruitment Drive", 7);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}


}
