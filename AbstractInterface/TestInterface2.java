package AbstractInterface;

interface A{
    int a=100;
    public void talka();
}

interface B{
    int b=200;
    public void talkb();
}

//接口可以多继承接口
interface C extends A,B{
    int c=300;
    public void talkc();

    }

    //E实现了C接口，而C继承了A,B,所以在E中要覆写ABC中的全部抽象方法
     //少一个都不行哦！
class E implements C{
    //覆写A的方法
    public void talka(){
        System.out.println("a="+a);
    }
    //覆写B的方法
    public void talkb(){
        System.out.println("b="+b);

    }
    //覆写C的方法
    public void talkc(){
        System.out.println("c="+c);
    }

}


class TestInterface2 {

    public static void main(String[] args){
        E e =new E();
        e.talka();
        e.talkb();
        e.talkc();
    }
}
