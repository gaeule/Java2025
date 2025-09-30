package sec01.exam01;

public class Car {
	String company;
	int maxSpeed;
	int speed;
	int rpm;
	
	public Car() {
		//함수 오버로딩
	}
	
	
	public Car(String company, int maxSpeed)
	{
		this.company = company;
		this.maxSpeed = maxSpeed;
	}
	
	void SetMaxSpeed(int value) {
		maxSpeed = value;
	}
	
	void ShowInfo()
	{
//		System.out.println("" + company);
		System.out.println("Company : " + company);
		System.out.println("Max Speed : " + maxSpeed);
		System.out.println("Current Speed : " + speed);
		System.out.println("Current RPM : " + rpm);
	}
	
	void Hi()
	{
		int value = 0;
		System.out.println("Value : " + value);
	}
}
