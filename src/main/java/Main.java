package main.java;

import main.java.builders.UserBuilder;

public class Main {
    public static void main(String[] args) {
   
        User user1 = new UserBuilder()
                .firstName("aaa")
                .lastName("bb")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(user1);

        User user2 = new UserBuilder()
                .firstName("aaa")
                .lastName("bb")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new UserBuilder()
                .firstName("aaa")
                .lastName("bb")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }

}
