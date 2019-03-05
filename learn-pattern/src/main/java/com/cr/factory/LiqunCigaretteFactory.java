package com.cr.factory;

public class LiqunCigaretteFactory implements CigaretteFactory {

    @Override
    public Cigarette getCigarette() {
        return new LiqunCigarette();
    }

}
