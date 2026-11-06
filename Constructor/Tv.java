class Tv
{
	int tvcost;
	String tvbrand;
	String tvtype;
	Tv(int a, String b,String c){
		tvcost=a;
		tvbrand=b;
		tvtype=c;
		return ;
		
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		Tv m1=new Tv(20000,"LG","LCD");
		System.out.println(m1.tvcost);
		System.out.println(m1.tvbrand);
		System.out.println(m1.tvtype);
		Tv m2=new Tv(30000,"LG","LED");
		System.out.println(m2.tvcost);
		System.out.println(m2.tvbrand);
		System.out.println(m2.tvtype);
		System.out.println("____Main Ends_____");
	}
}