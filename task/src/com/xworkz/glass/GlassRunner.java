package com.xworkz.glass;

import com.xworkz.glass.decorativeglass.DecorativeGlass;

public class GlassRunner {
    public static void main(String[] args) {
        DecorativeGlass decorativeGlass = new DecorativeGlass();
        decorativeGlass.type();
        decorativeGlass.material();
        decorativeGlass.usage();

        Glass glass = new Glass();
        glass.type();
        glass.material();
        glass.usage();
    }
}
