package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.DashboardPage;

public class Answer implements Question<Boolean> {
    private String page;

    public Answer(String page) {
        this.page = page;
    }

    public static Answer toThe(String page) {
        return new Answer(page);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String namePage = Text.of(DashboardPage.NAME_PAGE).viewedBy(actor).asString();
        return page.equals(namePage);
    }
}
