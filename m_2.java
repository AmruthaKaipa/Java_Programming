import java.util.Scanner;

public class m_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of a person to check if he is eligible to vote");
        int v = input.nextInt();
        vote(v);
    }
    static void vote(int v){
        if(v >= 18)
            System.out.println("is eligible to vote");
        else
            System.out.println("is not eligible to vote");
    }
}
