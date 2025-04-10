package com.xworkz.museum;

import com.xworkz.museum.sciencemuseum.ScienceMuseum;

public class MuseumRunner {
    public static void main(String[] args) {
        Museum museum = new Museum();
        museum.exhibits();
        museum.location();
        museum.facilities();

        ScienceMuseum scienceMuseum = new ScienceMuseum();
        scienceMuseum.exhibits();
        scienceMuseum.location();
        scienceMuseum.facilities();
    }
}
