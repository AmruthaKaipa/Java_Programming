import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.next();
        int l = s.length()-1;
        String str = "";
        char ch;
        for (int i=0;i<=l;i++){
            ch = s.charAt(i);
            str = ch + str;
        }
        System.out.println(str);

    }
}
