package com.xworkz.flipkartapp.flipkartdto;
import com.xworkz.flipkartapp.constants.PaymentType;

public class FlipkartDto {
        private String userName;
        private String orderID;
        private String itemName;
        private String deliveryDate;
        private PaymentType paymentType;

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setOrderID(String orderID) {
            this.orderID = orderID;
        }

        public String getOrderID() {
            return orderID;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return itemName;
        }

        public void setDeliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public String getDeliveryDate() {
            return deliveryDate;
        }

        public void setPaymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
        }

        public PaymentType getPaymentType() {
            return paymentType;
        }
    }


