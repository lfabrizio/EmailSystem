package com.fabrizio;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";


    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
        System.out.println("Email created for " + this.lastName + " " + this.firstName);
        this.department = setDepartment();
        System.out.println("Department is " + this.department);
        this.password= randomPassword(defaultPasswordLength);
        System.out.println("your password is " + this.password);
        // combine elements
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is " + email);
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
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!";
        char[] password = new char[length];
        for(int i = 0; i < length;i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

//        todo: set the mailbox capacity and alternate email and change the password
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //change password
    public void changePassword(){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

   //no
     public String showInfo(){
        return "Display NAme: " + firstName + " " + lastName + "\n Company Name " + email + "\n Mailbox Capacity " + mailboxCapacity;
     }

}
