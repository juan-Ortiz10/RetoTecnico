package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.MeetingPage;

public class SearchMeet implements Question<Boolean> {
    private String item;

    public SearchMeet(String item) {
        this.item = item;
    }

    public static SearchMeet theItemExist(String item) {
        return new SearchMeet(item);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(MeetingPage.TABLE_MEET_CREATED).viewedBy(actor).asString().equals(item);
    }
}
