package week3.day1;

public class Student extends Department{

		public void studentName() {
			System.out.println( "Shankari");
		}
		public void studentDept()  {
		    System.out.println("Microbiology");
	}

		public void studentId()  {
		    System.out.println("74897");
	}

	public static void main (String[]args) {
		
		Student student = new Student ();
		student.studentId(); 
		student.departmentName(); 
		student.collegeName(); 
		student.collegeCode();
		student.collegeRank();
		
	}
	}
