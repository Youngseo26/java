package exercise.ch55;

public class Student {

	// School Info
	private int schoolYear;
	private int classroomNumber;
	private int studentNumber;
	// subject
	// private Subject subject;

	// 기본 정보
	private String name;
	private String gender;
	private int score;


	public int getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	public int getClassroomNumber() {
		return classroomNumber;
	}

	public void setClassroomNumber(int classroomNumber) {
		this.classroomNumber = classroomNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

//	Student() {
//		this("Unknown", "Unknown");
//	}

//	Student(String name, String gender) {
//		this(name, gender, 5, 10);
//	}
//	
	Student(String name, String gender, int score) {
		this(5, 10, 0, name, gender, score);
	}
	
	



	public Student(int schoolYear, int classroomNumber, int studentNumber, String name, String gender, int score) {
	this.schoolYear = schoolYear;
	this.classroomNumber = classroomNumber;
	this.studentNumber = studentNumber;
	this.name = name;
	this.gender = gender;
	this.score = score;
}

	@Override
	public String toString() {
		return "Student [schoolYear=" + schoolYear + ", classroomNumber=" + classroomNumber + ", studentNumber="
				+ studentNumber + ", name=" + name + ", gender=" + gender + ", score=" + score + "]";
	}




}