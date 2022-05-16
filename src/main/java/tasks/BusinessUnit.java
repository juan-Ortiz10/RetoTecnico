package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.DashboardPage;

public class BusinessUnit implements Task {

    public static BusinessUnit create() {
        return Tasks.instrumented(BusinessUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DashboardPage.ORGANIZATION_MENU),
                Click.on(DashboardPage.UNITS_LINK),
                Click.on(DashboardPage.NEW_UNIT_BUTTON),
                Enter.theValue("UnidadCamilo").into(DashboardPage.NAME_INPUT),
                Click.on(DashboardPage.PARENT_SELECT),
                Click.on(DashboardPage.PARENT_TECH),
                Click.on(DashboardPage.CREATE_BUTTON));
    }
}
