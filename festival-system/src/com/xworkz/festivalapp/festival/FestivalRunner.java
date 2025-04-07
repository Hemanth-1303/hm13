package com.xworkz.festivalapp.festival;

    public class FestivalRunner {
        public static void main(String[] args) {
            Festival festival1 = new Festival();
            festival1.setName("Diwali");
            festival1.setCountry("India");
            festival1.setSignificance("Victory of light over darkness");
            festival1.setDate("12 November 2023");
            festival1.setIsPublicHoliday(true);
            festival1.setDuration("5 days");
            festival1.setMainActivity("Lighting lamps and bursting fireworks");

            System.out.println("Festival Details:");
            System.out.println("Name: " + festival1.getName());
            System.out.println("Country: " + festival1.getCountry());
            System.out.println("Significance: " + festival1.getSignificance());
            System.out.println("Date: " + festival1.getDate());
            System.out.println("Is Public Holiday: " + festival1.getIsPublicHoliday());
            System.out.println("Duration: " + festival1.getDuration());
            System.out.println("Main Activity: " + festival1.getMainActivity());

            Festival festival2 = new Festival();
            festival2.setName("Christmas");
            festival2.setCountry("Worldwide");
            festival2.setSignificance("Birth of Jesus Christ");
            festival2.setDate("25 December 2023");
            festival2.setIsPublicHoliday(true);
            festival2.setDuration("1 day");
            festival2.setMainActivity("Decorating Christmas trees and gift-giving");

            System.out.println("Festival Details:");
            System.out.println("Name: " + festival2.getName());
            System.out.println("Country: " + festival2.getCountry());
            System.out.println("Significance: " + festival2.getSignificance());
            System.out.println("Date: " + festival2.getDate());
            System.out.println("Is Public Holiday: " + festival2.getIsPublicHoliday());
            System.out.println("Duration: " + festival2.getDuration());
            System.out.println("Main Activity: " + festival2.getMainActivity());

            Festival festival3 = new Festival();
            festival3.setName("Chinese New Year");
            festival3.setCountry("China");
            festival3.setSignificance("Celebrating the start of the lunar calendar");
            festival3.setDate("10 February 2024");
            festival3.setIsPublicHoliday(true);
            festival3.setDuration("15 days");
            festival3.setMainActivity("Dragon dances and family gatherings");

            System.out.println("Festival Details:");
            System.out.println("Name: " + festival3.getName());
            System.out.println("Country: " + festival3.getCountry());
            System.out.println("Significance: " + festival3.getSignificance());
            System.out.println("Date: " + festival3.getDate());
            System.out.println("Is Public Holiday: " + festival3.getIsPublicHoliday());
            System.out.println("Duration: " + festival3.getDuration());
            System.out.println("Main Activity: " + festival3.getMainActivity());

            Festival festival4 = new Festival();
            festival4.setName("Oktoberfest");
            festival4.setCountry("Germany");
            festival4.setSignificance("Celebration of Bavarian culture");
            festival4.setDate("16 September - 3 October 2023");
            festival4.setIsPublicHoliday(false);
            festival4.setDuration("17 days");
            festival4.setMainActivity("Drinking beer and enjoying Bavarian food");

            System.out.println("Festival Details:");
            System.out.println("Name: " + festival4.getName());
            System.out.println("Country: " + festival4.getCountry());
            System.out.println("Significance: " + festival4.getSignificance());
            System.out.println("Date: " + festival4.getDate());
            System.out.println("Is Public Holiday: " + festival4.getIsPublicHoliday());
            System.out.println("Duration: " + festival4.getDuration());
            System.out.println("Main Activity: " + festival4.getMainActivity());

            Festival festival5 = new Festival();
            festival5.setName("Carnival");
            festival5.setCountry("Brazil");
            festival5.setSignificance("Celebration before Lent");
            festival5.setDate("9 February - 13 February 2024");
            festival5.setIsPublicHoliday(false);
            festival5.setDuration("5 days");
            festival5.setMainActivity("Parades with samba and colorful costumes");

            System.out.println("Festival Details:");
            System.out.println("Name: " + festival5.getName());
            System.out.println("Country: " + festival5.getCountry());
            System.out.println("Significance: " + festival5.getSignificance());
            System.out.println("Date: " + festival5.getDate());
            System.out.println("Is Public Holiday: " + festival5.getIsPublicHoliday());
            System.out.println("Duration: " + festival5.getDuration());
            System.out.println("Main Activity: " + festival5.getMainActivity());
        }
    }


