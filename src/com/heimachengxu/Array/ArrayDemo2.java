package com.heimachengxu.Array;

public class ArrayDemo2 {

    /*
    整数的16进制转换
     */
    public static void main(String[] args) {
        int x = 60;
        toHex(x);

    }

    public static void toHex(int num){
        char[] chs = {'1','2','3','4',
                '5','6','7','8',
                '9','A','B','C',
                'D','E','F'};

        char[] arr = new char[8];
        int pos = arr.length;
        while(num!=0){
            int x = num & 15;
            arr[--pos] = chs[x-1];
            num = num >>> 4;
        }
        for(int i = pos;i < arr.length;i++)
            System.out.print(arr[i]);

    }

}
