import java.util.Scanner;
public class Subtract_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int a,s = 0,p = 1;
        while (n>0){
            a = n % 10;
            s = s + a;
            p = p * a;
            n = n / 10;
        }
        System.out.println(p-s);

    }
}