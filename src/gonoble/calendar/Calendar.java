package gonoble.calendar;

import java.util.Scanner;

// 숫자를 입력받아 해당하는 달의 최대일수를 출력하는 프로그램
public class Calendar {
		
	public static int maxDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxdays(int month) {
		return maxDays[month-1];
	}

	public static void main(String[] args) {
		System.out.println("달을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		System.out.println(getMaxdays(month));
		
		scanner.close();
	}
}
