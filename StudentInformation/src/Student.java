
public class Student {
	public Student(String studentID, String firstName, String lastName, int grade, String gradeLevel) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		this.grade = grade;
	}
	private String studentID, firstName, lastName, gradeLevel;
	private int grade;
	public String getStudentID( ) {
		return studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	@Override
	public String toString() {
		return studentID + " " + firstName + " " + lastName+ " " + grade + " " + gradeLevel;
	}
	
}
