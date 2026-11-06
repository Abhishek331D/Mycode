class Laptop
{
	int cost;
	String brand;
	String type;
	Laptop(int a, String b,String c){
		cost=a;
		brand=b;
		type=c;
		return ;
		
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		Laptop m1=new Laptop(60000,"HP","Non_touch");
		System.out.println(m1.cost);
		System.out.println(m1.brand);
		System.out.println(m1.type);
		Laptop m2=new Laptop(80000,"Dell","Touch");
		System.out.println(m2.cost);
		System.out.println(m2.brand);
		System.out.println(m2.type);
		System.out.println("____Main Ends_____");
	}
}