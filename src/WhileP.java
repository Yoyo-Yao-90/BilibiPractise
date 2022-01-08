public class WhileP {
    public static void main(String[] args){
        int i =1;
        while(i <=10){
            System.out.println(i);
            i++;
        }
        System.out.println("end-->"+i); //11
        System.out.println("----------------");

        int j = 10;
        while(j>0){
            System.out.println(j--);//10 9 8 7 6 5 4 3 2 1
            System.out.println("-->" + j); //9 8 7 6 5 4 3 2 1 0
        }
        System.out.println("end j--->"+ j); //0
        System.out.println("----------------");

        int k= 10;
        while(k>=0){
            System.out.println(--k); //9 8 7 6 5 4 3 2 1 0 -1
            System.out.println("end--->"+k);//9 8 7 6 5 4 3 2 1 0 -1
        }
    }
}
