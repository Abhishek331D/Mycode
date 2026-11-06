class Bike
{
	int cost;
	String brand;
	String colour;
	Bike(int a, String b,String c){
		cost=a;
		brand=b;
		colour=c;
		return;
		
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		Bike m1=new Bike(30000,"honda","black and red");
		System.out.println(m1.cost);
		System.out.println(m1.brand);
		System.out.println(m1.colour);
		Bike m2=new Bike(50000,"honda","blue and white");
		System.out.println(m2.cost);
		System.out.println(m2.brand);
		System.out.println(m2.colour);
		System.out.println("____Main Ends_____");
	}
}