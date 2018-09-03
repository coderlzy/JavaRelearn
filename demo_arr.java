package com.lzy;

import java.util.Arrays;

public class demo_arr {

    //一维数组的赋值
    /*public static void main(String[] args){

        int arry[]={3,5,7,9};
        int i;

        for(i=0;i<arry.length;i++){
            System.out.print("arry["+i+"]"+"="+arry[i]);
            System.out.print(" ");
        }
      }*/



        //求数组中的最大值和最小值
   /* public static void main(String[] args){

        int arry[] ={98,101,22,66,520};
        int min;
        int max;
        min=max=arry[0];

        for(int i=1;i<arry.length;i++){

            if(arry[i]<min){
                min=arry[i];
            }
            else if(arry[i]>max){
                max=arry[i];
            }

        }

        System.out.print("arry_max="+max+",");
        System.out.println("arry_min="+min);
    }*/




   //与数组有关的API方法
   //1、拷贝数组，用System.arraycopy()
    /*public static void main(String[] args){

        int a1[]={1,2,3,4,5};
        int a2[]={9,8,7,6,5,4,3};

        //System.arraycopy();
        //参数一：数组源，参数二：数组源复制的起始位置，参数三：复制到的目的数组
        //参数四：在目的数组中复制数组要放置的位置，参数五：想要复制的长度
        //注意，这个复制是覆盖的复制，会覆盖掉a2的元素

        System.arraycopy(a1,0,a2,0,4);

        System.out.print("a1的元素为：");
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.println();

        System.out.print("a2的元素为：");
        for(int j=0;j<a2.length;j++){
            System.out.print(+a2[j]+" ");
        }
    }*/



    //用sort函数对数组排序，Arrays.sort(数组名)
    /*public static void main(String[] agrs){

        int a[]={23,90,124,6,33,9};
        System.out.print("a的元素：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        Arrays.sort(a);//对数组a内的元素从小到大排序

        System.out.println();
        System.out.print("排序后a的元素：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }*/



    //二维数组的静态赋值与求和
    public static void main(String[] args){

        int a20[][]={{90,85,100},{50,99,89},{92,95,100}};


        for(int i=0;i<a20.length;i++){
            System.out.print("学生"+(i+1)+"的成绩为：");

            int sum=0;//为求每个学生的总成绩，每循环一行sum就清零

            for(int j=0;j<a20[i].length;j++){
                System.out.print(a20[i][j]+" ");
                sum+=a20[i][j];
            }
            System.out.println("此人总成绩为："+sum);
            System.out.println();

        }

    }


    //三维数组的使用方法
    /*public static void main(String[] args){
        int i,j,k,sum=0;

        int a[][][]={{{5,1},{6,7}},{{9,4},{8,3}}};

        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                for(k=0;k<a[j].length;k++){

                    System.out.println("a["+i+"["+j+"]["+k+"]="+a[i][j][k]);
                }
            }
        }
    }*/


}
