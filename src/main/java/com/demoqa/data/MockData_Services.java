package com.demoqa.data;

import com.github.javafaker.Faker;

import java.util.Random;

public class MockData_Services {
    Faker faker = new Faker();
    Random random = new Random();

    public String generateRandomUserFirstName() {
        return faker.name().firstName();
    }

    public String generateRandomUserLastName() {
        return faker.name().lastName();
    }

    public String generateRandomUserEmail() {
        return faker.internet().emailAddress();
    }

    public String generateRandomUserAge() {
        return String.valueOf(faker.number().numberBetween(18, 25));
    }

    public String generateRandomUserSalary() {
        return String.valueOf(faker.number().numberBetween(8000, 45000));
    }

    public String generateRandomUserDepartment() {
        return faker.options().option(
                "Insurance",
                "Compliance",
                "Legal",
                "HR",
                "Finance",
                "IT"
        );
    }

    public String generateRandomUserFullName() {
        return faker.name().fullName();
    }

    public String generateRandomCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generateRandomPermanentAddress() {
        return faker.address().secondaryAddress();
    }
}
