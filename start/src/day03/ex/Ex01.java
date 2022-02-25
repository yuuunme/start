package day03.ex;
/* 
문제 1 ]
	두개의 숫자를 입력받은 후(가로, 세로)
	그 숫자를 이용해서 
		사각형의 넓이와          ==> 가로 x 세로 
		삼각형의 넓이를 구해서	 ==> 밑변 x 높이 x 1/2
	결과를 출력하세요.
	
	출력형식 ]
		
		가로 : XXXXX
		세로 : XXXXX
		사각형 넓이 : XXXXXXX
		삼각형 넓이 : XXXXX.X
		
		*참고
		자바에서 '*' 기호의 의미
		=연산자로서 곱하기의 의미
		=모든 것을 의미

		자바에서 '.' (점) 기호의 의미
		하위, 그 안에 있는..

*/
import java.util.*;
public class Ex01 {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 //입력 도구 준비
		 System.out.print("사각형의 가로 길이: ");
		 //가로 입력 메세지 출력
		 String garo = sc.nextLine();
		 //가로에 문자열로 입력 받게 해 줌.
		 
		 System.out.print("사각형의 세로 길이: ");
		 //세로 입력 메세지 출력
		 String sero = sc.nextLine();
		 //세로에 문자열로 입력 받게 해 줌.
		 int width = Integer.parseInt(garo);
		 //문자열로 입력 되어 있던 가로 길이를 숫자로 바꿔줌
		 int heigh = Integer.parseInt(sero);
		 //문자열로 입력 되어 있던 세로 길이를 숫자로 바꿔줌
		 System.out.println("사각형의 넓이 : " + (width * heigh));
		 
		 System.out.print("삼각형의 밑변 길이 : ");
		 //밑변 입력 메세지 출력
		 String mi = sc.nextLine();
		 //밑변에 문자열로 입력 받게 해 줌.
		 System.out.print("삼각형의 높이 : ");
		 //삼각형 높이 입력 메세지 출력
		 String samsero = sc.nextLine();
		 //삼각형 삼각형 높이 문자열로 입력 받게 해 줌.
		 int wid = Integer.parseInt(mi);
		 int hi = Integer.parseInt(samsero);
		 //삼각형 밑변 길이, 높이 문자열을 정수(숫자)로 바꿔줌.
		 System.out.println("삼각형의 넓이 : "+((wid * hi) / 2));

		 
/**두번째 예시안
 *  import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		
		 삼각형의 넓이
		가로 * 세로 / 2.0;
		실수형 데이터로 표현해주기
		or
		가로 * 세로 / (double)2
		
		강제 형변환
 */
		 
/***첫번째 예시안
 * 
 * import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 	//입력 도구 준비 
		 System.out.print("가로 : ");
		 	//입력메세지 출력
		
		 //문자열로 입력 받아서 처리하는 방법
		 String garo = sc.nextLine(); //문자열로 입력 받는 방법
		 	//정수형태의 문자열을 정수로 변환하는 방법
		 	// Integer.parseInt(문자열);
		 int width = Integer.parseInt(garo);
		 
		 System.out.println("입력된 가로 : " + garo);
		 System.out.println("입력된 정수 가로 : " + (width + 20));
		 //출력
	
		 
		 System.out.print("세로 : ");
		 int sero = sc.nextInt();
		 
		 System.out.println("입력된 세로 : " + sero);
		 */

		 
	}
}