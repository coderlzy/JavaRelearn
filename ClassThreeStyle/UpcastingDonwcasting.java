package ClassThreeStyle;

//向上转型和向下转型
//向上转型自动完成，不需要强制转换但会丢失精度；向下转型需要强制类型转换

//父类对昂强制转换为子类对象的使用实例
class Person6{
    public void fun1(){
        System.out.println("1.personfun1");

    }

    public void fun2(){
        System.out.println("2.personfun2");

    }

}
class Student6 extends Person6{

    //覆写了父类的fun1
    public void fun1(){
        System.out.println("3.personfun3");
    }

    public void fun3(){
        System.out.println("4.personfun4");
    }
}

public class UpcastingDonwcasting {
    public static void main(String[] args){
        //父类对象自身实例化
       // Person6 p6=new Person6();

        //由子类去实例化父类对象
        Person6 p6=new Student6();

        Student6 s6=(Student6)p6;

        //好乱，难理解

        p6.fun1();;
        p6.fun2();

    }


}
