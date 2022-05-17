package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static userinterface.BusinessPage.ORGANIZATION_MENU;
import static userinterface.BusinessPage.UNITS_LINK;
import static userinterface.MeetingPage.*;

public class Go implements Task {

    private String objective;

    public Go(String objective) {
        this.objective = objective;
    }

    public static Go toMeeting(String objective) {
        return Tasks.instrumented(Go.class, objective);
    }

    public static Go toBusiness(String objective) {
        return Tasks.instrumented(Go.class, objective);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(objective.equals("Meeting"))
                .andIfSo(Click.on(MEETINGS_LINK),
                        Click.on(MEETINGS_PAGE))
                .otherwise(Click.on(ORGANIZATION_MENU),
                        Click.on(UNITS_LINK)));
    }
}
