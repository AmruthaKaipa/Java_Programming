import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = 0;
        while (true){
            System.out.println("Enter number to be added");
            int a = input.nextInt();
            if (a == 0){
                break;
            }
            if (a > l){
                l = a;
            }
        }
        System.out.println("Largest number entered is " + l);
    }
}
