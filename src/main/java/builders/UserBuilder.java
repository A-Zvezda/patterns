package main.java;

public  class UserBuilder
{
    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    public UserBuilder firstName(String firstName) {
        user.setAddressFrom(firstName);
        return this;
    }

    public UserBuilder lastName(String lastName) {
        user.setAddressTo(lastName);
        return this;
    }

    public UserBuilder age(int age) {
        user.setAddressCopy(age);
        return this;
    }

    public UserBuilder phone(String phone) {
        user.setSubject(phone);
        return this;
    }

    public UserBuilder address(String address) {
        user.setText(address);
        return this;
    }
    
    public UserBuilder build() {
        return user;
    }
}