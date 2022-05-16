package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.StarSharpLogin;

public class Login implements Task {

    public static Task onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("admin").into(StarSharpLogin.USER_INPUT),
                Enter.theValue("serenity").into(StarSharpLogin.PASSWORD_INPUT),
                Click.on(StarSharpLogin.LOGIN_BUTTON));
    }
}
