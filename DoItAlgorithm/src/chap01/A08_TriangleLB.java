package chap01;

import java.util.Scanner;

public class A08_TriangleLB {
	
	//왼쪽 아래가 직각인 이등변 삼각형 출력
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt(); 
		} while (n <= 0); // n이 > 0 일때까지 '이등변 삼각형 단 수(n)'를 입력한다.

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
