class FoodPanda {
    public static double searchItems(String itemsName) {
        double termPrice = 0.0;
        if (itemsName == "Chicken Pizza") {
            termPrice = 350.00;
            return termPrice;
        } else if (itemsName == "Veg Pizza") {
            termPrice = 300.00;
            return termPrice;
        } else if (itemsName == "Margarita Pizza") {
            termPrice = 250.00;
            return termPrice;
        } else if (itemsName == "Pepperoni Pizza") {
            termPrice = 380.00;
            return termPrice;
        } else if (itemsName == "Cheese Burst Pizza") {
            termPrice = 400.00;
            return termPrice;
        } else if (itemsName == "Paneer Tikka") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Chicken Tikka") {
            termPrice = 220.00;
            return termPrice;
        } else if (itemsName == "Fish Fry") {
            termPrice = 250.00;
            return termPrice;
        } else if (itemsName == "Hakka Noodles") {
            termPrice = 160.00;
            return termPrice;
        } else if (itemsName == "Veg Fried Rice") {
            termPrice = 150.00;
            return termPrice;
        } else if (itemsName == "Chicken Fried Rice") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Chole Bhature") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Aloo Paratha") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Gulab Jamun") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Rasgulla") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Chocolate Cake") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Vanilla Ice Cream") {
            termPrice = 80.00;
            return termPrice;
        } else if (itemsName == "Strawberry Ice Cream") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "French Fries") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Masala Papad") {
            termPrice = 30.00;
            return termPrice;
        } else if (itemsName == "Garlic Bread") {
            termPrice = 75.00;
            return termPrice;
        } else if (itemsName == "Cheese Garlic Bread") {
            termPrice = 100.00;
            return termPrice;
        } else if (itemsName == "Spring Rolls") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "Onion Rings") {
            termPrice = 70.00;
            return termPrice;
        } else if (itemsName == "Pasta Arrabbiata") {
            termPrice = 200.00;
            return termPrice;
        } else if (itemsName == "Pasta Alfredo") {
            termPrice = 220.00;
            return termPrice;
        } else if (itemsName == "Lasagna") {
            termPrice = 250.00;
            return termPrice;
        } else if (itemsName == "Chicken Shawarma") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Veg Shawarma") {
            termPrice = 160.00;
            return termPrice;
        } else if (itemsName == "Falafel") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Moussaka") {
            termPrice = 220.00;
            return termPrice;
        } else if (itemsName == "Baklava") {
            termPrice = 150.00;
            return termPrice;
        } else if (itemsName == "Tiramisu") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Cheesecake") {
            termPrice = 200.00;
            return termPrice;
        } else if (itemsName == "Coke") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Pepsi") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Sprite") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Lemonade") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Mint Mojito") {
            termPrice = 100.00;
            return termPrice;
        } else if (itemsName == "Cold Coffee") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Hot Coffee") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "Iced Tea") {
            termPrice = 80.00;
            return termPrice;
        } else if (itemsName == "Milkshake") {
            termPrice = 110.00;
            return termPrice;
        } else {
            System.out.println(itemsName + " is not found on the menu.");
        }

        return termPrice;
    }
}
