package com.cegeka.javaguild.optionals;

import java.util.Optional;
import java.util.stream.Stream;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseGet(() -> phoneBook.toString());
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return Stream.of(phoneBook.findPhoneNumberByName(name), phoneBook.findNameByPhoneNumber(phoneNumber), phoneBook.findPhoneNumberByName("Jos de Vos"))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst().get();
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }

}
