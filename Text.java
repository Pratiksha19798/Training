class Test{

	public static void main(String args[]){
	Department d=new Department(10,"CSE"); 
	Student1 s=new Student1(100,"Mobeen",23,d);
	System.out.println(s.getName());
	System.out.println(d.getDepartmentName()); 
	}
	
	class Student1{ 
	private int id;
	private String name;
	private int age;
	private Department department;

	public Student1(int id,String name,int age,Department department){
	this.id=id;
	this.name=name;
	this.age=age;
	this.department=department;
	} 

	public void setId(int id){
	this.id=id; }
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
	public int getAge(){
	return age;
	}
	public void setDepartment(Department department){
	this.department=department;
	 }
	public Department getDepartment(){
	return department;
	}
	}



		

	