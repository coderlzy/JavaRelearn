package AbstractInterface;

abstract class People1{
    String name;
    int age;
    String occupation;

    public People1(String n,int a,String o){
        this.name=n;
        this.age=a;
        this.occupation=o;
    }

    //抽象方法talk();
    public abstract String talk();

}

class Student1 extends People1 {

    public Student1(String n,int a,String o){

        super(n,a,o);//明确调用抽象类中的构造方法，这句不是很理解！

    }

    public String talk(){
        return "学生---姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation+"!";
    }
}



public class TestAbstract2 {

    public static void main(String[] args){
        Student1 s1=new Student1("laoxu",22,"php");
        System.out.println(s1.talk());
    }
}
