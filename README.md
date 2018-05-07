# Optionals
Java Optional exercises

## Exercise 1:
Implement findPhoneNumberByName in PhoneBook class that returns an optional.
(No streams)

## Exercise 2:
Implement findPhoneNumberByNameAndPunishIfNothingFound in PhoneBookCrawler that uses the implementation from exercise 1

## Exercise 3:
Implement findPhoneNumberByNameAndPrintPhoneBookIfNothingFound in PhoneBookCrawler that uses the implementation from exercise 1

## Exercise 4
Did you receive a Hello message from the PhoneBook's toString method?
If yes, reimplement the exercise 3 to avoid it get's printed.
If no, reimplement exercise 3 to have it actually printed.

## Exercise 5
Can you reimplement exercise 2 using streams instead of using PhoneBook's findPhoneNumberByName

## Exercise 6
Can you reimplement exercise 3 using streams instead of using PhoneBook's findPhoneNumberByName

## Exercise 7
Implement findNameByPhoneNumber in PhoneBook class that returns an optional.
Implement findPhoneNumberByNameOrNameByPhoneNumber in PhoneBookCrawler class. First search the phone book by name. If that returns nothing search the phone book by phone number. If that still returns nothing return the phone number of Jos de Vos.

## Things covered
- Create an optional
- A get on an empty optional leads to a NoSuchElementException
- orElseThrow
- orElse
- orElseGet
- Optionals are important assets in Streaming APIs
- Dodgy example with Java 8 Optionals that is tackled in Java 9+

## Things not covered
- How to use optionals and how not to use optionals
- Best practices vs pitfalls
- Ideas?