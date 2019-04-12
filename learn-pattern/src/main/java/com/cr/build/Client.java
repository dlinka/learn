package com.cr.build;

public class Client {

    public static void main(String[] args) {
        Builder builder = new LenovoBuilder();
        Director director = new Director(builder);
        Computer computer = director.construct("联想Cpu", "联想Monitor");
        System.out.println(computer);
    }

}
