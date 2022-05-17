package tasks;

import model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.BusinessPage;

import java.util.List;

import static userinterface.MeetingPage.*;

public class Meeting implements Task {

    private List<StarSharpData> data;

    public Meeting(List<StarSharpData> data) {
        this.data = data;
    }

    public static Meeting create(List<StarSharpData> data) {
        return Tasks.instrumented(Meeting.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NEW_MEETING_BUTTON),
                Enter.theValue(data.get(0).getMeetName()).into(NAME_INPUT),
                Click.on(TYPE_SELECT),
                Click.on(TYPE_WEEKLY),
                Enter.theValue(data.get(0).getMeetNumber()).into(NUMBER_INPUT),
                Enter.theValue(data.get(0).getMeetDateStart()).into(DATE_START_INPUT),
                SelectFromOptions.byVisibleText("08:00").from(TIME_START_SELECT),
                Enter.theValue(data.get(0).getMeetDateEnd()).into(DATE_END_INPUT),
                SelectFromOptions.byVisibleText("17:30").from(TIME_END_SELECT),
                Click.on(LOCATION_SELECT),
                Click.on(LOCATION_SD),
                Click.on(UNIT_SELECT),
                Enter.theValue(data.get(0).getUnitName()).into(UNIT_INPUT),
                Click.on(UNIT_PRUEBA),
                Click.on(ORGANIZED_SELECT),
                Click.on(ORGANIZED),
                Click.on(REPORTER_SELECT),
                Click.on(REPORTER),
                Click.on(BusinessPage.CREATE_BUTTON));
    }
}
