class Emp
{
	int id;
	int sal;
	char grade;
	Emp(int id,int sal,char garade){
		this.id=id;
		sal=sal;
		grade=grade;
		
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		Emp s1=new Emp(001,25000,'A');
		System.out.println(s1.id);
		System.out.println(s1.sal);
		System.out.println(s1.grade);
		System.out.println("____Main Ends_____");
	}
}