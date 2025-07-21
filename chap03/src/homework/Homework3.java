package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구 수:");
		int friends = sc.nextInt();
		
		System.out.println("사탕의 수: ");
		int candies = sc.nextInt();
		
		// 친구 한명당 나눠줄 수 있는 사탕의 최대 개수
		
		int candiesPerFriend = candies / friends;
		

	}

}
