public class BreakP {
    public static void main(String[] args){
        for( int i=0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println("i--> "+i);//0 1 2 3 4
        }
        System.out.println("Hello World");

        for( int j=0; j<3; j++) {
            for(int i=0; i<10;i++) {
                if (i == 5) {
                    break;
                }
                System.out.println("i--> " + i);
            }
        }
    }
}
