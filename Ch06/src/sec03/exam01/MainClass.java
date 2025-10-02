package sec03.exam01;

public class MainClass {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Hyundai");
		Car c3 = new Car("Kia", "Sedan");
		Car c4 = new Car("Kia", "truck", 150);		//sec01.exam01.Car c2 = new sec01.exam01.Car(null, 0);

		c1.ShowInfo();
		c2.ShowInfo();
		c3.ShowInfo();
		c4.ShowInfo();
		
	}

}
