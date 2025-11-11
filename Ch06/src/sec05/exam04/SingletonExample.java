package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); //생성자가 private으로 선언되어 있어서 외부에서 new Singleton을 통해 객체 생성 불가능
//		Singleton obj2 = new Singleton(); 

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}

}
