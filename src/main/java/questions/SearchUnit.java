package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.BusinessPage;

public class SearchUnit implements Question<Boolean> {
    private String item;

    public SearchUnit(String item) {
        this.item = item;
    }

    public static SearchUnit theItemExist(String item) {
        return new SearchUnit(item);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
            return Text.of(BusinessPage.TABLE_UNIT_CREATED).viewedBy(actor).asString().equals(item);
    }
}
