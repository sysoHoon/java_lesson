package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {
	public static void main(String[] args) {
		
		// �⺻�����ڷ� ��ü �����ϱ�
		MyClass2 my2 = new MyClass2();	
// ���� : Ŀ���� �����ڸ� �����ϸ� �⺻���� �� �� �ִ� �⺻ �����ڰ�
//     ����� �� ���� �ȴ�. -> �⺻ ������ ���� ����
		
		// Ŀ���� �����ڷ� ��ü �����ϱ�
		MyClass2 my22 = new MyClass2("���");
		
		System.out.println("my2 name : " + my2.getName());
		System.out.println("my22 name : " + my22.getName());
		
		// my2 ��ü�� �⺻ �����ڸ� ����ϸ� name �ʵ尪 �ʱ�ȭ�� ���Ѵ�.(���� ����)
		
		// �⺻ �����ڸ� ������� �ʴ� ����.
//		Scanner sc = new Scanner();
	}
}