package day03;

public class Test04 {
	public static void main(String[] args) {
		int no1 = 5;
		int no2 = 3;
		
		System.out.println("no1 / no2 = " + (no1 / no2));
		//no1, no2 둘 다 int의 정수 타입임. 나누고 난 나머지 값은(소수 값) 정수형이기 때문에 생략되어
		// 1이라는 값이 나옴. 나누고 난 나머지 값을 알기 위해서는 %(나머지 기호)를 사용하여 알아낼 수 있다.
		
		System.out.println("no1 + no2 =" + (no1 + no2));
		System.out.println("no1 - no2 =" + (no1 - no2));
		System.out.println("no1 * no2 =" + (no1 * no2));
		System.out.println("no1 / no2 =" + (no1 / no2));
		System.out.println("no1 % no2 =" + (no1 % no2));
	}
}
