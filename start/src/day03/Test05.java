package day03;

public class Test05 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		
		int no3 = no1++ + ++no2; // " ++no2 " => 변수 no2 기준으로 앞에 증감연산자가 있으니 현재로부터 
				// ↓							no2의 값은 정의된 20값에 1 플러스 된 21임.
			   // 이 no1은 앞서 정의된대로 10의 값이고, no1 기준으로 다음에 나오는 no1부터 1이 증가된 값으로 바뀜.
		
		System.out.println("no1 : " + no1);	// no1의 값 = 11
		System.out.println("no2 : " + no2); // no1의 값 = 11
		System.out.println("no3 : " + no3); // no3의 값은 앞서 정의된 수식대로 계산했을 때 31이 됨.

		
	}
}
