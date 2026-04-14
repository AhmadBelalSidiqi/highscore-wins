package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String date;
        int numberOfTicket;

        System.out.println("Pleas enter your name: ");
        name = scanner.nextLine();
        System.out.println("what date will you be coming (MM/dd/yyyy)");
        date = scanner.nextLine();
        System.out.println("How many tickets would you you like?");
        numberOfTicket = Integer.parseInt(scanner.nextLine());
        confirmationMessage(name,date,numberOfTicket);
    }
    public static void confirmationMessage(String name, String date, int num){
        String[] fullName = name.trim().split(" ");
        String firstname = fullName[0];
        String lastName = fullName[1];
        String ticket = "ticket";
        if (num>1){
            ticket = ticket+'s'; }
        System.out.println(num +" "+ticket+" reserved for " + date + "under " + lastName + ", "+firstname);

    }
}
