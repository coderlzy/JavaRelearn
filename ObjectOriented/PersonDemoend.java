package ObjectOriented;

//最后一题，在内部类调用方法
//增加一个共有的方法say(),用这个方法去调用私有的talk()

class Person3{ //这里有个问题，同一个package里面，居然不可以有同样的类名？！所以Person后面标号了

    private String name;
    private int age;

    private void talk(){
        System.out.println("my name is "+this.name+" , my age is "+this.age);
    }

    public void say(){
        this.talk();

    }

    public void setName(String n){
        this.name=n;

    }

    public void setAge(int a){
        this.age=a;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}

public class PersonDemoend {

    public static void main(String[] args){

        Person3 p3 =new Person3();
         p3.setName("xiaoxubaobao");
         p3.setAge(30);

         p3.say();
    }


}
