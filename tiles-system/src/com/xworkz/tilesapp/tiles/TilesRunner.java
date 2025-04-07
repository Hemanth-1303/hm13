package com.xworkz.tilesapp.tiles;

public class TilesRunner {
        public static void main(String[] args) {
            Tiles tile1 = new Tiles();
            tile1.setMaterial("Ceramic");
            tile1.setColor("White");
            tile1.setFinishType("Glossy");
            tile1.setPricePerSquareFoot(50.0);
            tile1.setSize(12.0);
            tile1.setBrand("Johnson Tiles");
            tile1.setApplication("Bathroom Walls");

            System.out.println("Tiles Details:");
            System.out.println("The tile material is " + tile1.getMaterial());
            System.out.println("The tile color is " + tile1.getColor());
            System.out.println("The tile finish type is " + tile1.getFinishType());
            System.out.println("The tile price per square foot is " + tile1.getPricePerSquareFoot());
            System.out.println("The tile size is " + tile1.getSize() + " inches");
            System.out.println("The tile brand is " + tile1.getBrand());
            System.out.println("The tile application is " + tile1.getApplication());

            Tiles tile2 = new Tiles();
            tile2.setMaterial("Porcelain");
            tile2.setColor("Beige");
            tile2.setFinishType("Matte");
            tile2.setPricePerSquareFoot(70.0);
            tile2.setSize(24.0);
            tile2.setBrand("Kajaria Tiles");
            tile2.setApplication("Living Room Flooring");

            System.out.println("\nTiles Details:");
            System.out.println("The tile material is " + tile2.getMaterial());
            System.out.println("The tile color is " + tile2.getColor());
            System.out.println("The tile finish type is " + tile2.getFinishType());
            System.out.println("The tile price per square foot is " + tile2.getPricePerSquareFoot());
            System.out.println("The tile size is " + tile2.getSize() + " inches");
            System.out.println("The tile brand is " + tile2.getBrand());
            System.out.println("The tile application is " + tile2.getApplication());

            Tiles tile3 = new Tiles();
            tile3.setMaterial("Marble");
            tile3.setColor("Gray");
            tile3.setFinishType("Polished");
            tile3.setPricePerSquareFoot(150.0);
            tile3.setSize(18.0);
            tile3.setBrand("Somany Tiles");
            tile3.setApplication("Kitchen Countertops");

            System.out.println("\nTiles Details:");
            System.out.println("The tile material is " + tile3.getMaterial());
            System.out.println("The tile color is " + tile3.getColor());
            System.out.println("The tile finish type is " + tile3.getFinishType());
            System.out.println("The tile price per square foot is " + tile3.getPricePerSquareFoot());
            System.out.println("The tile size is " + tile3.getSize() + " inches");
            System.out.println("The tile brand is " + tile3.getBrand());
            System.out.println("The tile application is " + tile3.getApplication());

            Tiles tile4 = new Tiles();
            tile4.setMaterial("Granite");
            tile4.setColor("Black");
            tile4.setFinishType("Flamed");
            tile4.setPricePerSquareFoot(200.0);
            tile4.setSize(24.0);
            tile4.setBrand("Nitco Tiles");
            tile4.setApplication("Outdoor Pathways");

            System.out.println("\nTiles Details:");
            System.out.println("The tile material is " + tile4.getMaterial());
            System.out.println("The tile color is " + tile4.getColor());
            System.out.println("The tile finish type is " + tile4.getFinishType());
            System.out.println("The tile price per square foot is " + tile4.getPricePerSquareFoot());
            System.out.println("The tile size is " + tile4.getSize() + " inches");
            System.out.println("The tile brand is " + tile4.getBrand());
            System.out.println("The tile application is " + tile4.getApplication());

            Tiles tile5 = new Tiles();
            tile5.setMaterial("Glass");
            tile5.setColor("Blue");
            tile5.setFinishType("Glossy");
            tile5.setPricePerSquareFoot(120.0);
            tile5.setSize(6.0);
            tile5.setBrand("Orient Bell Tiles");
            tile5.setApplication("Swimming Pool Walls");

            System.out.println("\nTiles Details:");
            System.out.println("The tile material is " + tile5.getMaterial());
            System.out.println("The tile color is " + tile5.getColor());
            System.out.println("The tile finish type is " + tile5.getFinishType());
            System.out.println("The tile price per square foot is " + tile5.getPricePerSquareFoot());
            System.out.println("The tile size is " + tile5.getSize() + " inches");
            System.out.println("The tile brand is " + tile5.getBrand());
            System.out.println("The tile application is " + tile5.getApplication());
        }
    }

