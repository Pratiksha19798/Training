class Test1{
	public static void main(String args[]){
		Department d=new Department(10,"Devp");
		Student1 s=new Student1(1,"PD",24,d);

	System.out.println(s.getDepartment().getId());
}
}

	