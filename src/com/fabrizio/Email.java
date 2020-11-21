package com.fabrizio;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;


    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
        System.out.println("Email created for " + this.lastName + " " + this.firstName);
        this.department = setDepartment();
        System.out.println("Department is " + this.department);
    }

//    todo: ask for the department
    private String setDepartment() {
        System.out.print("Enter the Department\n 1 for Sales\n 2 for Development\n3 for Accounting\n 0 for None");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Development";
        } else if (deptChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

//            todo: generate a random password

//        todo: set the mailbox capacity and alternate email and change the password
}
