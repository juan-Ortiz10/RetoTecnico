package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.DashboardPage;
import userinterface.StarSharpLogin;

public class LoginAnswer implements Question<Boolean> {
    private String error;

    public LoginAnswer(String error) {
        this.error = error;
    }

    public static LoginAnswer toThe(String error) {
        return new LoginAnswer(error);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String toast = Text.of(StarSharpLogin.TOAST_ERROR).viewedBy(actor).asString();
        return error.equals(toast);
    }
}
