package chap01;

import java.util.Scanner;

public class C02_Digits {

	//2자리의 양수(10~99)를 입력
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int no;

		System.out.println("2자리의 정수를 입력하세요.");

		do {
			System.out.print("입력: ");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99); // 2자리의 양수를 입력할 때까지 반복

		System.out.println("변수 no의 값은 " + no + "(이)가 되었습니다.");
	}

}
