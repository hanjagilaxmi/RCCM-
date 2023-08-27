package Constructor;

public class Student {
	int id;
	int age;
	
	Student(int s_id,int s_age)
	{
		id=s_id;
		age=s_age;
	}
	public static void main(String[] args)
	{
	Student s=new Student(245,15);
		System.out.println(s.id);
		System.out.println(s.age);
	}

}
