package com.chandebois.roman;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

/**
 * Created by nonok on 01/06/2016.
 */
public class RomanConverterSteps {

    RomanConverter romanConverter;
    String romanLiteralNumber;

    @Given("^roman converter initialized")
    public void setup() {
        romanConverter = new RomanConverter();
    }

    @When("^I call the roman converter service with a number with the value (\\d+)")
    public void setSearchParameters(final int numberToConvert) {
        romanLiteralNumber = romanConverter.convert(numberToConvert);
    }

    @Then("it should display '(.+)'")
    public void verifyRomanConversion(final String romanLiteralParam) {
        Assertions.assertThat(romanLiteralNumber).isNotNull();
        Assertions.assertThat(romanLiteralNumber).isEqualTo(romanLiteralParam);
    }
}
