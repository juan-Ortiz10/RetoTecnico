package tasks;

import model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.BusinessPage;

import java.util.List;

import static userinterface.BusinessPage.*;

public class BusinessUnit implements Task {

    private List<StarSharpData> data;

    public BusinessUnit(List<StarSharpData> data) {
        this.data = data;
    }

    public static BusinessUnit create(List<StarSharpData> data) {
        return Tasks.instrumented(BusinessUnit.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NEW_UNIT_BUTTON),
                Enter.theValue(data.get(0).getUnitName()).into(NAME_INPUT),
                Click.on(PARENT_SELECT),
                Click.on(PARENT_TECH),
                Click.on(CREATE_BUTTON));
    }
}
