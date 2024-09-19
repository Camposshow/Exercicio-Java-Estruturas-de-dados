package entities;

public class Emplyoee {
	private int id;
	private String name;
	private double salary;
	
	public Emplyoee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// função para aumentar o salario
	public void aumentarSalary(double aument) {
		double aumento = salary * aument / 100;
		salary += aumento;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String toString() {
		return this.id + ", " + this.name + ", " + String.format("%.2f" ,salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
