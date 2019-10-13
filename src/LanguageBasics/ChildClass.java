package LanguageBasics;

import Classes.MyClass;

public class ChildClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(10, "Son", "Phuong","Anh");
        System.out.println(myClass.count);
    }
}
