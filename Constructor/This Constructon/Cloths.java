class Cloths
{
	String colour;
	int cost;
	String size;
	Cloths(String colour,int cost, String size){
		this.colour=colour;
		this.cost=cost;
		this.size=size;
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		CLoths s1=new Cloths("all colours",1500,"XL,XXL,XXXL");
		System.out.println(s1.colour);
		System.out.println(s1.cost);
		System.out.println(s1.size);
		System.out.println("____Main Ends_____");
		
	}
}