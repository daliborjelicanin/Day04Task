package task01;

public class Boss {

	private String psudonim;
	private String department;
	private int age;

	public Boss(String psudonim) {
		this.psudonim = psudonim;
	}

	public String getPsudonim() {
		return psudonim;
	}

	public void updateSalary(Employee employee, double salary) {
//		if (employee.getBoss() == this  &&  salary>0) {
//			employee.setSalary(employee.getSalary() + salary);
//		}

		if (employee.getBoss().getPsudonim() != null && employee.getBoss().getPsudonim().equals(psudonim)
				&& salary > 0) {
			employee.setSalary(employee.getSalary() + salary);
		}
	}
	
	public void reduceSalary(Employee employee, double salary) {
		if (employee.getBoss().getPsudonim() != null && employee.getBoss().getPsudonim().equals(psudonim) && salary > 0) {
			employee.setSalary(employee.getSalary() - salary);
		} else {
			System.out.println("Sef nije u mogucnosti da smanji platu zaposlenom jer mu nije sef!");
		}
	}

	@Override
	public String toString() {
		return "Boss [psudonim=" + psudonim + ", department=" + department + ", age=" + age + "]";
	}

}
