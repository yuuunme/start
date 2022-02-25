package day04;

/*
 	1 ~ 25 사이의 정수를 랜덤하게 발생 시켜서
 	그 숫자가 짝수인지 홀수인지 판별해서
 	출력하세요.
 	
 	참고 ] 
 		특정 범위 내의 랜덤 숫자 발생시키는 방법(난수 생성)
 		
 			Math 클래스 내에 0 이상 1 미만 실수를 발생시켜 주는 함수(정수(1 이상의 수)는 만들어지지 않음)
 				Math.random()	//랜덤 정수를 만들고 싶다면 형변환을 시켜주면 됨.
 				
 					0 <= Math.random() < 1	x T
 					0 <= Math.random() * T < T
 					
			형식 ]
				a ~ b 사이의 랜덤한 정수(b가 a보다 큰 수라고 가정) 만드는 법
				
				(int) (Math.random() * (b - a + 1) + a)
				(강제형변환) (Math.random() * (큰 수 - 작은 수 + 1) + 작은 수)
				
 */

public class Test05 {
	public static void main(String[] args) {
		//할일
		//랜덤하게 숫자 만들기
		int no = (int)(Math.random() * (25 - 1 + 1) + 1);
		
		//숫자 판별하기
		// () ? () : (); 형식 먼저 만들고 채워나가는 게 빠름.
		String result = (no % 2 == 0) ? "짝수" : "홀수";	//문자 변수 result를 만들고
														//no(랜덤한 숫자)가 2로 나눴을때 0이면(짝수이면) 참(짝수)표기,
														//거짓(홀수)이면 홀수 표기
		System.out.println("1 ~ 25 사이의 랜덤하게 발생된 숫자(난수) " + no + 
				" (은)는 " + result + "입니다.");
	}
}
