package com.heimachengxu.Array;

import static sun.misc.Version.println;

public class ArrayDemo2 {

    /*
    整数的16进制转换
     */
    public static void main(String[] args) {

        int x = 60;
        toHex(x);
        toBirnary(-6);
        toOctal(10);

    }

    public static void toBirnary(int num){

        tran(num,1,1);
    }

    public static void toOctal(int num){

       tran(num,7,3);
    }

    public static void toHex(int num){


        tran(num,15,4);

    }

    public static void tran(int num,int base,int offset){

        if(num == 0){
            System.out.print("0");
            return ;
        }

        char[] chs = {'0','1','2','3','4',
                '5','6','7','8',
                '9','A','B','C',
                'D','E','F'};

        char[] arr = new char[32];
        int pos = arr.length;

        while(num!=0){
            int re = num & base;
            arr[--pos] = chs[re];
            num = num >>> offset;
        }
        for(int i = pos;i < arr.length;i++)
            System.out.print(arr[i]);
        System.out.println();
    }

}
