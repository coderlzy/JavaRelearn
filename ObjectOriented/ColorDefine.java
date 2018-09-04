package ObjectOriented;

public class ColorDefine {

    String color="black";
    void getMes(){

        System.out.println("定义类");

    }

    public static void main(String[] args){

        ColorDefine c=new ColorDefine();
        System.out.println(c.color);
        c.getMes();
    }
}
