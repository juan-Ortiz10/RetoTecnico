package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.DashboardPage;
import userinterface.MeetingPage;

public class MeetAnswer implements Question<Boolean> {
    private String meet;

    public MeetAnswer(String meet) {
        this.meet = meet;
    }

    public static MeetAnswer toThe(String meet) {
        return new MeetAnswer(meet);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String meetName = Text.of(MeetingPage.TABLE_MEET_CREATED).viewedBy(actor).asString();
        return meet.equals(meetName);
    }
}
