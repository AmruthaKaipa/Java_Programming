import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Perfect or not");
        int n = input.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                s = s + i;
            }
        }
        if (n == s){
            System.out.println(n + " is a Perfect Number");
        }
        else{
            System.out.println(n + " is not a perfect Number");
        }
    }
}
