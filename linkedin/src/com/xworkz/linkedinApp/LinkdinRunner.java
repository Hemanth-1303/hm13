package com.xworkz.linkedinApp;

import com.xworkz.linkedinApp.Constants.Education;
import com.xworkz.linkedinApp.Constants.Software;
import com.xworkz.linkedinApp.linkdin.LinkedIn;
import com.xworkz.linkedinApp.linkdindto.LinkdinDto;

public class LinkdinRunner {
    public static void main(String arg[]){

        LinkdinDto linkdinDto = new LinkdinDto();
        linkdinDto.setEmail("Prajwal123@gmail.com");
        linkdinDto.setName("Prajwal");
        linkdinDto.setPhnNo(9876543210L);
        linkdinDto.setSoftwareskills(Software.java);
        linkdinDto.setEduaction(Education.DEGREE);

        LinkedIn bank = new LinkedIn();
        if(bank.User(linkdinDto)){
            System.out.println("successfull");
        }
        else
            System.out.println("unsuccesfull");
    }

}
