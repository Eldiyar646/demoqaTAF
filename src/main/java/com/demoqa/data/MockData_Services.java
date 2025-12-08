package com.demoqa.data;

import com.github.javafaker.Faker;

import java.util.Random;

public class MockData_Services {
    Faker faker = new Faker();
    Random random = new Random();

    public String generateRandomUserName (){
        return faker.name().fullName();
    }

    public String generateRandomUserEmail (){
        return faker.internet().emailAddress();
    }

    public String generateRandomCurrentAddress (){
        return faker.address().fullAddress();
    }

    public String generateRandomPermanentAddress (){
        return faker.address().secondaryAddress();
    }
}
