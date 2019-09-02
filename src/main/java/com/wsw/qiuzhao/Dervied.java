package com.wsw.qiuzhao;

/**
 * Created by wsw on 2019/9/2 10:21
 */
public class Dervied extends Base{
    private String string = "qwe";

    public Dervied(){
        tellName();
        printName();
    }

    public void  tellName(){
        System.out.println("Dervied tell name: " + string);
    }

    public void  printName(){
        System.out.println("Dervied print name: " + string);
    }

    public static void main(String[] args) {
        new Dervied();
    }
}

class Base {
    private String string = "wsw";

    Base(){
        tellName();
        printName();
    }

    public void  tellName(){
        System.out.println("Base tell name: " + string);
    }

    public void  printName(){
        System.out.println("Base print name: " + string);
    }
}
