package com.xworkz.jiohotstarapp.jiohotstardto;
import com.xworkz.jiohotstarapp.constants.SubscriptionType;

    public class JiohotstarDto {
        private String userName;
        private String accountID;
        private String showName;
        private String subscriptionDate;
        private SubscriptionType subscriptionType;

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setAccountID(String accountID) {
            this.accountID = accountID;
        }

        public String getAccountID() {
            return accountID;
        }

        public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getShowName() {
            return showName;
        }

        public void setSubscriptionDate(String subscriptionDate) {
            this.subscriptionDate = subscriptionDate;
        }

        public String getSubscriptionDate() {
            return subscriptionDate;
        }

        public void setSubscriptionType(SubscriptionType subscriptionType) {
            this.subscriptionType = subscriptionType;
        }

        public SubscriptionType getSubscriptionType() {
            return subscriptionType;
        }
    }

