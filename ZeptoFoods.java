class ZeptoFoods {
    public static double searchItems(String itemsName) {
        double termPrice = 0.0;

        if (itemsName == "Chicken Biryani") {
            termPrice = 220.00;
            return termPrice;
        } else if (itemsName == "Veg Biryani") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Butter Chicken") {
            termPrice = 299.00;
            return termPrice;
        } else if (itemsName == "Paneer Butter Masala") {
            termPrice = 249.00;
            return termPrice;
        } else if (itemsName == "Mutton Rogan Josh") {
            termPrice = 320.00;
            return termPrice;
        } else if (itemsName == "Chole Bhature") {
            termPrice = 160.00;
            return termPrice;
        } else if (itemsName == "Aloo Gobi") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Dal Tadka") {
            termPrice = 150.00;
            return termPrice;
        } else if (itemsName == "Kadhai Paneer") {
            termPrice = 220.00;
            return termPrice;
        } else if (itemsName == "Tandoori Chicken") {
            termPrice = 250.00;
            return termPrice;

        } else if (itemsName == "Garlic Naan") {
            termPrice = 45.00;
            return termPrice;
        } else if (itemsName == "Plain Naan") {
            termPrice = 30.00;
            return termPrice;
        } else if (itemsName == "Roti") {
            termPrice = 25.00;
            return termPrice;
        } else if (itemsName == "Pulao Rice") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Jeera Rice") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Raita") {
            termPrice = 40.00;
            return termPrice;
        } else if (itemsName == "Papad") {
            termPrice = 20.00;
            return termPrice;

        } else if (itemsName == "Samosa") {
            termPrice = 30.00;
            return termPrice;
        } else if (itemsName == "Pani Puri") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Veg Pakora") {
            termPrice = 80.00;
            return termPrice;
        } else if (itemsName == "Onion Rings") {
            termPrice = 70.00;
            return termPrice;
        } else if (itemsName == "Spring Rolls") {
            termPrice = 100.00;
            return termPrice;
        } else if (itemsName == "Aloo Tikki") {
            termPrice = 40.00;
            return termPrice;

        } else if (itemsName == "Coke") {
            termPrice = 40.00;
            return termPrice;
        } else if (itemsName == "Pepsi") {
            termPrice = 40.00;
            return termPrice;
        } else if (itemsName == "Sprite") {
            termPrice = 40.00;
            return termPrice;
        } else if (itemsName == "Lemonade") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Mint Mojito") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "Cold Coffee") {
            termPrice = 100.00;
            return termPrice;
        } else if (itemsName == "Hot Coffee") {
            termPrice = 90.00;
            return termPrice;

        } else if (itemsName == "Gulab Jamun") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Ice Cream") {
            termPrice = 80.00;
            return termPrice;
        } else if (itemsName == "Rasgulla") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Chocolate Brownie") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Kheer") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "Caramel Pudding") {
            termPrice = 100.00;
            return termPrice;
        
        // Miscellaneous
        } else if (itemsName == "Vegetable Cutlet") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Masala Papad") {
            termPrice = 25.00;
            return termPrice;
        } else if (itemsName == "Chana Chaat") {
            termPrice = 70.00;
            return termPrice;
        } else if (itemsName == "French Fries") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Garlic Bread") {
            termPrice = 75.00;
            return termPrice;

        } else if (itemsName == "Tikka Masala") {
            termPrice = 260.00;
            return termPrice;
        } else if (itemsName == "Veg Hakka Noodles") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Chicken Hakka Noodles") {
            termPrice = 150.00;
            return termPrice;
        } else if (itemsName == "Fried Rice") {
            termPrice = 130.00;
            return termPrice;
        } else if (itemsName == "Chana Masala") {
            termPrice = 110.00;
            return termPrice;
        } else {
            System.out.println(itemsName + " is not found on the menu.");
        }

        return termPrice;
    }
}
