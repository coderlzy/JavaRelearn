package ClassThreeStyle;

//super关键字的使用
//super（）是隐藏在子类构造方法中的函数，（也可以在子类的其他地方），作用是调用父类中的属性和方法
class Person3{

    String name;
    int age;

    public Person3(String n,int a){
        this.name=n;
        this.age=a;

    }
}

class Student3 extends Person3{

    String school;

    public Student3(){
        super("xiaoxu",25);//super调用父类中的构造方法

    }


}

public class SuperTest {

    public static void main(String[] args){
        Student3  s3=new Student3();
        s3.school = "tianjin";
        System.out.println("name="+s3.name+" age="+s3.age+" school="+s3.school);
    }
}
