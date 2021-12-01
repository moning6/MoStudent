package com.myLambda;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.comparing;

class Customer {
    private String firstName;
    private String lastName;
    private Integer zipCode;

    public Customer(String firstName, String lastName, Integer zipCode){
        this.firstName=firstName;
        this.lastName=lastName;
        this.zipCode=zipCode;
    }

    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getZipCode() {
        return zipCode;
    }
}

public class CustomerDemo {
    public static void main(String[] args) {
        List<String> customerList = new LinkedList<>();
//        customerList.add("Justin", "Lin", 804);
//        customerList.add("Moning", "Mo", 804);
//        customerList.add("Irene", "Lin", 804);
        Comparator<Customer> byLastName = comparing(Customer::getLastName);
//        customerList.sort(
//                byLastName
//                        .thenComparing(Customer::getFirstName)
//                        .thenCompering(Customer::getZipCode)
//        );

        customerList.forEach(out::println);

    }



}
