public class Course {
	private final String COURSE_CODE;
	private String title;
	private Professor instructor;
	private Syllabus syllabus;
	private Student[] enrolledStudents;
	private int studentCount;
	
	public Course (String code, String title, Professor prof, int maxStudents)
	{
		this.COURSE_CODE = code;
		this.title = title;
		instructor = prof;
		enrolledStudents = new Student[maxStudents];
		studentCount = 0;
	}
	
	public void createSyllabus (String content)
	{
		syllabus = new Syllabus(content);
	}
	
	public void enrollStudent (Student s)
	{
		if (enrolledStudents.length < studentCount)
			System.out.println("Capacity is full.");
		
		else
		{
			enrolledStudents[studentCount] = s;	
			studentCount++;
		}
	}
	
	public void displayCourseInfo ()
	{
		System.out.println("Course: " + title + " [" + COURSE_CODE + "]");
		System.out.println("Instructor: " + instructor.NAME);
		System.out.println("Syllabus: " + syllabus.getContent());
		System.out.println("Enrolled Students:");
		for (int i = 0; i < enrolledStudents.length; i++)
		{
			int number = 1;
			System.out.println(number + ". [" + enrolledStudents[i].getStudentID() + "] " + enrolledStudents[i].getStudentName());
			number++;
		}
	}
}