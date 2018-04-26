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

        assertThat(phoneNumber.get()).isEqualTo("016/16161616");
    }

    @Test
    public void findPhoneNumberByName_NotFound() {
        expectedException.expect(NoSuchElementException.class);

        String josDeVos = "Jos de Vos";
        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName(josDeVos);

        phoneNumber.get();
    }
}