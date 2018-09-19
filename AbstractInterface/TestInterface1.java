package AbstractInterface;

//接口，可以实现多继承，和抽象类结构相似
//接口里的数据成员必须初始化，数据成员均为常量
//接口里的方法必须是abstract的，不能有一般方法，全部都是抽象方法

interface People2{
    //全部都是赋初值的常量
    String name="老许";
    int age=20;
    String occupation="android开发工程师";

    public abstract String talk();
    //抽象方法

}

//Student2类实现自People2接口
class Student2 implements People2{

    public String talk(){
        return "学生---姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation;
    }
}

public class TestInterface1 {
    public static void main(String[] args){
        Student2 s2=new Student2();
        System.out.println(s2.talk());
    }
}
