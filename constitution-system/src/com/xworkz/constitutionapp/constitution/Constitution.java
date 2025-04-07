package com.xworkz.constitutionapp.constitution;

public class Constitution {
        private String country;
        private int articles;
        private int amendments;
        private String draftedBy;
        private String dateOfAdoption;
        private String preamble;
        private boolean isFlexible;

        // Mutators (Setters)
        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }

        public void setArticles(int articles) {
            this.articles = articles;
        }

        public int getArticles() {
            return articles;
        }

        public void setAmendments(int amendments) {
            this.amendments = amendments;
        }

        public int getAmendments() {
            return amendments;
        }

        public void setDraftedBy(String draftedBy) {
            this.draftedBy = draftedBy;
        }

        public String getDraftedBy() {
            return draftedBy;
        }

        public void setDateOfAdoption(String dateOfAdoption) {
            this.dateOfAdoption = dateOfAdoption;
        }

        public String getDateOfAdoption() {
            return dateOfAdoption;
        }

        public void setPreamble(String preamble) {
            this.preamble = preamble;
        }

        public String getPreamble() {
            return preamble;
        }

        public void setIsFlexible(boolean isFlexible) {
            this.isFlexible = isFlexible;
        }

        public boolean getIsFlexible() {
            return isFlexible;
        }
    }


