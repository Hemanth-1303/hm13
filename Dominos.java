class Dominos {
    public static double searchItems(String itemsName) {
        double termPrice = 0.0;

        
        if (itemsName == "Margherita Pizza") {
            termPrice = 299.00;
            return termPrice;
        } else if (itemsName == "Pepperoni Pizza") {
            termPrice = 399.00;
            return termPrice;
        } else if (itemsName == "Veg Supreme Pizza") {
            termPrice = 499.00;
            return termPrice;
        } else if (itemsName == "Cheese Burst Pizza") {
            termPrice = 549.00;
            return termPrice;
        } else if (itemsName == "Chicken Tikka Pizza") {
            termPrice = 550.00;
            return termPrice;
        } else if (itemsName == "Paneer Makhani Pizza") {
            termPrice = 499.00;
            return termPrice;
        } else if (itemsName == "Peppy Paneer Pizza") {
            termPrice = 459.00;
            return termPrice;
        } else if (itemsName == "BBQ Chicken Pizza") {
            termPrice = 520.00;
            return termPrice;
        } else if (itemsName == "Mexican Green Wave Pizza") {
            termPrice = 479.00;
            return termPrice;
        } else if (itemsName == "Veg Extravaganza Pizza") {
            termPrice = 599.00;
            return termPrice;
        } else if (itemsName=="Cheese Garlic Bread") {
            termPrice = 150.00;
            return termPrice;
        } else if (itemsName == "Classic Garlic Bread") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Stuffed Garlic Bread") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Chicken Wings") {
            termPrice = 250.00;
            return termPrice;
        } else if (itemsName == "Veggie Supreme Pasta") {
            termPrice = 230.00;
            return termPrice;
        } else if (itemsName == "Chicken Tikka Pasta") {
            termPrice = 260.00;
            return termPrice;
        } else if (itemsName == "Penne Arrabbiata Pasta") {
            termPrice = 220.00;
            return termPrice;
        } else if (itemsName == "Mac and Cheese Pasta") {
            termPrice = 240.00;
            return termPrice;
        } else if (itemsName == "Garlic Bread Sticks") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Cheese Sticks") {
            termPrice = 140.00;
            return termPrice; 
        } else if (itemsName == "Pepsi") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Coke") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Sprite") {
            termPrice = 60.00;
            return termPrice;
        } else if (itemsName == "Mojito") {
            termPrice = 80.00;
            return termPrice;
        } else if (itemsName == "Lemon Iced Tea") {
            termPrice = 70.00;
            return termPrice;
        } else if (itemsName == "Fresh Lime Soda") {
            termPrice = 50.00;
            return termPrice;
        } else if (itemsName == "Mineral Water") {
            termPrice = 30.00;
            return termPrice;
        } else if (itemsName == "Cold Coffee") {
            termPrice = 100.00;
            return termPrice;
        } else if (itemsName == "Hot Coffee") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "Vanilla Milkshake") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Choco Lava Cake") {
            termPrice = 150.00;
            return termPrice;
        } else if (itemsName == "Brownie") {
            termPrice = 100.00;
            return termPrice;
        } else if (itemsName == "Tiramisu") {
            termPrice = 120.00;
            return termPrice;
        } else if (itemsName == "Chocolate Mousse") {
            termPrice = 130.00;
            return termPrice;
        } else if (itemsName == "Fruit Cake") {
            termPrice = 160.00;
            return termPrice;
        } else if (itemsName == "Pineapple Cake") {
            termPrice = 140.00;
            return termPrice;
        } else if (itemsName == "Cheese Cake") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Caramel Custard") {
            termPrice = 110.00;
            return termPrice;
        } else if (itemsName == "Ice Cream Sundae") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "Gelato") {
            termPrice = 100.00;
            return termPrice;
        } else if (itemsName == "Vegetable Biryani") {
            termPrice = 180.00;
            return termPrice;
        } else if (itemsName == "Chicken Biryani") {
            termPrice = 250.00;
            return termPrice;
        } else if (itemsName == "Paneer Tikka") {
            termPrice = 220.00;
            return termPrice;
        } else if (itemsName == "Aloo Tikki") {
            termPrice = 90.00;
            return termPrice;
        } else if (itemsName == "Chana Chaat") {
            termPrice = 70.00;
            return termPrice;
        } else if (itemsName == "Samosa") {
            termPrice = 30.00;
            return termPrice;
        } else {
            System.out.println(itemsName + " is not found on the menu.");
        }
        
        return termPrice;
    }   
}
