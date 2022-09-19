package com.AddressBook.BridgeLabz;

import java.util.Scanner;

public class Contacts {

    //variables
    protected String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;


    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
    public String getCity()
    {
        return city;
    }

    public void setState(String state)
    {
        this.state = state;
    }
    public String getState()
    {
        return state;
    }
    public void setZip(String zipCode)
    {
        this.zipCode = zipCode;
    }
    public String getzip()
    {
        return zipCode;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;

    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }


    //created contactsDetails Method
    public void contactDetails()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter First Name :");
        setFirstName(sc.next());


        System.out.println("Enter Last Name :");
        setLastName(sc.next());

        System.out.println("Enter Your Address :");
        setAddress(sc.next());

        System.out.println("Enter Your City:");
        setCity(sc.next());

        System.out.println("Enter State :");
        setState(sc.next());

        System.out.println("Enter Zip Code :");
        setZip(sc.next());

        System.out.println("Enter Mobile Number :");
        setPhoneNumber(sc.next());

        System.out.println("Enter Email Id :");
        setEmail(sc.next());

    }

    //Object values will be returned
    @Override
    public String toString()
    {
        return "Contact { First Name :" + firstName+
                "\t  Last Name :" +lastName+
                "\t  Address :" +address+
                "\t  City :" +city+
                "\t  State :" +state+
                "\t  Zip Code :" +zipCode+
                "\t  Phone Number :"+phoneNumber+
                "\t  Email Id :" +email  +'}'
                ;
    }

}
