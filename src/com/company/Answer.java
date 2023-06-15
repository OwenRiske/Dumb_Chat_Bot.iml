package com.company;

import java.util.Scanner;

public class Answer {

    public static String userAnswer(String text) {
        //type out inputted text
        System.out.println("\n"+text+"\n");
        //get answer and set it as colour
        Scanner INPUT = new Scanner(System.in);
        String output = INPUT.nextLine();
        return output;
    }
}

