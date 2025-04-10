package com.xworkz.markscard;

import com.xworkz.markscard.paper.Paper;

public class MarkscardRunner {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.studentName();
        paper.rollNumber();
        paper.grades();

        Markscard markscard = new Markscard();
        markscard.studentName();
        markscard.rollNumber();
        markscard.grades();
    }
}
