package sodwkdrh;

import java.util.Scanner;

public class food {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean door = true;
		int a, i = 0, k = 0;
		int dydfid = 5;
		int[] inner = new int[dydfid];
		
		
		while (door = true){
			System.out.print(" ����  ������ �Է����ּ��� \n 0. ����� �ݱ� 1.��ġ 2.��� 3.��  4.��ġ 5.�Ҽ��� ");
			a = sc.nextInt();
			if ( a == 0) {
				door = false;
				System.out.print("����� ���� �ݽ��ϴ�");
				break;}
			else {
				inner[i] = a;
				i++;
				if (i == 5) {
					System.out.print("����� ����ִ� ��� : ");
					while( k < 5){
						switch (inner[k]) {
						case 1  :
							System.out.print("��ġ"); break;
						case 2  :
							System.out.print("���"); break;
						case 3  :
							System.out.print("��"); break;
						case 4  :
							System.out.print("��ġ"); break;
						case 5  :
							System.out.print("�Ҽ���"); break;
						}
						k++;

					}
				}
				System.out.println("");
			}
			
			
		}

	}

}
