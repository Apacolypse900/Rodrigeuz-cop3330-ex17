package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int weight;
        int gender;
        int ounces;
        int hours;
        double alcoholratio;
        double BAC;

        System.out.print("Enter a 1 if you are male or 2 if you are female: ");
            gender = myObj.nextInt();
        while (gender < 1 || gender >2) {
            System.out.print("Enter a 1 if you are male or 2 if you are female: ");
            gender = myObj.nextInt();
        }

        System.out.print("How many ounces did of alcohol did you have? ");
            ounces = myObj.nextInt();
        while(ounces < 0) {
            System.out.print("How many ounces did of alcohol did you have? ");
            ounces = myObj.nextInt();
        }

        System.out.print("What is your weight, in pounds?");
            weight = myObj.nextInt();
        while(weight < 0) {
            System.out.print("What is your weight, in pounds?");
            weight = myObj.nextInt();
        }

        System.out.print("How many hours has it been since your last drink?");
            hours = myObj.nextInt();
        while(hours < 0) {
            System.out.print("How many hours has it been since your last drink?");
            hours = myObj.nextInt();
        }

        if (gender == 1)
            alcoholratio = 0.73;
        else
            alcoholratio = 0.66;

        BAC = ((ounces * 5.14)/(weight * alcoholratio)) - (0.015 * hours);

        System.out.println("Your BAC is " + BAC);

        if (BAC > 0.08)
            System.out.println("It is not legal for you to drive");
        else
            System.out.println("It is legal for you to drive");

    }
}
