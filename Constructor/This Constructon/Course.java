class Course
{
	String name;
	String uni;
	int ecost;
	Course(String name, String uni,int ecost){
		this.name =name;
		this.uni=uni;
		this.ecost=ecost;
	
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		Course s1=new Course("B.Tech","JNTUA",2000);
		System.out.println(s1.name);
		System.out.println(s1.uni);
		System.out.println(s1.ecost);
		System.out.println("____Main Ends_____");
	}
}