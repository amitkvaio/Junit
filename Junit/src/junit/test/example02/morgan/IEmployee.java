package junit.test.example02.morgan;

import java.util.List;

public interface IEmployee {
	List<Employee> getEmpByLocation(String location);
	List<Employee> getEmpByDesignation(String location);
	List<Employee> getEmpByAllSubOrdinateOfEmployee(String location);
}
