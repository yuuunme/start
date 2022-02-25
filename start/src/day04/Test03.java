package day04;


	//시프트 연산자//

public class Test03 {
	public static void main(String[] args) {
		int no = 20;
		
		int result = 20 >> 2;	//오른쪽으로 미니까 2(2의 2승)로 20을 나누면 됨
	
		
		System.out.println("result : " + result);
		
		result = result << 3;	//20(result => 5(앞에 명령에 의해서 5 됨)를 3(2의 3승)으로 곱한 값
		
		System.out.println("result : " + result);
		
		System.out.println("<< 1 : " + (-64 >> 1));
		System.out.println(">>> 1 : " + (-64 >>> 1));
	}
}
