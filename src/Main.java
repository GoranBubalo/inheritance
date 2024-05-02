
public class Main {
	
	//inheritance lesson

	public static void main(String[] args) {
		
		//inheritance = > the process where one class acquires,
		// 				  the methods and attributes of another
		//				  We use it when we have more than one class
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		System.out.println(bicycle.speed);
		System.out.println(car.speed);
		bicycle.go();
		car.stop();
		
		//Car class can't access the variables from class Bicycle and vice versa 
		System.out.println(car.doors);
		System.out.println(bicycle.pedals);
	}

}
