import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0;
        int even=0;
        int odd=0;
        while (true){
            System.out.println("Enter an integer");
            int a = input.nextInt();
            if (a == 0) {
                break;
            }
            else{
                if (a<0){
                    n++;
                }
                else {
                    if (a%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
                }

            }
        System.out.println("Number of negative numbers are "+ n);
        System.out.println("Number of positive even numbers are "+even);
        System.out.println("Number of positive odd numbers are "+odd);
        }
    }
