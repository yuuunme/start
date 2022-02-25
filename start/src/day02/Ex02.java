package day02;

import javax.swing.*;
public class Ex02 {
	public static void main(String[] args) {

/* 타입간의 변환 방법
		
	1. 문자와 숫자간의 변환
		
 		숫자 + '0' = '문자'
		숫자 - '0' =  숫자 
	   '문자'- '0' = '숫자'
	
	2. 문자열로의 변환
	
		 숫자  + "" = "문자열"
    	'문자' + "" = "문자열"
    	
	3. 문자열과 숫자간의 변환
	
		"문자열" + 숫자 = "문자열"
	
		lnt     로 변환 => Integer.parseInt("문자열")
		double으로 변환 => Double.parseDouble("문자열")
		
	4. 문자열을 문자로 변환
	
		"문자열".CharAt(0)
									
		*/
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');		// 문자열을 문자로 변환 후 문자-문자 = 숫자
		System.out.println('3' - '0' + 1 );				// '문자'-'0'= 숫자
		System.out.println(Integer.parseInt("3") + 1);	// 문자열을 숫자로 변환
		System.out.println("3" + 1); 					//문자열 + 숫자 = 문자열 
									 					//System.out.println("문자열" - 4); //
		System.out.println(3 + '0'); 					//숫자 + '0'(문자) = 숫자 ('0'은 숫자로 48)

		
		
		//3 4 
	}
}
