package main.java.builders;

import main.java.User;

public  class UserBuilder
{
    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder firstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    public UserBuilder lastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    public UserBuilder age(int age) {
        user.setAge(age);
        return this;
    }

    public UserBuilder phone(String phone) {
        user.setPhone(phone);
        return this;
    }

    public UserBuilder address(String address) {
        user.setAddress(address);
        return this;
    }

    public User build() {
        return user;
    }
}