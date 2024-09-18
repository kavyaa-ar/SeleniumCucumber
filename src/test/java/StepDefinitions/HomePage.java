package StepDefinitions;

import io.cucumber.java.en.Given;
import static pages.Homepage.*;

public class HomePage {
    @Given("^user on home page$")
    public void search_Flights() throws InterruptedException {
        closeSign();
        clickFrom();
        enterFromCity();
        selectFromCity();
        clickToCity();
        enterToCity();
        selectToCity();
        selectDeparturedate();
        clickSearch();

    }
}
