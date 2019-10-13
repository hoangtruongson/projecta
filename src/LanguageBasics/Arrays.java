package LanguageBasics;

import Classes.MyClass;

public class Arrays {
    public static void main(String[] args) {
//        MyClass myClass = new ChildClass();
//        myClass.count = 10;
        int[] positiveNums = new int[5];
        boolean[] isYesOrno;

        addArr(positiveNums);

    }

    static void addArr(int[] params){
//        params[0] = 1;
//        params[1] = 2;
//        params[2] = 1;
//        params[3] = 2;
//        params[4] = 1;

        params = new int[]{1, 2, 3, 4, 5};

//        alternatives
//        params = new int[]{1, 2, 3, 1, 5};
        System.out.println(java.util.Arrays.toString(params));
    }
}
