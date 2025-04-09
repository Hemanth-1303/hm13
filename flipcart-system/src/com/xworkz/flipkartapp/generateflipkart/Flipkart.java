package com.xworkz.flipkartapp.generateflipkart;
import com.xworkz.flipkartapp.flipkartdto.FlipkartDto;

    public class Flipkart {
        FlipkartDto  flipkartDto;

        public boolean placeOrder(FlipkartDto dto) {
            boolean orderPlaced = false;
            boolean validated = validateOrder(dto);
            if (validated) {
                this.flipkartDto = flipkartDto;
                orderPlaced = true;
                System.out.println("Order placed successfully!");
            } else {
                System.out.println("Order validation failed!");
            }
            return orderPlaced;
        }

        public boolean validateOrder(FlipkartDto dto) {
            boolean orderValidated = false;

            boolean nameValid = false;
            boolean orderIDValid = false;
            boolean itemValid = false;
            boolean deliveryValid = false;
            boolean paymentValid = false;

            if (dto.getUserName() != null && !dto.getUserName().isEmpty()) {
                nameValid = true;
            } else {
                System.out.println("Invalid User Name!");
            }

            if (dto.getOrderID() != null && !dto.getOrderID().isEmpty()) {
                orderIDValid = true;
            } else {
                System.out.println("Invalid Order ID!");
            }

            if (dto.getItemName() != null && !dto.getItemName().isEmpty()) {
                itemValid = true;
            } else {
                System.out.println("Invalid Item Name!");
            }

            if (dto.getDeliveryDate() != null && !dto.getDeliveryDate().isEmpty()) {
                deliveryValid = true;
            } else {
                System.out.println("Invalid Delivery Date!");
            }

            if (dto.getPaymentType() != null) {
                paymentValid = true;
            } else {
                System.out.println("Invalid Payment Type!");
            }

            if (nameValid && orderIDValid && itemValid && deliveryValid && paymentValid) {
                orderValidated = true;
            }

            return orderValidated;
        }
    }

