package chap01;

import java.util.Scanner;

public class A04_SumWhile {

	// 1, 2, ..., n의 합 구하기
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0; // 합
		int i = 1;
		
		while(i <= n) { // i가 n이하면 계속 반복
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
