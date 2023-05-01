package org.example;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean hasAge = false;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.age = age;
        this.address = address;
        this.surname = surname;
        this.name = name;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address);
    }

    public void happyBirthday() {
        this.age++;
    }

    public boolean hasAge() {
        return hasAge;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isHasAge() {
        return hasAge;
    }

    public String getAddress() {
        return address;
    }
}
