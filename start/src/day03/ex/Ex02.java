package day03.ex;


/* 
  문제 2 ]
  		하나의 숫자를 입력 받은 후 (원의 반지름)
  		그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
  		
  		참고 ]
  			원의 넓이 : 반지름 * 반지름 * 3.14
  			원의 둘레 : 2 * 반지름 * 3.14
 */
import java.util.*;	// java.util 패키지 하위에 바로 속한 모든 클래스 사용한다는 뜻
// 이 예제의 경우는 Scanner를 바로 사용할 예정이라 java.util.Scanner 로 명시해도 된다.
// * 보다 클래스 이름(위의 경우 Scanner)을 명시하는 방법을 우선 적용 시킨다.
// 클래스를 사용하기 위해서는 어디 패키지에 속해 있는지 알아야 사용 가능하다.

/*
 		A패키지 - abcd.txt 클래스
 				- efg.txt 클래스
 				
		B패키지 - abcd.txt 클래스
				- xyz.txt 클래스
				
		A패키지를 사용하는 중이라 가정할 때 A 폴더의 abcd.txt 클래스, efg.txt클래스는
		바로 사용할 수 있지만 A패키지에서 B패키지의 abcd.txt클래스, xyz.txt클래스를 사용하려면
		import java.B패키지.abcd 처럼 패키지 이름을 명시해야 사용 가능하다.
		
		import => 다른 패키지에 있는 걸 불러와서 사용할 ㄸㅐ
 */


public class Ex02 {
	public static void main(String[] args) {	
	
		Scanner sc = new Scanner(System.in);	//(System.in) => 휘발성, 입력 받아도 값이 메모리에 저장되지 않고
		//입력 도구 준비										 입력된 값이 사라짐.
		System.out.print("원의 반지름 : ");
		//원의 반지름 입력 메세지 출력
		String ban = sc.nextLine();
		//입력 받게 해 줌(변수에 기억시킴)
		int baan = Integer.parseInt(ban);
		//반지름 문자열을 정수로 입력 받게 해 줌.
		//정수, 실수 모두 입력 받게 해 주려면 
		//double baan Integer.parseDouble(ban)
		System.out.println("원의 넓이 : " + (baan * baan) * (double)3.14);
		System.out.println("원의 둘레 : " + (2 * baan) * (double)3.14);
		
		
	/*선생님 답안(나랑 답 같음)
	 Scanner sc = new Scanner(System.in);
	 //입력 도구 준비
	 System.out.print("반지름 : ");
	 //입력 받기 전 메세지 출력
	 String rad = sc.nextLine();
	 //입력 받는다. 변수에 기억
	 double pi = 3.14;
	 //반지름
	 double area = rad * rad * pi;
	 //원의 넓이 계산 : 숫자 데이터의 연산은 항상 큰 데이터 타입으로 결과가 나온다.
	 double arround = 2 * rad * pi;
	 //원의 둘레 계산
	  System.out.println("반지름 : " + rad);
	  System.out.println("넓  이 : " + area);
	  System.out.println("둘  레 : " + arround); 
	  
	  
	  *****형변환에서 큰 타입의 데이터를 작은 타입으로 변환하면
	  *남는 부분은 버린다.
	  *
	  *ex) 더블타입 - > 인트타입 : 소수점 이하 자리 없어짐(반올림도 안 됨)
	  
	 */
	}
	

}
