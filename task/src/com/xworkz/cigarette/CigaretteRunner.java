package com.xworkz.cigarette;

import com.xworkz.cigarette.mentholcigarette.MentholCigarette;

public class CigaretteRunner {
    public static void main(String[] args) {
        MentholCigarette mentholCigarette = new MentholCigarette();
        mentholCigarette.brand();
        mentholCigarette.composition();
        mentholCigarette.packaging();

        Cigarette cigarette = new Cigarette();
        cigarette.brand();
        cigarette.composition();
        cigarette.packaging();
    }
}
