package This;

public class Employee {
	String emp_name;
	int emp_age;
	
	Employee(String emp_name,int emp_age)
	{
		this.emp_name=emp_name;
		this.emp_age=emp_age;
	}
	public static void main(String[] args)
	{
		Employee e=new Employee("Laxmi",23);
		System.out.println(e.emp_name);
		System.out.println(e.emp_age);
	}

}
