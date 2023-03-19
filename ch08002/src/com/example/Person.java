package com.example;

public class Person {
    private final String givenName;
    private final String surName;
    private final int age;
    private final Gender gender;
    private final String eMail;
    private final String phone;
    private final String address;
    private final String city;
    private final String state;
    private final String code;

    public Person(PersonBuilder builder) {
        this.givenName = builder.givenName;
        this.surName = builder.surName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.eMail = builder.eMail;
        this.phone = builder.phone;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.code = builder.code;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCode() {
        return code;
    }

    public  static  class PersonBuilder{
        private String givenName;
        private String surName;
        private int age;
        private Gender gender;
        private String eMail;
        private String phone;
        private String address;
        private String city;
        private String state;
        private String code;

        public PersonBuilder() {

        }
        public  PersonBuilder givenName(String givenName)
        {
            this.givenName=givenName;
            return this;
        }
        public  PersonBuilder surName(String surName)
        {
            this.surName=surName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder eMail(String eMail) {
            this.eMail = eMail;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder city(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder state(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder code(String code) {
            this.code = code;
            return this;
        }

        public Person build() {
            return new Person(this);
        }


    }
}
