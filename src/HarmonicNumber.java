import java.util.Scanner;
public class HarmonicNumber{
	public static void main (String[] args) {
		//int j = 1;
		int n;
		double j = 0;
		Scanner Sc = new Scanner(System.in);
		System.out.print("enter the value = ");
		n = Sc.nextInt();
		System.out.print("Harmonic series of "+n+" = ");
		for (int i = 1; i <= n; i++) {
			System.out.print(1+"/"+i);
			j = j + (double) 1/i;
			if(i==n) {
				break;
			}
			else
			System.out.print(" + ");
		}
		Sc.close();
		System.out.println("\nHarmonic number of "+n+" is = "+j);
	}
}