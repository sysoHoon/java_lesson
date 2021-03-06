package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[[영화감상 후기]]");
		System.out.print("평점을 몇 점 주시겠습니까? (1~5) -> ");
		int count = sc.nextInt();
		
		System.out.println("방법1)");
		for(int i = 0; i < count; i++) {
		System.out.print("★");
		}
		System.out.println();
		
		System.out.println("방법2)");
		for(int i = 0; i < count; i++) {
			System.out.print("★");
		}
		for(int i = 0; i < (5 - count); i++) {
			System.out.print("☆");		// 출력횟수는 5 - count
		}
		System.out.println();
		
		System.out.println("방법2_)");
		
		for(int i = 0; i < 5; i++) {		// 3개
			if(i<count) {
				System.out.print("★");
			}else {
				System.out.print("☆");	// 2개
			}
		}
		System.out.println();
		
		System.out.println("방법2__)");
		int k = 0;	// loop counter 변수가 main메소드의 지역변수
		for(k = 0; k < count; k++) {	// count = 3;
			System.out.print("★");
		}
//		System.out.println("k = " + k);	// k = 3;, 위의 for문이 종료가되는 k 
		for(;k<5;k++) {
			System.out.print("☆");
		}
	}
}
