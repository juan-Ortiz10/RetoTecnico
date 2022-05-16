package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.DashboardPage;
import userinterface.MeetingPage;

public class Go implements Task {

    public static Go toMeeting() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MeetingPage.MEETINGS_LINK),
                Click.on(MeetingPage.MEETINGS_PAGE));
    }
}
