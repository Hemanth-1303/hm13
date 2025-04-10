package com.xworkz.machine;

import com.xworkz.machine.industrialmachine.IndustrialMachine;

public class MachineRunner {
    public static void main(String[] args) {
        IndustrialMachine industrialMachine = new IndustrialMachine();
        industrialMachine.brand();
        industrialMachine.type();
        industrialMachine.functionality();

        Machine machine = new Machine();
        machine.brand();
        machine.type();
        machine.functionality();
    }
}
