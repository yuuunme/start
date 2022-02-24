package day02;

/*******자동 형변환****/

public class Test07 {
	public static void main(String[] args) {
		/*
		 * 타입이 다른 두 데이터의 연산의 결과는 항상 큰 타입 쪽으로 자동 형변환이 이루어진다.
		 */
		
		double no = 3.14 + 10;
		
		
		char ch = 'a';	//a의 코드값 = 65
		
		
		int num = ch + 5;	//ch에 5를 더하면 원래는 70이 됨.
		
		
		//하지만 char 가 int 타입보다 크기(바이트)가 작음
		
		char ch1 = (char) num;	//문자로 변환
		
		System.out.println("'a' 보다 5번째 이후 문자 : " + ch1);
		
		System.out.println(no);
}
}
