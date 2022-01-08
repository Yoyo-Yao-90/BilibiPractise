public class ConstructorTest01 {
    public static void main(String[] args){

        //创建User对象
        //调用user类的构造防范来完成对象的创建
        //一下程序创建了4个对象，只要构造函数调用就会创建对象，并且一定在“堆内存”中开辟内存空间

        User u1 = new User();
        User u2 = new User(20);
        User u3 = new User("Yoyo");
        User u4 = new User(20,"Yoyo");
    }
}
