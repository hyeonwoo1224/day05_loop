package day05_loop;

public class Ex01_for {
	 public static void main(String[] args) {
		/*
		 for���� ; ������ ������ 2���� ���;� �Ѵ�
		 �ʱⰪ ���ǽ� �������� ��� �������
		 for(�ʱⰪ ; ���ǽ� ; ������ ;) {
		 	���ӹ���
		 }
		 */
		 int sum,cnt;
		 sum = 0;
		 for(cnt=1; cnt<=10; cnt++) {
			 sum = sum + cnt;
		 }
		 System.out.println("sum : "+sum);
		 System.out.println("cnt : "+cnt);
	}
}
