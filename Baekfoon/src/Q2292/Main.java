package Q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		int c = 1;

		while (true) {
			if (a <= b) {
				break;
			}b = b + 6 * c++;
		}System.out.println(c);
		

	}
}
