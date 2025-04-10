package com.xworkz.cinema;

import com.xworkz.cinema.imaxcinemas.IMAXCinemas;

public class CinemaRunner {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.movies();
        cinema.location();
        cinema.facilities();

        IMAXCinemas imaxCinema = new IMAXCinemas();
        imaxCinema.movies();
        imaxCinema.location();
        imaxCinema.facilities();
    }
}
