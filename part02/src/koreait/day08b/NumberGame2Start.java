package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2Start {
	public static void main(String[] args) {
		
		Random r = new Random();	// 난수 입력 받기
		Scanner sc = new Scanner(System.in);	// 생각한 숫자 입력 받기
		int max = 10;	// 시도횟수
		int[] triallst = new int[max];	
		GameValue[] history = new GameValue[10];	// 최대 10개 기록을 저장.
		int k = 0;	// history 배열의 인덱스 변수
		
		System.out.println("숫자 맞추기 게임 시작합니다.");
		System.out.print("게임을 시작하려면 너 휴먼의 이름을 쓰시오 >>> ");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;
		
		do {
			// 여기서 부터
			GameValue temp = new GameValue(gamer);
			System.out.println("이제 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			System.out.printf("너, 휴먼은 맞춰보세요. (범위 %d ~ %d)", rmin, rmax);
			int numComputer = GameValue.makeNumber(rmin, rmax);	// 101 ~ 299 난수 뽑기
			int numHuman;
			int i = 0;	// 배열의 index
			
			do {
				
				System.out.print("생각한 숫자 입력(기회 : " + (max - i) + ") ->"); 
				numHuman = sc.nextInt();	// 생각한 숫자 입력하기
				if(numComputer > numHuman) {	// numComputer가 받은 난수가 생각한 숫자보다 클때
					triallst[i] = numHuman;	// 입력받은 숫자를 배열에 저장
					i++;					// i는 1씩 증가
					System.out.println("아닙니다. 더 큰 값입니다.");
				}else if(numComputer < numHuman) {
					triallst[i] = numHuman;
					i++;
					System.out.println("아닙니다. 더 작은 값입니다.");
				}
				
				if(i == max) break;
				
			} while (numComputer != numHuman);
			// numComputer == numHuman이면 답을 맞춘것. -> do~while 종료
			
			if(i == max) {
				System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
				System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요.!! [답은 " + numComputer + "]");
				temp.setCount(i);
			}else {
				System.out.println("딩동댕~ 맞추셨습니다. 성공까지 시도 횟수 : " + (i+1));
				temp.setCount(i+1);
				temp.setSuccess(true);
			}
			// 여기까지 반복
			
			// 위의 게임결과를 history배열에 저장
			history[k] = temp;		// temp는 GameValue 객체의 참조값(주소)
			k++;		// 다음 인덱스 값, 카운트 역할(게임한 횟수)
			
			System.out.print("게임을 계속하시겠습니까? 계속하려면 0 입력 >>> ");
		}while(sc.nextInt() == 0);
		
		System.out.println("::::::::: 게임 스코어 :::::::::");
		// for 반복으로 history 배열에 저장된 값 출력하기
		for(int j = 0; j < k; j++)
			history[j].print();		// history[j]의 타입은 GameValue
		
		System.out.println("::::::::: The End :::::::::");
		sc.close();
	}
}
