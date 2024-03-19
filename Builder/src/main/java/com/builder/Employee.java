package com.builder;

import com.builder.domain.Address;
import com.builder.domain.Contact;
import com.builder.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacs;

    public Employee() {
    }

    public Employee(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Employee(int age, String name, String gender, Address address, List<Phone> phones, List<Contact> contacs) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacs = contacs;
    }

    public static class EmployeeBuilder implements IBuilder<Employee> {

        private int age;
        private String name;
        private String gender;
        private Address address;
        private final List<Phone> phones = new ArrayList<>();
        private final List<Contact> contacs = new ArrayList<>();

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setAddress(String address, String city, String country, String cp) {
            this.address = new Address(address, city, country, cp);
            return this;
        }

        public EmployeeBuilder setPhone(Phone phone) {
            this.phones.add(phone);
            return this;
        }

        public EmployeeBuilder setPhone(String phoneNumbe, String ext, String phoneType) {
            this.phones.add(new Phone(phoneNumbe, ext, phoneType));
            return this;
        }

        public EmployeeBuilder setContact(Contact contact) {
            this.contacs.add(contact);
            return this;
        }

        public EmployeeBuilder setContact(String name, Phone phone, Address address) {
            this.contacs.add(new Contact(name, phone, address));
            return this;
        }

        @Override
        public Employee build() {
            return new Employee(age, name, gender, address, phones, contacs);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address adress) {
        this.address = adress;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacs() {
        return contacs;
    }

    public void setContacs(List<Contact> contacs) {
        this.contacs = contacs;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n, age=" + age +
                "\n, name='" + name + '\'' +
                "\n, gender='" + gender + '\'' +
                "\n, address=" + address +
                "\n, phones=" + phones +
                "\n, contacs=" + contacs +
                "}";
    }
}
