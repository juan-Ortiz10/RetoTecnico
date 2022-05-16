package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.DashboardPage;
import userinterface.MeetingPage;

public class Meeting implements Task {
    public static Meeting create() {
        return Tasks.instrumented(Meeting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MeetingPage.NEW_MEETING_BUTTON),
                Enter.theValue("PruebaCamilo").into(MeetingPage.NAME_INPUT),
                Click.on(MeetingPage.TYPE_SELECT),
                Click.on(MeetingPage.TYPE_WEEKLY),
                Enter.theValue("2408").into(MeetingPage.NUMBER_INPUT),
                Enter.theValue("05/16/2022").into(MeetingPage.DATE_START_INPUT),
                SelectFromOptions.byVisibleText("08:00").from(MeetingPage.TIME_START_SELECT),
                Enter.theValue("05/16/2022").into(MeetingPage.DATE_END_INPUT),
                SelectFromOptions.byVisibleText("17:30").from(MeetingPage.TIME_END_SELECT),
                Click.on(MeetingPage.LOCATION_SELECT),
                Click.on(MeetingPage.LOCATION_SD),
                Click.on(MeetingPage.UNIT_SELECT),
                Enter.theValue("UnidadCamilo").into(MeetingPage.UNIT_INPUT),
                Click.on(MeetingPage.UNIT_PRUEBA),
                Click.on(MeetingPage.ORGANIZED_SELECT),
                Click.on(MeetingPage.ORGANIZED),
                Click.on(MeetingPage.REPORTER_SELECT),
                Click.on(MeetingPage.REPORTER),
                Click.on(DashboardPage.CREATE_BUTTON));
    }
}
