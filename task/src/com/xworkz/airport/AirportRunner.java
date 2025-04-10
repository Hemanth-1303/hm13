package com.xworkz.airport;

import com.xworkz.airport.internationalairport.InternationalAirport;

public class AirportRunner {
        public static void main(String[] args) {
            Airport airport = new Airport();
            airport.type();
            airport.location();
            airport.facilities();

            InternationalAirport internationalAirport = new InternationalAirport();
            internationalAirport.type();
            internationalAirport.location();
            internationalAirport.facilities();
        }
}
