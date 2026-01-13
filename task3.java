public class Main {
	public static void main(String[] args) {
		Employee uzi = new Employee("004", "Muhammad Uzair");
		uzi.setSalary(20000);
		uzi.displayEmployee();
		double money = uzi.getSalary();
		System.out.println(money);
		uzi.setSalary(-600);
		uzi.displayEmployee();
	}
}
class Employee{
    private String id;
    private String name;
    private double salary;
    Employee(String id, String name){
        this.id = id;
        this.name = name;
    }
    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }
    public double getSalary(){
        return salary;
    }
    public void displayEmployee(){
        System.out.println("  ID: " + id + "  Name: " + name + "  Salary: " + salary);
    }
}
