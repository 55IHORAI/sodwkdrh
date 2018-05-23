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
			System.out.print(" 넣을  음식을 입력해주세요 \n 0. 냉장고 닫기 1.김치 2.계란 3.물  4.참치 5.소세지 ");
			a = sc.nextInt();
			if ( a == 0) {
				door = false;
				System.out.print("냉장고 문을 닫습니다");
				break;}
			else {
				inner[i] = a;
				i++;
				if (i == 5) {
					System.out.print("냉장고에 들어있는 목록 : ");
					while( k < 5){
						switch (inner[k]) {
						case 1  :
							System.out.print("김치"); break;
						case 2  :
							System.out.print("계란"); break;
						case 3  :
							System.out.print("물"); break;
						case 4  :
							System.out.print("참치"); break;
						case 5  :
							System.out.print("소세지"); break;
						}
						k++;

					}
				}
				System.out.println("");
			}
			
			
		}

	}

}
