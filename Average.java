import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value upto which you wanted to find average");
        int  n = input.nextInt();
        float s = 0;
        for (int i = 1; i <= n; i++){
            s = s + i;
        }
        System.out.println("Average of " + n + " is " + s/n);

    }
}
