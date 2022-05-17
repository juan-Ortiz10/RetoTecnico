package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.StarSharpLogin;

public class Login implements Task {

    private String user;
    private String pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Task onThePage(String user, String pass) {
        return Tasks.instrumented(Login.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(StarSharpLogin.USER_INPUT),
                Enter.theValue(pass).into(StarSharpLogin.PASSWORD_INPUT),
                Click.on(StarSharpLogin.LOGIN_BUTTON));
    }
}
