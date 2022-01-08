public class RecursionTest04 {
    public static void main(String [] args){
        int n = 5;
        int retValue = method(n);
        System.out.println(retValue);//120= 5*4*3*2*1
    }

    public static int method(int n){
/*        int result = 1;
        for( int i=n; i>0; i--){
            result*= i;
        }
        return result;*/


        if(n==1){
            return 1;

        }return n* method(n-1);
    }
}
