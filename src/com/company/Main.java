package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What is your first name?");
        String fName = kbReader.nextLine();
        System.out.println("What is your last name?");
        String lName = kbReader.nextLine();
        System.out.println("Your name is " + fName + " " + lName + ".");
    }
}