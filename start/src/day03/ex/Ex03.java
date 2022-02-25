package day03.ex;
	/*
	  문제 3]
	  		54,232원을 지불하려고 한다.
	  		우리 나라 화폐 단위로 이 금액을 지불하려면
	  		각 단위가 몇개씩 필요한지 계산해서 출력하세요.
	  		
	  		화폐단위
	  			50,000원권
	  			10,000원권
	  			5,000원권
	  			1,000원권
	  			500원권
	  			100원
	  			50원
	  			10원
	  			1원
	  			
	  			
	 */
public class Ex03 {
	public static void main(String[] args) {
		int total = 84232;
		//위의 금액권 다 합한 금액
		
		int tmp = total;
		
		int oman = tmp / 50000;
		// 오만원권 지정 후
		//토탈 금액에서 5만원권이 제외된 금액을 tmp에 기억시켜야함(밑에 과정)
		tmp = tmp % 50000; 	// tmp %= 50000; 으로도 표현 가능, tmp를 50000으로 나눈 나머지를 tmp에 대입하세요.
		//tmp % 50000의 값이 왼쪽의 tmp에 저장이 됨
		// 5만원권으로 나눈 나머지 값이 저장이 되어야 하니까 나눔
		
		int man = tmp / 10000;
		//1만원권을 제외한 금액을 tmp에 기억
		tmp = tmp % 10000;
		
		int ochun = tmp / 5000;
		tmp = tmp % 5000;
		// 5천원권
		
		int chun = tmp / 1000;
		tmp = tmp % 1000;
		// 천원권
		
		int oback = tmp / 500;
		tmp = tmp % 500;
		
		int back = tmp / 100;
		tmp = tmp % 100;
		
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		int ship = tmp / 10;
		//tmp를 10단위로 만들어야 하니까 생략
		
		int il = tmp % 10;
		//tmp를 1단위로 만드나 안 만드나,,, 그냥 생략 ???
		
		//결과 출력
		
		System.out.println("총 금액 " + total + " 원은 ");
		System.out.println("오만원권 : " + oman + " 장");
		System.out.println("만원권 : " + man + " 장");
		System.out.println("오천원권 : " + ochun + " 장");
		System.out.println("천원권 : " + chun + " 장");
		System.out.println("오백원권 : " + oback + " 장");
		System.out.println("백원권 : " + back + " 장");
		System.out.println("오십원권 : " + oship + " 장");
		System.out.println("십원권 : " + ship + " 장");
		System.out.println("일원권 : " + il + " 장");

		
	}

}
