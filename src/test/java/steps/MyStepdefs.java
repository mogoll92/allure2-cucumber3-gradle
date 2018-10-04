package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Created by Vitalii Smokov in 04-Oct-18
 */

public class MyStepdefs {
    @Given("^I open Google$")
    public void iOpenGoogle() {
        Selenide.open("https://www.google.com/");
    }

    @When("^I enter \"([^\"]*)\" in search textbox$")
    public void iEnterInSearchTextbox(String text) {
        $("#lst-ib")
                .val(text)
                .pressEnter();
    }

    @Then("^I should get result as \"([^\"]*)\"$")
    public void iShouldGetResultAs(String result) {
        $("#cwos").shouldHave(Condition.exactText(result));
    }
}
