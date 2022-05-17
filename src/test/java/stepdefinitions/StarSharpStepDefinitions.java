package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.StarSharpData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.SearchMeet;
import questions.SearchUnit;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StarSharpStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that the user is on the Star Sharp page$")
    public void thatTheUserIsOnTheStarSharpPage(){
        theActorCalled("user").wasAbleTo(OpenUp.thePage());
    }

    @And("^the user logs in$")
    public void theUserLogsIn(List<StarSharpData> data) {
        theActorInTheSpotlight().attemptsTo(Login.onThePage(data.get(0).getUser(), data.get(0).getPassword()));
    }

    @And("^he go to the Bussiness Units$")
    public void heGoToTheBussinessUnits() {
        theActorInTheSpotlight().attemptsTo(Go.toBusiness("Unit"));
    }

    @When("^he create a new unit$")
    public void heCreateANewUnit(List<StarSharpData> data) {
        theActorInTheSpotlight().attemptsTo(BusinessUnit.create(data));
    }

    @Then("^the (.*) should display in the tree$")
    public void theUnitNameShouldDisplayInTheTree(String data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchUnit.theItemExist(data)));
    }

    @Given("^he go to Meetings page$")
    public void heGoToMeetingsPage(){
        theActorInTheSpotlight().attemptsTo(Go.toMeeting("Meeting"));
    }

    @When("^he create a new meeting$")
    public void heCreateANewMeeting(List<StarSharpData> data){
        theActorInTheSpotlight().attemptsTo(Meeting.create(data));
    }

    @Then("^the (.*) should display in the table$")
    public void theMeetShouldDisplayInTheTable(String data){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchMeet.theItemExist(data)));
    }
}
