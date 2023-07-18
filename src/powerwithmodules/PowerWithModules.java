package powerwithmodules;

import java.util.Scanner;

public class PowerWithModules {
	
	public static int powerWithModules(int A,int B,int C) {
		A = A % B;
		int result = 1;
		for(int i=1;i<=B;i++) {
			result = (result * A) % B;
		}
		return result % B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int results = powerWithModules(A,B,C);
		System.out.println(results);
	}

}
