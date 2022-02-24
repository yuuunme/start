package day01;

public class Test06 {
	public static void main(String[] args) {
		System.out.printf("%6s : %7.2f\n", "파이", 3.14);  //%3.2f = 전체 자릿수는 7자리고, 소수점 뒷자리 2 이하로
		System.out.printf("%5s : %7.2f", "원넓이", 10.5);
	}
}

//문자열 출력 : %s
//실수값을 소수 방식으로 출력 : %f


//static 속성의 특징 알기

//실행한다 -> 메모리에 올려야 실행할 수 있음.
// 메모리에 올리지 않은 애들은 실행이 안 됨
// static이 붙어있는 함수 속성을 쓰면 static 영역에 
// 클래스가 실행되는 순간 먼저 올려짐..??
// static 붙어있는 함수들 : static void, static console ...등
// 자바 인덱스 파일에서 메소드 서머리 보면서 공부하기


