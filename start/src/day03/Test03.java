package day03;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		System.out.println('J' + 3.14);
		
		
		// 'J' 이후의 열번째 문자는 무엇인지 출력하세요.
		JOptionPane.showMessageDialog(null, "J 이후의 열번째 문자 : " + ('J' + 10));
	}
}
