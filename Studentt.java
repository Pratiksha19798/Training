class Studentt{

	private int id;
	private String name;
	private int age;
	private Department department;
	private MyDate birthDate;

	public Studentt(int id,String name,int age,Department department,MyDate myDate){
		this.id=id;
		this.name=name;
		this.age=age;
		this.departemnt=department;
		this.birthDate=mydate;
	}


	public void setId(int studentId){
		this.id=studentId;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age=age;
	}

	public int getage(){
		return age;
	}

	public void setBirthDate(MyDate date){
		birthDate=date;
	}

	public MyDate getBirthDate(){
		return birthDate;
	}

	public void setDepartment(Department department){
	this.department=department;
	}

	public Department getDepartment(){
		return department;
	}
}
		
		