class Addition(){
	
	public int add(int...a){
		sum=0;
		for(int i=0; i<a.length; i++)
		sum=sum+a[i];
	}
		return sum;
		System.out.println("Addition is:" sum);

	
	public static void main(String args[]){
		Addition a1 = new Addition();
		
		System.out.println("Addition is:" sum);
	}
}