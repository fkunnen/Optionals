package com.cegeka.javaguild.optionals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneBookTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private PhoneBook phoneBook = new PhoneBook();

    @Test
    public void findPhoneNumberByName() {
        String josDeVos = "Jos de Vos";

        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName(josDeVos);

        assertThat(phoneNumber.get()).isEqualTo("016/161616");
    }

    @Test
    public void findPhoneNumberByName_NotFound() {
        expectedException.expect(NoSuchElementException.class);

        String josDeVos = "Jos de Voss";
        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName(josDeVos);

        phoneNumber.get();
    }

    @Test
    public void findNameByPhoneNumber() {
        Optional<String> name = phoneBook.findNameByPhoneNumber("016/161616");

        assertThat(name.get()).isEqualTo("Jos de Vos");
    }

    @Test
    public void findNameByPhoneNumber_NotFound() {
        expectedException.expect(NoSuchElementException.class);

        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName("016/161619");

        phoneNumber.get();
    }
}