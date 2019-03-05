package com.cr.factory;

public class Client {

    public static void main(String[] args) {
        CigaretteFactory factory = new LiqunCigaretteFactory();
        Cigarette cigarette = factory.getCigarette();
        cigarette.smoke();
    }

}
