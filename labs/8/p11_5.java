import java.util.*;
public class p11_5 {
	public static void main(String[] args) {
		Course course = new Course("Software Dev I");
		course.addStudent("Dan");
		course.addStudent("Justin");
		course.addStudent("Ryan");
		course.dropStudent("Justin");
		ArrayList <String> students = course.getStudents();
		for(String x : students)
			System.out.println(x);
	}
}


class Course{
	private String courseName;
	private ArrayList <String> students;
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents = students.size();
	}
	
	public ArrayList getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}
}
