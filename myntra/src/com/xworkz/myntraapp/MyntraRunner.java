package com.xworkz.myntraapp;

import com.xworkz.myntraapp.constants.PaymentMethod;
import com.xworkz.myntraapp.myntradto.MyntraDto;
import com.xworkz.myntraapp.generatemyntra.Myntra;

public class MyntraRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        MyntraDto dto = new MyntraDto();
        dto.setCustomerName("Prathish");
        dto.setEmail("prathish45@gmail.com");
        dto.setAddress("3rd main road,mysore road, Bangalore");
        dto.setContactNumber("6547890321L");
        dto.setProductName("Formal Shirt");
        dto.setQuantity(2);
        dto.setPrice(1899.99);
        dto.setPaymentMethod(PaymentMethod.NET_BANKING);

        System.out.println("Customer Name: " + dto.getCustomerName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Address: " + dto.getAddress());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("Product: " + dto.getProductName());
        System.out.println("Quantity: " + dto.getQuantity());
        System.out.println("Price: " + dto.getPrice());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

        System.out.println("Main Ended");

        Myntra myntra = new Myntra();
        myntra.placeOrder(dto);
    }
}
