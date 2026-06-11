public class EnrollmentDriver {
	public static void main(String [] args)
	{
		Professor prof = new Professor("Dr. Alan Turing");
		Course course = new Course("CCICOMP", "Intro to Computing", prof, 3);
		course.createSyllabus("Week 1: Binary | Week 2: Algorithms");
		
		Student[] student = new Student[3];
		student[0] = new Student("Amy", 1001);
		student[1] = new Student("Juan", 1002);
		student[2] = new Student("Pedro", 1003);
		
		for (int i = 0; i < student.length; i++)
		{
			course.enrollStudent(student[i]);
		}
		
		course.displayCourseInfo();
	}
}