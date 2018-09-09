package ClassThreeStyle;

//覆写，子类中的方法和父类的方法名称、参数个数，类型相同
//当子类对象在调用这个方法时，其实是调用了子类覆写好的方法

class Person5{
    String name;
    int age;

    public String talk(){

        return "我是 "+this.name+",年龄 "+this.age;
    }
}

class Student5 extends Person5{
    String school;

    public Student5(String n,int a,String s){
        super.name=n;
        super.age=a;
        this.school=s;
    }


    @Override
    public String talk() {
        //通过super.方法来调用父类中被子类覆写的方法！
        return super.talk()+",学校 "+this.school;
    }

}

public class OverTest1 {

    public static void main(String[] args){
        Student5 s5=new Student5("小许",22,"北大");
        System.out.println(s5.talk());
    }
}
