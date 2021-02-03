
public class Student
{
	 private String studentid;
	 private String name;
	 private String surname;
	 private String birthday;
	 private String department;
    
    public Student()
    {
    studentid = "undefined" ;
    name = "undefined"; 
    surname = "undefined" ;
    birthday = "undefined" ;
    department = "undefined" ;
    
    }

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	
	
}