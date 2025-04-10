package com.xworkz.dress;

import com.xworkz.dress.partydress.PartyDress;

public class DressRunner {
    public static void main(String args[]){
        PartyDress partyDress = new PartyDress();
        partyDress.material();
        partyDress.occasion();
        partyDress.size();

        Dress dress = new Dress();
        dress.material();
        dress.occasion();
        dress.size();
    }

}
