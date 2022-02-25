package day04;

/*정수 하나를 입력 받아서
 * 이 수가 0인지 홀수인지 짝수인지 판별하세요
 * 
 *  참고]
 *  조건문
 *  if(조건식) {
 *  	조건식이 참일 경우 실행하는 부분
 *  	실행 내용
 *  	}
  
 */

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		
		//입력 도구 준비
		Scanner sc = new Scanner(System.in);
		//입력 받기 전 입력메세지 출력
		System.out.print("정수 입력 : ");
		//입력 받아서 정수를 변수에 기억 시키기
		int num = sc.nextInt();
		//조건 만들기
		String soo = "[영]"; //문자열 변수 먼저 만들기
		
		//1) 홀수인 경우
		if(num % 2 != 0) { // num % 2 ==1	, 넘을 2로 나눴을 때 0이 아닌 경우 홀수로 표시하라.
			soo = "홀수";
		}
		
		//2) 짝수인 경우
		if(num != 0 && num % 2 == 0) { //num이 0이 아니면서(이미 변수 선언할 떄 0으로 만들었기 떄문에 0은 제외
			soo = "짝수";				// num을 2로 나눴을 때 0인 경우 짝수로 표시
		}
		
		
		//내용 출력
		System.out.println("입력 받은 정수 " + num + " 은 " + soo + " 입니다.");
		
	}

}
