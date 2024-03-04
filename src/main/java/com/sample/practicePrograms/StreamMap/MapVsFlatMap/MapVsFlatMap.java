package com.sample.practicePrograms.StreamMap.MapVsFlatMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> emails = customers.stream()
                .map(Customer::getEmail)
                .collect(Collectors.toList());
        System.out.println("Emails : \n"+emails);

//customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<List<String>> phoneNumbers = customers.
                stream().map(Customer::getPhoneNumbers)
                .collect(Collectors.toList());
        System.out.println("PhoneNumbers: \n"+phoneNumbers);

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("Phone : \n"+phones);
    }
}
