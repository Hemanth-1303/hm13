package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constants.BloodGroup;
import com.xworkz.hospitalapp.dto.PatientDto;
import com.xworkz.hospitalapp.record.Hospital;

public class HospitalRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        PatientDto patientDto = new PatientDto();
        patientDto.setPatientName("Chandan");
        patientDto.setAge(25);
        patientDto.setDob("15/08/2000");
        patientDto.setGender("Male");
        patientDto.setEmail("chandan@gmail.com");
        patientDto.setContactNumber("9876543210");
        patientDto.setBloodGroup(BloodGroup.O_POSITIVE);
        patientDto.setDiagnosis("Head ache");

        System.out.println("Patient Name: " + patientDto.getPatientName());
        System.out.println("Age: " + patientDto.getAge());
        System.out.println("DOB: " + patientDto.getDob());
        System.out.println("Gender: " + patientDto.getGender());
        System.out.println("Email: " + patientDto.getEmail());
        System.out.println("Contact: " + patientDto.getContactNumber());
        System.out.println("Blood Group: " + patientDto.getBloodGroup());
        System.out.println("Diagnosis: " + patientDto.getDiagnosis());

        System.out.println("-----------------------------------");

        Hospital hospital = new Hospital();
        hospital.registerPatient(patientDto);
    }
}
