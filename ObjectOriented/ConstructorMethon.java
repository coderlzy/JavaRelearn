package ObjectOriented;


//    //构造方法：在创建对象时自动调用
//    //1、没有返回值，2，与类名相同
//    //作用是类中属性的初始化，帮助新建的对象赋初值
//    //构造方法可以重载哦，可以添加参数，但是如果调用时是无参的，它会找不到原本的构造方法，所以可以补上一个无参的不做事构造方法

class Person1{

    private String name;
    private int age;

    //构造方法（这个可以不写，但是不写的话如果后面实例化的时候是无参的对象，就找不到它了）
   public Person1(){

   }

    //构造方法重载
    public Person1(String myname,int myage){
        this.name=myname;
        this.age=myage;
    }

    //两种方法都可以输出
    //这种是有返回值的，用return来接受返回值，值直接传入主函数中输出的东西中
    /*public String talk(){
        return "my name is "+this.name+" , my age is "+this.age;
    }*/

    //这种方法是没有返回值的，所以在方法中做了输出这个操作，主函数中直接调用方法即可！耶~开心
    void talk(){
        System.out.println("my name is "+this.name+" , my age is "+this.age);
    }
}

public class ConstructorMethon {

    public static void main(String[] args){

        //Person1 p = new Person1("XIAOXU",25);
        Person1 p = new Person1();

        //System.out.println(p.talk());
        p.talk();
    }


}
