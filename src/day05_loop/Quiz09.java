package day05_loop;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		for(int i=2; i<=20; i+=2) {
			System.out.print(i+" ");
		}
		int sum = 0;
		System.out.println("2���� 20������ ���� ���մϴ�.");
		for(int i=2; i<=20; i+=2) {
			sum += i;
		}
		System.out.println("2���� 20������ ����"+sum+"�Դϴ�.");
		//for���� �̿��� 30���� 3�� ����� ���� ���ϼ��� 
		for(int i=1; i<=30; i++) {
			if(i % 3 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("�Է� : ");
		num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println("2��¯");
		}
	}
}
