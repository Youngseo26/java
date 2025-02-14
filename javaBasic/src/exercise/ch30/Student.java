package exercise.ch30;

public class Student {
	private static int serialNum = 1;
	private static String city = "Seoul";

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum; //this 안된다
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		Student.city = city;
	}

	// 정적 메소드

	// School Info
	private String schoolName;
	private int classYear;
	private int classroomNumber;
	private int studentNumber;
	private int studentId;
	// subject
	// private Subject subject;

	// 기본 정보
	private String name;
	private String gender;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getClassYear() {
		return classYear;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

//	public Subject getSubject() {
//		return subject;
//	}
//
//	public void setSubject(Subject subject) {
//		this.subject = subject;
//	}

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

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String gender) {
		/*
		 * this.studentId = serialNum++; this.schoolName = "school"; this.classYear = 1;
		 * this.classroomNumber = 2; this.name = name; this.gender = gender;
		 */
		this("school", 1, 2, -1, name, gender);
	}

	public Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name,
			String gender) {
		this.studentId = serialNum++;
		this.schoolName = schoolName;
		this.classYear = classYear;
		this.classroomNumber = classroomNumber;
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}

	public void printStudent() {
		System.out.printf(
				"[Student] schoolName : %s classYear : %d classroomNumber : %d studentNumber : %d studentId : %d name : %s gender : %s\n ",
				this.schoolName, this.classYear, this.classroomNumber, this.studentNumber, this.studentId, this.name,
				this.gender);
	}

//	void study(Teacher teacher, String subjectName) {
//		String teacherName = teacher.getName();
//	}
}