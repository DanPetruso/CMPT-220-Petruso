import java.util.Arrays;

class Course{
	private String courseName;
	private String[] students = new String[0];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		numberOfStudents++;
		String[] newArr = Arrays.copyOf(students, numberOfStudents);
		students = newArr;
		students[numberOfStudents-1] = student;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		numberOfStudents--;
		String[] newArr = new String[numberOfStudents];
		int num = Arrays.asList(students).indexOf(student);
		for(int i = 0; i < numberOfStudents; i++) {
			if(i < num)
				newArr[i] = students[i];
			else
				newArr[i] = students[i+1];
		}
		students = newArr;
	}
	
	public void clear() {
		students = new String[0];
	}
}


public class p10_9 {

	public static void main(String[] args) {
		
		Course course = new Course("Computer Science");
		
		course.addStudent("Joe");
		course.addStudent("Dan");
		course.addStudent("Marc");
		
		String[] arr = course.getStudents();
		for(String x : arr)
			System.out.print(x + " ");
		System.out.println();
		
		course.dropStudent("Dan");
		
		arr = course.getStudents();
		for(String x : arr)
			System.out.print(x + " ");
	}

}
