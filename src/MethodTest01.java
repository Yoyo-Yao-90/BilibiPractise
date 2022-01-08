public class MethodTest01 {


    public static void sum(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));

        MethodTest01.doSome();
    }


    public static void main(String [] args){

        MethodTest01.sum(1,2);
        System.out.println("Hello World!");
    }

    public static void doSome(){
        System.out.println("do some!");
    }
}
