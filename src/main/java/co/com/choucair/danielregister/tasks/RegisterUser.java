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
    public static Performable onThePage() {
        return Tasks.instrumented(RegisterUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),

                Enter.theValue("Daniel Andres").into(UtestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue("Cerquera Lasso").into(UtestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue("correoPrueba@ucompensar.edu.co").into(UtestRegisterPage.INPUT_EMAIL_ADDRESS),
                Click.on(UtestRegisterPage.INPUT_BIRTH_MONTH),
                Click.on(UtestRegisterPage.INPUT_BIRTH_DAY),
                Click.on(UtestRegisterPage.INPUT_BIRTH_YEAR),
                Enter.theValue("Spanish"+ Keys.ENTER).into(UtestRegisterPage.INPUT_LANGUAGES),
                Click.on(UtestRegisterPage.NEXT_STEP),
                Click.on(UtestRegisterPage.NEXT_STEP_DEVICES),
                Click.on(UtestRegisterPage.SELECT_BRAND),
                Enter.theValue("Apple"+ Keys.ENTER).into(UtestRegisterPage.INSERT_BRAND),
                Click.on(UtestRegisterPage.SELECT_MODEL),
                Enter.theValue("iPhone 8 Plus"+ Keys.ENTER).into(UtestRegisterPage.INSERT_MODEL),
                Click.on(UtestRegisterPage.SELECT_OS),
                Enter.theValue("iOS 14.5.1"+ Keys.ENTER).into(UtestRegisterPage.SELECT_OS_VERSION),
                Click.on(UtestRegisterPage.LAST_STEP),
                Enter.theValue("PruebaTecnicaDaniel2021**").into(UtestRegisterPage.INPUT_PASSWORD),
                Enter.theValue("PruebaTecnicaDaniel2021**").into(UtestRegisterPage.INPUT_CONFIRM_PASSWORD),
                Enter.theValue("PruebaTecnicaDaniel2021**").into(UtestRegisterPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestRegisterPage.ACCEPT_TERM_USE),
                Click.on(UtestRegisterPage.ACCEPT_PRIVACY_SECURITY_POLICY),
                Click.on(UtestRegisterPage.COMPLETE_REGISTER_SETUP)
        );
    }
}
