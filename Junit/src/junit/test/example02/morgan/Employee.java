package junit.test.example02.morgan;

import java.util.List;

public class Employee {
	int id;
	String name;
	String designation;
	String locaction;
	Employee subOrdinateEmpid;

	public Employee(int id, String name, String designation, String locaction, Employee subOrdinateEmp) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.locaction = locaction;
		this.subOrdinateEmpid = subOrdinateEmp;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public String getLocaction() {
		return locaction;
	}

	public  Employee getSubOrdinateEmp() {
		return subOrdinateEmpid;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", locaction=" + locaction
				+ ", subOrdinateEmp=" + subOrdinateEmpid + "]";
	}

}
