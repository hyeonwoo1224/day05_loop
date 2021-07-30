package day05_loop;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		for(int i=2; i<=20; i+=2) {
			System.out.print(i+" ");
		}
		int sum = 0;
		System.out.println("2부터 20까지의 합을 구합니다.");
		for(int i=2; i<=20; i+=2) {
			sum += i;
		}
		System.out.println("2부터 20까지의 합은"+sum+"입니다.");
		//for문을 이용해 30까지 3의 배수의 합을 구하세요 
		for(int i=1; i<=30; i++) {
			if(i % 3 == 0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("입력 : ");
		num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println("2조짱");
		}
	}
}
