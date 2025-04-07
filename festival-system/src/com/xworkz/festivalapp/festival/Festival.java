package com.xworkz.festivalapp.festival;

public class Festival {
        private String name;
        private String country;
        private String significance;
        private String date;
        private boolean isPublicHoliday;
        private String duration;
        private String mainActivity;

        // Mutators (Setters)
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }

        public void setSignificance(String significance) {
            this.significance = significance;
        }

        public String getSignificance() {
            return significance;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        public void setIsPublicHoliday(boolean isPublicHoliday) {
            this.isPublicHoliday = isPublicHoliday;
        }

        public boolean getIsPublicHoliday() {
            return isPublicHoliday;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getDuration() {
            return duration;
        }

        public void setMainActivity(String mainActivity) {
            this.mainActivity = mainActivity;
        }

        public String getMainActivity() {
            return mainActivity;
        }
    }

