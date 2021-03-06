package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// C43번 예제 리스트로 변경하기 // 작성자 : 박상훈
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5;
		
		ArrayList<MathProblem> problem = new ArrayList<>();
		
		int ans;
		int cnt = 0;
		System.out.println("------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("------------------------------------------");
		System.out.println("시작합니다.");
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			
			System.out.print("문제" + (i+1) + ". " + temp.problem() + " 답 입력 -> ");
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			problem.add(temp);
		}
		System.out.println("------------------------------------------");
		System.out.println("채점 합니다. 맞은 갯수 " + cnt + " ( " + (cnt*100/size) + " 점)"); // 100/size는 1문제당 점수
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		
		for(int i = 0; i < problem.size(); i++) {
			if(problem.get(i).isCorrect() == false)
				System.out.println("문제" + (i+1) + ". " + problem.get(i).problem() + problem.get(i).showAnswer());
		}
	}
}
