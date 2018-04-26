package com.cegeka.javaguild.optionals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PhoneBookCrawlerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    public void findPhoneNumberByNameAndPunishIfNothingFound() {

    }

    @Test
    public void findPhoneNumberByNameAndPrintEntirePhoneBookIfNothingFound() {

    }


}