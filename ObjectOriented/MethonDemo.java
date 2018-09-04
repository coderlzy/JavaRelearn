package ObjectOriented;

public class MethonDemo {

    int a=1998;
    double b=2008.8;

    public void times(int aa,double bb){
        System.out.println(aa*bb);
    }

    public static void main(String[] args){
        MethonDemo m=new MethonDemo();
        m.times(m.a,m.b);
    }

}
