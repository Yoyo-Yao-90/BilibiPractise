public class OOTest01 {
    public static void main(String [] args){
        int i = 10;
        Student s = new Student();

        int stuNo = s.no;
        String stuName = s.name;
        int stuAge = s.age;
        boolean stuSex =s.sex;
        String stuAddr = s.addr;

/*        System.out.println("student No. = " + stuNo); //0
        System.out.println("Name = " + stuName);//null
        System.out.println("Age = " + stuAge);//0
        System.out.println("Sex = " + stuSex);//false
        System.out.println("Address = "+ stuAddr);//null*/

        //2nd way
        System.out.println("student No. = " + s.no); //0
        System.out.println("Name = " + s.name);//null
        System.out.println("Age = " + s.age);//0
        System.out.println("Sex = " + s.sex);//false
        System.out.println("Address = "+ s.addr);//null

        s.no = 10;
        s.name = "jack";
        s.age = 20;
        s.sex = true;
        s.addr = "Barrie";


        System.out.println("student No. = " + s.no); //0
        System.out.println("Name = " + s.name);//null
        System.out.println("Age = " + s.age);//0
        System.out.println("Sex = " + s.sex);//false
        System.out.println("Address = "+ s.addr);//null
    }
}

