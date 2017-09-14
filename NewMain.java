package lecture01;
//@author HamadAllo
import java.util.Scanner;

public class NewMain {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        double Hn = 0;
        for (int i=1; i<=n; i++){
            Hn += 1.0/i;
        }
        System.out.printf("H(%d) = %.3f\n",n, Hn);
    }
}
