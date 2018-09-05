package ClassThreeStyle;

class Person4{

    private String name;
    private int age;

    void talk(){
        System.out.println("我是："+name+",年龄："+age);
    }

    public void setName(String n){
        this.name=n;
    }

    public void setAge(int a){
        if(a>0&a<120) {
            this.age = a;
        }
    }

    public String getName(){
        return name;

    }

    public int getAge(){
        return age;
    }
}
public class testPersonDemo {

    public static void main(String[] args){
        Person4 p4=new Person4();

        p4.setName("老许");
        p4.setAge(-22);

        p4.talk();
    }
}
