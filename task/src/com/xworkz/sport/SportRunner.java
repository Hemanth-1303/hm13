package com.xworkz.sport;

import com.xworkz.sport.cricket.Cricket;

public class SportRunner {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.name();
        cricket.teamSize();
        cricket.equipment();

        Sport sport = new Sport();
        sport.name();
        sport.teamSize();
        sport.equipment();
    }
}
