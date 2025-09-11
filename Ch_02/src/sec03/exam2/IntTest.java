package sec03.exam2;
import java.util.Scanner;

public class IntTest {

	public static void main(String[] args) {
		byte val1 = 1;
		byte val2 = 2;
		
		//byte val3 = vall + val2;	//정수를 int를 사용
		
//		System.out.println("1/2 : " + 1/2);
//		System.out.println("1.0/2.0 : " + 1.0/2.0);	//피연산자 중 하나라도 double이 있으면 double로 처리
		
		String str = "10";	//String str = String.valueOf()
		int value = 20;
		//String str1 = str + value;
		String str1 = "" + value;
		
		//int result = val1 + Integer.parseInt(str);
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		System.out.println(input);
		
	}

}
