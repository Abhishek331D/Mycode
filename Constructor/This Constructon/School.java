class School
{
	String sname;
	String grade;
	int str;
	School(String sname,String grade,int str){
		this.sname=sname;
		this.grade=grade;
		this.str=str;
		return;
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		School s1=new School("ZPHS", "B+",100);
		System.out.println(s1.sname);
		System.out.println(s1.grade);
		System.out.println(s1.str);
		School s2=new School("MPPs", "A+",150);
		System.out.println(s2.sname);
		System.out.println(s2.grade);
		System.out.println(s2.str);
		System.out.println("____Main Ends_____");
	}
}