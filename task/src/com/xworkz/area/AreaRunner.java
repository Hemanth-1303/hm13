package com.xworkz.area;

import com.xworkz.area.residentialarea.ResidentialArea;

public class AreaRunner {
    public static void main(String[] args) {
        ResidentialArea residentialArea = new ResidentialArea();
        residentialArea.name();
        residentialArea.type();
        residentialArea.populationDensity();

        Area area = new Area();
        area.name();
        area.type();
        area.populationDensity();
    }
}
