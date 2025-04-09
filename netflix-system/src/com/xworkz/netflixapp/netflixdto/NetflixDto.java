package com.xworkz.netflixapp.netflixdto;
import com.xworkz.netflixapp.constants.SubscriptionType;

    public class NetflixDto {
        private String userName;
        private String userID;
        private String movieTitle;
        private String subscriptionDate;
        private SubscriptionType subscriptionType;

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public String getUserID() {
            return userID;
        }

        public void setMovieTitle(String movieTitle) {
            this.movieTitle = movieTitle;
        }

        public String getMovieTitle() {
            return movieTitle;
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

