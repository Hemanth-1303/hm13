package com.xworkz.matchbox;

import com.xworkz.matchbox.safetymatchbox.SafetyMatchbox;

public class MatchboxRunner {
    public static void main(String[] args) {
        SafetyMatchbox safetyMatchbox = new SafetyMatchbox();
        safetyMatchbox.size();
        safetyMatchbox.material();
        safetyMatchbox.usage();

        Matchbox matchbox = new Matchbox();
        matchbox.size();
        matchbox.material();
        matchbox.usage();
    }
}
