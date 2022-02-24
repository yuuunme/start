package day02;

/**
 * 자신의 정보를 기억하고 출력하는 기능의 클래스
 * @author 	yuna
 * @since 	2022.02.23
 * @version v.1.0
 */

public class Test04 {
	/*
	 * 자신의 이름, 나이, 이름 첫문자, 키를 변수에 기억시키고 출력하세요.
	 */
	public static void main(String[] args) {
		String name = "정유나";			// 문자열 표현하는 클래스
		int age = 27;					// 정수형 기본
		char sijak = '정';				// 문자형
		double height = 160.0;			// 실수형 : float , double (소수점 뒤의 숫자 생략 가능,ex. double height = 160.;)
		
		
		System.out.println("제 이름은 " + name + "이고");
		System.out.println("나이는 작년엔 " + age + "살이었는데, ");
		System.out.println("올해로 " + (age + 1) + "살 되었습니다.");
		System.out.println("이름의 첫 글자는 '" + sijak + "'입니다.");
		System.out.println("키는 " + height + "이예요. ㅎㅎ");
		
		
		
		
		// 유니코드형을 쓰기 때문에 문자끼리의 값도 비교 가능하다.
		System.out.println("'가' > '나' : " + ('가' > '나'));
		/* 가나다라마바사아자차카타파하
		값	<<<<<<<<<<<<<<<<<<<<<<<<<
			왼쪽에서부터 읽기 때문에 하의 값이 제일 큼
			*/
		
	}
}
