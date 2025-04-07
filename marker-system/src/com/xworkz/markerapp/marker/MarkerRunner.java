package com.xworkz.markerapp.marker;

public class MarkerRunner {
        public static void main(String[] args) {
            Marker marker1 = new Marker();
            marker1.setColor("Black");
            marker1.setType("Whiteboard Marker");
            marker1.setPrice(50.0);
            marker1.setBrand("Camlin");
            marker1.setLength(12.5);
            marker1.setTipSize(1.0);
            marker1.setIsPermanent(false);

            System.out.println("Marker Details:");
            System.out.println("The marker color is " + marker1.getColor());
            System.out.println("The marker type is " + marker1.getType());
            System.out.println("The marker price is " + marker1.getPrice());
            System.out.println("The marker brand is " + marker1.getBrand());
            System.out.println("The marker length is " + marker1.getLength() + " cm");
            System.out.println("The marker tip size is " + marker1.getTipSize() + " mm");
            System.out.println("The marker is permanent " + marker1.getIsPermanent());

            Marker marker2 = new Marker();
            marker2.setColor("Blue");
            marker2.setType("Permanent Marker");
            marker2.setPrice(60.0);
            marker2.setBrand("Faber-Castell");
            marker2.setLength(13.0);
            marker2.setTipSize(0.8);
            marker2.setIsPermanent(true);

            System.out.println("\nMarker Details:");
            System.out.println("The marker color is " + marker2.getColor());
            System.out.println("The marker type is " + marker2.getType());
            System.out.println("The marker price is " + marker2.getPrice());
            System.out.println("The marker brand is " + marker2.getBrand());
            System.out.println("The marker length is " + marker2.getLength() + " cm");
            System.out.println("The marker tip size is " + marker2.getTipSize() + " mm");
            System.out.println("The marker is permanent " + marker2.getIsPermanent());

            Marker marker3 = new Marker();
            marker3.setColor("Red");
            marker3.setType("Sketch Marker");
            marker3.setPrice(40.0);
            marker3.setBrand("Staedtler");
            marker3.setLength(14.0);
            marker3.setTipSize(0.5);
            marker3.setIsPermanent(false);

            System.out.println("\nMarker Details:");
            System.out.println("The marker color is " + marker3.getColor());
            System.out.println("The marker type is " + marker3.getType());
            System.out.println("The marker price is " + marker3.getPrice());
            System.out.println("The marker brand is " + marker3.getBrand());
            System.out.println("The marker length is " + marker3.getLength() + " cm");
            System.out.println("The marker tip size is " + marker3.getTipSize() + " mm");
            System.out.println("The marker is permanent " + marker3.getIsPermanent());

            Marker marker4 = new Marker();
            marker4.setColor("Green");
            marker4.setType("Gel Marker");
            marker4.setPrice(70.0);
            marker4.setBrand("Sharpie");
            marker4.setLength(12.0);
            marker4.setTipSize(1.2);
            marker4.setIsPermanent(true);

            System.out.println("\nMarker Details:");
            System.out.println("The marker color is " + marker4.getColor());
            System.out.println("The marker type is " + marker4.getType());
            System.out.println("The marker price is " + marker4.getPrice());
            System.out.println("The marker brand is " + marker4.getBrand());
            System.out.println("The marker length is " + marker4.getLength() + " cm");
            System.out.println("The marker tip size is " + marker4.getTipSize() + " mm");
            System.out.println("The marker is permanent " + marker4.getIsPermanent());

            Marker marker5 = new Marker();
            marker5.setColor("Yellow");
            marker5.setType("Highlighter");
            marker5.setPrice(30.0);
            marker5.setBrand("Luxor");
            marker5.setLength(11.0);
            marker5.setTipSize(0.4);
            marker5.setIsPermanent(false);

            System.out.println("\nMarker Details:");
            System.out.println("The marker color is " + marker5.getColor());
            System.out.println("The marker type is " + marker5.getType());
            System.out.println("The marker price is " + marker5.getPrice());
            System.out.println("The marker brand is " + marker5.getBrand());
            System.out.println("The marker length is " + marker5.getLength() + " cm");
            System.out.println("The marker tip size is " + marker5.getTipSize() + " mm");
            System.out.println("The marker is permanent " + marker5.getIsPermanent());
        }
    }


