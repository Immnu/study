package chap02;

public class A01_IntArray {

	//구성요소의 자료형이 int형인 배열 
	
	public static void main(String[] args) {

		int[] a = new int[5]; //배열의 선언
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a["+i+"] = " + a[i]);
		
		
	}

}