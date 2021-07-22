package co.com.choucair.danielregister.tasks;

import co.com.choucair.danielregister.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class RegisterUser implements Task {

    private String strFristName;
    private String strLastName;
    private String strEmail;
    private String strIdiom;
    private String strBrand;
    private String strModel;
    private String strOsVersion;
    private String strPassword;

    public static RegisterUser onThePage(String strFristName, String strLastName, String strEmail, String strIdiom, String strBrand, String strModel, String strOsVersion, String strPassword) {
        return Tasks.instrumented(RegisterUser.class,strFristName,strLastName,strEmail,strIdiom,strBrand,strModel,strOsVersion,strPassword);
    }

    public RegisterUser(String strFristName, String strLastName, String strEmail, String strIdiom, String strBrand, String strModel, String strOsVersion, String strPassword) {
        this.strFristName = strFristName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strIdiom = strIdiom;
        this.strBrand = strBrand;
        this.strModel = strModel;
        this.strOsVersion = strOsVersion;
        this.strPassword = strPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),

                Enter.theValue(strFristName).into(UtestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL_ADDRESS),
                Click.on(UtestRegisterPage.INPUT_BIRTH_MONTH),
                Click.on(UtestRegisterPage.INPUT_BIRTH_DAY),
                Click.on(UtestRegisterPage.INPUT_BIRTH_YEAR),
                Enter.theValue(strIdiom+ Keys.ENTER).into(UtestRegisterPage.INPUT_LANGUAGES),
                Click.on(UtestRegisterPage.NEXT_STEP),
                Click.on(UtestRegisterPage.NEXT_STEP_DEVICES),
                Click.on(UtestRegisterPage.SELECT_BRAND),
                Enter.theValue(strBrand+ Keys.ENTER).into(UtestRegisterPage.INSERT_BRAND),
                Click.on(UtestRegisterPage.SELECT_MODEL),
                Enter.theValue(strModel+ Keys.ENTER).into(UtestRegisterPage.INSERT_MODEL),
                Click.on(UtestRegisterPage.SELECT_OS),
                Enter.theValue(strOsVersion+ Keys.ENTER).into(UtestRegisterPage.SELECT_OS_VERSION),
                Click.on(UtestRegisterPage.LAST_STEP),
                Enter.theValue(strPassword).into(UtestRegisterPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestRegisterPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestRegisterPage.ACCEPT_TERM_USE),
                Click.on(UtestRegisterPage.ACCEPT_PRIVACY_SECURITY_POLICY),
                Click.on(UtestRegisterPage.COMPLETE_REGISTER_SETUP)
        );
    }
}
