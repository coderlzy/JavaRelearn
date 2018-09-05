package ClassThreeStyle;

//继承，Java只支持单继承和多层继承，而不能多继承。（一个子类只能有一个父类)
//多层继承，B extends A,C extends B,D extends C 以此类推
//class 子类名 extends 父类名

class Person1{
    public String name;
    public int age;

}

class Student1 extends Person1{
    String address;

}

public class ExtendsDemo1 {

    public static void main(String[] args){
        Student1 s1=new Student1();
        s1.name ="littlexu";
        s1.age=29;
        s1.address="chengdu";
        System.out.println("我是 "+s1.name+" 今年 "+s1.age+" 坐标 "+s1.address);
    }

}
