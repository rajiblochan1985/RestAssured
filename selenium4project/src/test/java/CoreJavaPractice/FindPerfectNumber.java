package CoreJavaPractice;

import java.util.Scanner;

public class FindPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, sum=0;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number: ");
		n = s.nextInt();
		for(int i=1; i<n; i++) {
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == n) {
			System.out.print("This is a Pefect Number");
		}
		else {
			System.out.println("This is not a Perfect Number");
		}
	}

}
