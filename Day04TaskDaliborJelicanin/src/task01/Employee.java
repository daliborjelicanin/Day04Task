package task01;

public class Employee {

	private String name;
	private double salary;
	private Boss boss;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		boss = new Boss(null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Boss getBoss() {
		return boss;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", boss=" + boss.getPsudonim() + "]";
	}

	public void reduceSalary(double amount) {
		this.setSalary(this.getSalary() - amount);
	} 
	
}
