package ObjectOriented;


//构造方法的私有使用例子
//构造方法私有化后，只可以自己内部类调用，外部不允许调用。但是可以在内部进行对象实例化，再定义一个外部可以调用的方法，返回实例化的对象

class Person2{
    String name;

    //Person类内部实例化
    private static final Person2 p=new Person2();

    //私有构造方法
    private Person2(){
        this.name="xiaoxu";

    }

    //返回Person类的实例化对象
    public static Person2 getP(){ //这里Person2是返回值类型！为什么返回值类型可以是类名？
                                  // 是可以的，这就是面向对象，自已定义一个类，就像其他数据类型一样用
        return p;
    }
}

public class PrivateCM {

    public static void main(String[] args){
        Person2 p2=null;//声明类的对象p2,但并没有实例化
        p2=Person2.getP();//接收实例化的对象
        System.out.println(p2.name);//Ok 咯~
    }
}
//so easy！今天还剩最后一题！加油！
