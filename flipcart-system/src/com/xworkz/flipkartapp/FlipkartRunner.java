package com.xworkz.flipkartapp;
import com.xworkz.flipkartapp.constants.PaymentType;
import com.xworkz.flipkartapp.flipkartdto.FlipkartDto;
import com.xworkz.flipkartapp.generateflipkart.Flipkart;

    public class FlipkartRunner {

        public static void main(String[] args) {

            System.out.println("Main Started");

            FlipkartDto dto = new FlipkartDto();
            dto.setUserName("Akash");
            dto.setOrderID("MOB768543");
            dto.setItemName("Men's Beard Trimmer");
            dto.setDeliveryDate("2025-04-20");
            dto.setPaymentType(PaymentType.NET_BANKING);

            System.out.println("User Name: " + dto.getUserName());
            System.out.println("Order ID: " + dto.getOrderID());
            System.out.println("Item: " + dto.getItemName());
            System.out.println("Delivery Date: " + dto.getDeliveryDate());
            System.out.println("Payment Type: " + dto.getPaymentType());

            System.out.println("Main Ended");

            Flipkart flipkart = new Flipkart();
            flipkart.placeOrder(dto);
        }
    }

