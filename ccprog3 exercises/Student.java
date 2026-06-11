public class Student {
	private String studentName;
	private final int STUDENT_ID;
	
	public Student (String name, int id)
	{
		studentName = name;
		this.STUDENT_ID = id;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public int getStudentID()
	{
		return STUDENT_ID;
	}
}