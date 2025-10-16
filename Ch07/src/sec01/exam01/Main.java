package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		Car car; // Car 타입 변수 선언
		Truck truck = new Truck(80, 20); 
		
		truck.ShowSpeed(); 
		car = truck;
		car.ShowSpeed();
		
		System.out.println("Car Speed is " + car.speed);
		
		System.out.println("truck speed is " + truck.speed);

	}
}
