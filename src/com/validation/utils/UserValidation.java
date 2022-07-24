package com.validation.utils;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserValidation {
	
	public static boolean isValidFirstname(String firstname) {
	
	        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";
	        Predicate<String> predicate=p->p.matches(pattern1);
	        boolean value=predicate.test(firstname);
	        return value; 
	}
		
        public static boolean isValidLastname(String lastname) {
	
	        String pattern2="^[A-Z]{1}[A-Z a-z]{2,}$";
	        Predicate<String> predicate=p->p.matches(pattern2);
	        boolean value=predicate.test(lastname);
	        return value; 
	}

        public static boolean isValidEmailID(String emailId) {

	        String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
	        Predicate<String> predicate=p->p.matches(pattern3);
	        boolean value=predicate.test(emailId);
	        return value;
        }


        public static boolean isValidPhoneNumb(String phoneNumber) {

	        String pattern4="^[+][0-9]{1,}\\s?[1-9]{1}[0-9]{9}$";
	        Predicate<String> predicate=p->p.matches(pattern4);
	        boolean value=predicate.test(phoneNumber);
	        return value;
        }

        public static boolean isValidPassworD(String password) {

	        String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*[A-Z]{1,})(?=.*[0-9]{1,})(?=.*[!@#$%^&*();:]{1,}).*$";
	        Predicate<String> predicate=p->p.matches(pattern5);
	        boolean value=predicate.test(password);
	        return value;
        }

        
        public static void main(String[] args) {
    		
            User s=new User();
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the FirstName: ");
            String first_name=sc.nextLine();
            
            System.out.println("Enter the LastName: ");
            String last_name=sc.nextLine();

            System.out.println("Enter the EmailId: ");
            String email_Id=sc.nextLine();

            System.out.println("Enter the PhoneNumber: ");
            String phone_numb=sc.nextLine();

            System.out.println("Enter the Password: ");
            String password=sc.nextLine();

            
            s.setFirstName(first_name);
            s.setLastName(last_name);
            s.setEmailId(email_Id);
            s.setPhoneNumber(phone_numb);
            s.setPassword(password);

            System.out.println(s.getFirstName()+":"+isValidFirstname(s.getFirstName()));
            System.out.println(s.getLastName()+":"+isValidLastname(s.getLastName()));
            System.out.println(s.getEmailId()+":"+isValidEmailID(s.getEmailId()));
            System.out.println(s.getPhoneNumber()+":"+isValidPhoneNumb(s.getPhoneNumber()));
            System.out.println(s.getPassword()+":"+isValidPassworD(s.getPassword()));
            
       }

}
