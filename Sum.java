import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 0;
        while (true){
            System.out.println("Enter number to be added");
            int a = input.nextInt();
            if (a == 0){
                break;
            }
            s = s + a;
        }
        System.out.println("Sum is " + s);
    }
}
