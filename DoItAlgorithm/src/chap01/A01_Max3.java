package chap01;

import java.util.Scanner;

public class A01_Max3 {

	public static void main(String[] args) {
		
		//3개의 정수값 입력하고 최대값 구하기
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		int max = a; 
		if(b > max) max = b;
		if(c > max) max = c;
		//최대값을 max에 대입
		
		System.out.println("최대값은 " + max + "입니다.");
	}

}
