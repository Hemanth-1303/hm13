package com.xworkz.maxApp;

import com.xworkz.maxApp.max.MaxDto;

public class MaxRunner {
    public static void main(String arg[]){

        MaxDto maxDto = new MaxDto();
        maxDto.setFullName("Hemanth");
        maxDto.setEmailAddress("hemu13@gmail.com");
        maxDto.setPassword("hemu@123");
        maxDto.setConfirmPassword("hemu@123");

        MaxDto maxDto1 = new MaxDto();
        if(maxDto1.isUser(maxDto)){
            System.out.println("successful");
        }
        else
            System.out.println("unsuccessful");
    }
}
