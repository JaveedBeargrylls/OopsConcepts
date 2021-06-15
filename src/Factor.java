import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        double f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Factorial Number = ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
