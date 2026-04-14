package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int serialNumber = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = myScanner.nextLine();


        System.out.print("What is the carrier? ");
        String carrier = myScanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();

        System.out.println();

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(serialNumber);

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setModel(model);

        CellPhone cellPhone3 = new CellPhone();
        cellPhone3.setCarrier(carrier);

        CellPhone cellPhone4 = new CellPhone();
        cellPhone4.setPhoneNumber(phoneNumber);

        CellPhone cellPhone5 = new CellPhone();
        cellPhone5.setOwner(owner);

        System.out.println("Serial #: " + cellPhone1.getSerialNumber());
        System.out.println("Phone Model: " + cellPhone2.getModel());
        System.out.println("Carrier: " + cellPhone3.getCarrier());
        System.out.println("Phone #: " + cellPhone4.getPhoneNumber());
        System.out.println("Owner: " + cellPhone5.getOwner());
    }
}
