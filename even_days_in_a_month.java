import java.util.Scanner;

public class even_days_in_a_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 1-jan,2-feb,3-mar,4-april,5-may,6-june,7-july,8-aug,9-sep,10-oct" +
                "11-nov,12-dec");
        int n = input.nextInt();
        int d = 0;
        int c = 0;
        switch (n){
            case 1,3,5,7,8,10,12:{
                d = 31;
                break;
            }
            case 4,9,11:{
                d = 30;
                break;
            }
            case 2:{
                d = 28;
                break;
            }
            default:
                System.out.println("Enter a valid month");

        }
        for (int i = 1;i <= d; i++){
            if (i % 2 == 0){
                c++;
            }
        }
        System.out.println("Number of even number of days are "+ c);
    }
}
