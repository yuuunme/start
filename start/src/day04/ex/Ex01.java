package day04.ex;
/*
 	문제 1 ]
 			1 ~ 25 사이의 숫자 3개를 랜덤하게 발생시켜서
 			그 수들 중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 			
 			단 3항 연산자를 사용해서 처리하세요.
 */
public class Ex01 {
	static public void main(String[] args) {
	//할일
		//랜덤하게 숫자 3개 만들기
		int no1 = (int)(Math.random() * (25 - 1 + 1) +1);	//(큰수 - 작은수 + 1) + 작은 수)
		// -100~ 100 사이의 정수를 랜덤하게 발생시킨다면
		// int no1 = (int)(Math.random() * (100 - (-100) + 1) +1);
		// Math.random()
		int no2 = (int)(Math.random() * (25 - 1 + 1) +1);
		int no3 = (int)(Math.random() * (25 - 1 + 1) +1);
		//숫자 판별 (가장 큰 수)해서 변수에 담기
		
		int max = (no1 > no2) ? ( //no1 > no2라는 전제하게 실행
				(no1 > no3) ? no1 : no3
				) : (	//no2 > no1이라는 전제하에 실행
						(no2 > no3) ? no2 : no3
				);
				
		//출력하기
		System.out.println("입력한 세 정수 \n\t" + no1 + ", " + no2 + ", " + no3 + "\n 중 제일 큰수는 " + max + "입니다.");
		
		/*참고 ]
		문자열 표현할 때 문자열 안에 " 기호를 출력하는 방법
		==> \"
		
		이때 사용한 \ 를 이스케이프 문자라고 부른다.
		
		많이 사용하는 문자들
		
			\" - 문자열 내에 " 를 표현
			\n - 한줄 내림기호
			\r - 캐리지 리턴
			\t - tab을 표현
			\b - backspace
		*/
	}
}
