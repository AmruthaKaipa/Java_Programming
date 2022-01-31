import java.util.Scanner;

public class lcm_gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int temp1 = a;
        int temp2 = b;
        int temp;
        while (temp2!=0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        int hcf = temp1;
        System.out.println("hcf is "+ hcf);
        System.out.println("lcm is "+ a*b/hcf);
    }
}
