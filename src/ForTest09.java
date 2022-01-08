import java.util.Scanner;

public class ForTest09 {
    public static void main(String[] args) {
        //determine whether is Prime
/*        Scanner scan = new Scanner(System.in);
        System.out.println("enter any prime: ");
        int i = scan.nextInt();
        boolean isSuShu = true; // assue is true
        for(int j=2; j<i; j++){
            if(i%j == 0){
                isSuShu = false;
                break;
            }
        }   System.out.println(isSuShu ? i+" is Prime": i + "is not a Prime");
        */
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            boolean isSuShu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSuShu = false;
                    break;
                }
            }
            //System.out.println(isSuShu ? i + " is Prime" : i + " is not a Prime");
            if(isSuShu){
                System.out.print(i+" ");
                count++;
                if(count % 8 ==0){  // 8 number in one line
                    System.out.println();
                }
            }
        }
    }
}
