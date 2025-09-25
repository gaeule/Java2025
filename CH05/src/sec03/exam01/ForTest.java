package sec03.exam01;

public class ForTest {

	public static void main(String[] args) {
		int[] scores = {91, 75, 84, 83, 87};	//평균을 구하는 코드를 만드시오
	
		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println("Sum : " + sum);
	}

}
