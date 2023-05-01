package org.example;

public class PersonBuilder implements IPersonBuilder {
    //Обязательные параметры
    private String name;
    private String surname;
    //Необязательные параметры
    private int age;
    private boolean hasAge = false;
    private String address;

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(age);
        }
        this.age = age;
        this.hasAge = true;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException();
        }
        return new Person(name, surname, age, address);

    }

    class IllegalArgumentException extends RuntimeException {
        public IllegalArgumentException(int age) {
            System.out.println("Возраст не может быть больше нуля. Введен возврат %s");
        }
    }

    class IllegalStateException extends RuntimeException {
        public IllegalStateException() {
            System.out.println("У человека не может не быть имени или фамилии");
        }
    }

}
