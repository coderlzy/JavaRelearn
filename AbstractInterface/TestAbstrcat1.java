package AbstractInterface;

//抽象类
//1、只声明而未实现，含抽象方法，子类必须要覆写所有的抽象方法才能被实例化

abstract  class People{
    String name;
    int age;
    String occupation;

    //声明抽象方法talk();
    public abstract String talk();

}

class Student extends People{

    public Student(String n,int a,String o){
        this.name=n;
        this.age=a;
        this.occupation=o;
    }
    //覆写抽象方法talk（）
    public String talk(){
        return "学生---姓名："+this.name+",年龄："+this.age+",职业："+this.occupation;
    }
}

class Worker extends People{

    public Worker(String n,int a,String o){
        this.name=n;
        this.age=a;
        this.occupation=o;

    }

    public String talk(){
        return "工人---姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation;
    }
}
public class TestAbstrcat1 {

    public static void main(String[] args){
        Student s=new Student("原子",23,"java工程师");
        Worker w =new Worker("老许",39,"家政");
        System.out.println(s.talk());
        System.out.println(w.talk());
    }
}
