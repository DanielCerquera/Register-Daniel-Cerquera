package co.com.choucair.danielregister.stepdefinitions;

import co.com.choucair.danielregister.tasks.OpenUp;
import co.com.choucair.danielregister.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user Daniel will register his data in the registration form$")
    public void theUserDanielWillRegisterHisDataInTheRegistrationForm() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), (RegisterUser.onThePage()));
    }


    @When("^Once registered you will enter the login to enter the system$")
    public void onceRegisteredYouWillEnterTheLoginToEnterTheSystem() {

    }

    @Then("^Will enter the previously registered user data$")
    public void willEnterThePreviouslyRegisteredUserData() {

    }
}
