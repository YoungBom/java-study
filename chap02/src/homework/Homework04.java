package homework;


import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
       System.out.printf("문자를 입력하세요:");
       char inputChar = sc.nextLine().charAt(0);
       
       int unicode = inputChar;
       System.out.println(inputChar + "의 유니코드:" + unicode);
       
		
	}

}
