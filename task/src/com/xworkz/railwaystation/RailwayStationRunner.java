package com.xworkz.railwaystation;

import com.xworkz.railwaystation.terminalstation.TerminalStation;

public class RailwayStationRunner {
    public static void main(String[] args) {
        RailwayStation station = new RailwayStation();
        station.type();
        station.location();
        station.facilities();

        TerminalStation terminalStation = new TerminalStation();
        terminalStation.type();
        terminalStation.location();
        terminalStation.facilities();
    }
}
