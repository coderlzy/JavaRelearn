package ObjectOriented;


//这个要好好理解！！！

//人这个类
class Person{
    String name;//属性
    int age;

    //方法（传入姓名和年龄两个参数）
    public Person(String myname,int myage){
        this.name=myname;
        this.age=myage;
    }

    //方法（把姓名年龄打印出来）
    public String talk(){

        return "我是："+this.name+",我的年龄："+this.age+"岁";
    }

}

public class TestObjectArray {

    public static void main(String[] args){
        //用静态方法初始化对象数组
        Person p[]={new Person("xiaoXu",25),new Person("DALI",22),new Person( "CHUNYU",30)};
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].talk());
        }
    }


}
