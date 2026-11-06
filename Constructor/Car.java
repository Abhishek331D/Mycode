class Car
{
	int car_cost;
	String car_model;
	String car_type;
	Car(int a,String b,String c){
		car_cost=a;
		car_model=b;
		car_colour=c;
	}
	public static void main(String[]args){
		System.out.println("____Main Starts_____");
		Car c1 =new Car(2000000,"Toyota Innova", "Platinum White");
		System.out.println(c1.car_cost);
		System.out.println(c1.car_model);
		System.out.println(c1.car_colour);
		Car c2=new Car(5000000,"Toyota Camry","Cement Gray");
		System.out.println(c2.car_cost);
		System.out.println(c2.car_model);
		System.out.println(c2.car_colour);
		System.out.println("____Main Ends_____");
	}
}