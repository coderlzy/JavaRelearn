package ClassThreeStyle;

//super调用父类的属性和方法

class Person2{
     String name;
     int age;

    //注意，这个构造函数应该为空
   /* public Person2(String n,int a){
        this.name=n;
        this.age=a;
    }*/

   public Person2(){

   }

    public String talk(){
        return "my name is "+ this.name+" my age is "+this.age;

    }
}

class Student2 extends Person2 {
    String school;

    public Student2(String nn, int aa, String ss) {
        super.name = nn;
        super.age = aa;
        this.school = ss;
        System.out.print(super.talk());

    }

}

public class SuperTest2 {
    public static void main(String[] args){
        Student2 s2=new Student2("小许",22,"北京");
        System.out.println(" city is "+s2.school);
    }

}
