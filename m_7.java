import java.util.Scanner;

public class m_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2  numbers to find primes between them");
        int a = input.nextInt();
        int b = input.nextInt();
        int prime[] = get_prime(a,b);
        System.out.println("Possible prime numbers are");
        for(int i=0;i<prime.length;i++){
            if(prime[i]!=0)
                System.out.println(prime[i]);
        }
    }
    static int[] get_prime(int a,int b){
        int prime[]=new int[b-a+1];
        int index=0;
        for(int i=a;i<=b;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c =c+1;
            }
            if(c==2){
                prime[index]=i;
                index++;
            }

        }
        return prime;
    }
}
