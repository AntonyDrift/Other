package com.company;

public class NameSurname {

    public String fio (String surname, String firstname, String patronymic){
        return surname.toUpperCase().charAt(0)+"."+firstname.toUpperCase().charAt(0)+"."+patronymic.toUpperCase().charAt(0);

    }
}
