package day04;

/*
 	정수를 입력 받아서
 	짝수인지 홀수인지를 판별하세요.
 	단, 0은 짝수로 간주한다.
 	
 */

import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		//할 일
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//입력 메세지 출력
		System.out.print("정수 입력 : ");
		//입력 받아서 변수에 저장(기억시키기)
		int num = sc.nextInt();
		//짝수인지 홀수인지 판별
		String result = (num % 2 == 0) ? ("짝수") : ("홀수"); //문자열 result 변수를 만들고 num이 2로 나눴을 때 0이면
		//출력													참(짝수)을 표기, 0이 아니면 거짓(홀수) 표기	
															 //3삼항연산자를 이용해 if 조건문처럼 만들기
		System.out.println("입력 받은 숫자 [ " + num + " ] 은 ' " + result + " ' 입니다.");
		
	}

}
