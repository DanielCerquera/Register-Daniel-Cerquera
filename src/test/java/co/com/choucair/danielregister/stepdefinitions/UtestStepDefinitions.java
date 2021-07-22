package co.com.choucair.danielregister.stepdefinitions;

import co.com.choucair.danielregister.model.RegisterData;
import co.com.choucair.danielregister.tasks.OpenUp;
import co.com.choucair.danielregister.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user Daniel will register his data in the registration form$")
    public void theUserDanielWillRegisterHisDataInTheRegistrationForm(List<RegisterData> registerData) throws Exception {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), RegisterUser
                .onThePage(registerData.get(0).getStrFristName(),registerData.get(0).getStrLastName(),registerData.get(0).getStrEmail(),registerData.get(0).getStrIdiom(),registerData.get(0).getStrBrand(),registerData.get(0).getStrModel(),registerData.get(0).getStrOsVersion(),registerData.get(0).getStrPassword()));
    }


    @When("^Once registered you will enter the login to enter the system$")
    public void onceRegisteredYouWillEnterTheLoginToEnterTheSystem() {

    }

    @Then("^Will enter the previously registered user data$")
    public void willEnterThePreviouslyRegisteredUserData() {

    }
}
