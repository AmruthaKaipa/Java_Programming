import java.util.Scanner;

public class m_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks out of 100 to display grades");
        int m = input.nextInt();
        String g = grade(m);
        System.out.println(g);
    }
    static String grade(int m){
        if(m>=91 & m<=100)
            return "AA";
        else if(m>=81 & m<=90)
            return "AB";
        else if(m>=71 & m<=80)
            return "BB";
        else if(m>=61 & m<=70)
            return "BC";
        else if(m>=51 & m<=60)
            return "CD";
        else if(m>=41 & m<=50)
            return "DD";
        else
            return "FAIL";
    }
}
