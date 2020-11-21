package com.fabrizio;

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
    }

//    todo: ask for the department

//            todo: generate a random password

//        todo: set the mailbox capacity and alternate email and change the password
}
