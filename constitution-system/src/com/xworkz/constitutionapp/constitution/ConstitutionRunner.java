package com.xworkz.constitutionapp.constitution;

public class ConstitutionRunner {
        public static void main(String[] args) {
            Constitution constitution1 = new Constitution();
            constitution1.setCountry("India");
            constitution1.setArticles(448);
            constitution1.setAmendments(105);
            constitution1.setDraftedBy("B. R. Ambedkar");
            constitution1.setDateOfAdoption("26 January 1950");
            constitution1.setPreamble("We, the people of India...");
            constitution1.setIsFlexible(true);

            System.out.println("Constitution Details:");
            System.out.println("Country: " + constitution1.getCountry());
            System.out.println("Articles: " + constitution1.getArticles());
            System.out.println("Amendments: " + constitution1.getAmendments());
            System.out.println("Drafted By: " + constitution1.getDraftedBy());
            System.out.println("Date of Adoption: " + constitution1.getDateOfAdoption());
            System.out.println("Preamble: " + constitution1.getPreamble());
            System.out.println("Is Flexible: " + constitution1.getIsFlexible());

            Constitution constitution2 = new Constitution();
            constitution2.setCountry("United States");
            constitution2.setArticles(7);
            constitution2.setAmendments(27);
            constitution2.setDraftedBy("James Madison");
            constitution2.setDateOfAdoption("17 September 1787");
            constitution2.setPreamble("We the People of the United States...");
            constitution2.setIsFlexible(false);

            System.out.println("Constitution Details:");
            System.out.println("Country: " + constitution2.getCountry());
            System.out.println("Articles: " + constitution2.getArticles());
            System.out.println("Amendments: " + constitution2.getAmendments());
            System.out.println("Drafted By: " + constitution2.getDraftedBy());
            System.out.println("Date of Adoption: " + constitution2.getDateOfAdoption());
            System.out.println("Preamble: " + constitution2.getPreamble());
            System.out.println("Is Flexible: " + constitution2.getIsFlexible());

            Constitution constitution3 = new Constitution();
            constitution3.setCountry("Australia");
            constitution3.setArticles(128);
            constitution3.setAmendments(8);
            constitution3.setDraftedBy("Constitutional Conventions");
            constitution3.setDateOfAdoption("1 January 1901");
            constitution3.setPreamble("Whereas the people of New South Wales...");
            constitution3.setIsFlexible(false);

            System.out.println("Constitution Details:");
            System.out.println("Country: " + constitution3.getCountry());
            System.out.println("Articles: " + constitution3.getArticles());
            System.out.println("Amendments: " + constitution3.getAmendments());
            System.out.println("Drafted By: " + constitution3.getDraftedBy());
            System.out.println("Date of Adoption: " + constitution3.getDateOfAdoption());
            System.out.println("Preamble: " + constitution3.getPreamble());
            System.out.println("Is Flexible: " + constitution3.getIsFlexible());

            Constitution constitution4 = new Constitution();
            constitution4.setCountry("South Africa");
            constitution4.setArticles(243);
            constitution4.setAmendments(17);
            constitution4.setDraftedBy("Constitutional Assembly");
            constitution4.setDateOfAdoption("4 February 1997");
            constitution4.setPreamble("We, the people of South Africa...");
            constitution4.setIsFlexible(true);

            System.out.println("Constitution Details:");
            System.out.println("Country: " + constitution4.getCountry());
            System.out.println("Articles: " + constitution4.getArticles());
            System.out.println("Amendments: " + constitution4.getAmendments());
            System.out.println("Drafted By: " + constitution4.getDraftedBy());
            System.out.println("Date of Adoption: " + constitution4.getDateOfAdoption());
            System.out.println("Preamble: " + constitution4.getPreamble());
            System.out.println("Is Flexible: " + constitution4.getIsFlexible());

            Constitution constitution5 = new Constitution();
            constitution5.setCountry("France");
            constitution5.setArticles(92);
            constitution5.setAmendments(24);
            constitution5.setDraftedBy("Charles de Gaulle");
            constitution5.setDateOfAdoption("4 October 1958");
            constitution5.setPreamble("The French people solemnly proclaim...");
            constitution5.setIsFlexible(true);

            System.out.println("Constitution Details:");
            System.out.println("Country: " + constitution5.getCountry());
            System.out.println("Articles: " + constitution5.getArticles());
            System.out.println("Amendments: " + constitution5.getAmendments());
            System.out.println("Drafted By: " + constitution5.getDraftedBy());
            System.out.println("Date of Adoption: " + constitution5.getDateOfAdoption());
            System.out.println("Preamble: " + constitution5.getPreamble());
            System.out.println("Is Flexible: " + constitution5.getIsFlexible());
        }
    }

