import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
        int temp;
        boolean isPrime=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=scan.nextInt();
        for(int i=2; i<=num/2; i++){
            temp = num%i;
            if(temp==0){
                isPrime=false;
                break;
        /*     while loop
        int i=2;
        while(i<= num/2)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
            i++;
        }
        */
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

    }
}
// Prime while loop link  https://beginnersbook.com/2014/01/java-program-to-check-prime-number/
