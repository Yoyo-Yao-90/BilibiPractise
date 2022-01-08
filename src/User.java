public class User {
    //constructor
    public User(){
        System.out.println("User's Default Constructor Invoke");
    }
    //constructor with argument
    public User (int i){
        System.out.println("with int argument");
    }

    public User (String name){
        System.out.println("with String argument");
    }

    public  User( int i, String name){
        System.out.println("with String int arguments");
    }

    public  static void main(String[] args){
        int no;
        String name;
        String addr;
        String zipCode;
    }

}
