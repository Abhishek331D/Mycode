class Home
{
	int cost;
	String name;
	String colour;
	Home(int cost, String name,String colour){
		this.cost=cost;
		this.name=name;
		this.colour=colour;
		return;
		
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		Home m1=new Home(30000,"My home","black and red");
		System.out.println(m1.cost);
		System.out.println(m1.name);
		System.out.println(m1.colour);
		Home m2=new Home(50000,"My home","blue and white");
		System.out.println(m2.cost);
		System.out.println(m2.name);
		System.out.println(m2.colour);
		System.out.println("____Main Ends_____");
	}
}