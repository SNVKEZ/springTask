package org.springTask;

public class DoctorBean {
    String name;
    String surname;
    String patronymic;
    String email;
    int phoneNumber[];

    public DoctorBean(String name, String surname, String patronymic, String email, int[] phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEmail() {
        return email;
    }

    public int[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
