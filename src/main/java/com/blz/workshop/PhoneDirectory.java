package com.blz.workshop;


import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    static Map<ContactDetails, PersonDetails> memberContacts = new HashMap<>();



    public void addMemberContactDetails(String firstName, String lastName, String address, String mobileNumber, String landlineNo, String email) {
        PersonDetails personDetails = new PersonDetails(firstName,lastName,address,mobileNumber,landlineNo,email);
        ContactDetails contactDetails=new ContactDetails( mobileNumber, landlineNo);
        memberContacts.put(contactDetails,personDetails);
        display(personDetails);
    }


    public void display(PersonDetails personDetails) {
        System.out.println("first name is :" + personDetails.firstName);
        System.out.println(" last name is :" + personDetails.lastName);
        System.out.println(" address is :" + personDetails.address);

        System.out.println(" phone number is :" + personDetails.mobileNumber);
        System.out.println(" phone number is :" + personDetails.landlineNo);

        System.out.println(" email address is :" + personDetails.email);

    }


    public static void main(String[] args) {

        PhoneDirectory entry1 = new PhoneDirectory();

        entry1.addMemberContactDetails("sandipan","kanade","Ahmednagar","9822726196","02422-276047","sandip@gmail.com");
    }
}