
package mento_ljh01;

import java.util.Random;
import java.util.Scanner;

public class MentoLjh01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 반복문을 사용해 *를 출력하는 코드 작성(역삼각형)
		for(int i = 7; i >= 0; i--) {
			for(int j = 0; j <7 - i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < (2*i); j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
//		// 2. 1~100까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for문을 사용해 작성
		int[] num = new int[100];
		int total = 0;
		for(int i = 0; i <= num.length; i++) {
			if(i%2 == 0) {
				total += i;
			}
		}
//		System.out.println(total);
		// 3. 두 개의 주사위가 같은 값이 나올 떄까지 while문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력하기
		
		int count = 0;
		while(true) {
			int dice1 = (int)((Math.random()*6) + 1); 
			int dice2 = (int)((Math.random()*6) + 1);
			if(dice1 == dice2) {
				System.out.println("반복 횟수 : " + (count+1) + "주사위1 : " + dice1 + ", 주사위2 : " + dice2);
				break;
			}else {
				count++;
			}
		}
		// 4. 다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성(1/2/3/4 삼각형)
		for(int i = 0; i < 4; i++) 
		{
			for(int j = 0; j < (4 - i) / 2; j++) 
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < (i + 1); j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

		// 5. 다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성(1/3/5/6 삼각형)
		for(int i = 0; i <= 4; i++) 
		{
			for(int j = 0; j < 4 - i; j++) 
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j <(2*i) + 1; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 6. 2차원 배열을 활용한 로또만들기 (다른방식)
		String choice;
		int[][] nums = new int[9][5];
		for(int i = 0; i < nums.length; i++) 
		{
			for(int j = 0; j < nums[i].length; j++) 
			{
				nums[i][j] =(i * 5) + j + 1;
			}
		}
		
		String lottoNums = "";
		int curNum = 0;
		for(int i = 0; i < 7; i++) 
		{
			int randNum = (int)(Math.random() * 9);
			int randNum2 = (int)(Math.random() * 5);
			
			if(nums[randNum][randNum2] == 0) 
			{
				i--;
				continue;
			}
			else 
			{
				lottoNums = "" + nums[randNum][randNum2];
				nums[randNum][randNum2] = 0;
				curNum++;
			}	
			System.out.println(lottoNums);
			System.out.println("7자리 번호를 입력해주세요");
			choice = sc.nextLine();
			if(choice.equals(lottoNums)) {
				System.out.println("당첨되었습니다!");
			}else {
				System.out.println("낙첨입니다!");
			}
		}
		
		
		
	}
}
