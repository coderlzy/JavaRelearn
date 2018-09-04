package ObjectOriented;

public class TestEquals {

    //对象之间的比较
    //"==" (比较的是内存地址值)and "equals()"（比较的是内容）

    public static void main(String[] args){

        String str1=new String("java");//str1和str2指向不同的内存空间
        String str2=new String("java");
        String str3=str2;//把str2的引用赋给str3,相当于str3也指向了str2的引用

        if(str1==str2){
            System.out.println("str1=str2");

        }
        else{

            System.out.println("str1!=str2");
        }

        if(str3==str2){

            System.out.println("str3=str2");

        }
        else{
            System.out.println("str3!=str2");
        }

        if(str1.equals(str2)){
            System.out.println("str1=str2");

        }

        if(str3.equals(str2)){
            System.out.println("str3=str2");
        }
    }


}
