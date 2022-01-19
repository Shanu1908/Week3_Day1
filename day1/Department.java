package week3.day1;

public class Department extends College{
	public void collegeName() {
		System.out.println( "Sri Krishna");
	}
	public void departmentName()  {
	    System.out.println("Microbiology");
}

public static void main (String[]args) {
	
	Department department = new Department ();
	
	department.departmentName(); 
 
}

}