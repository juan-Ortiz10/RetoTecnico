package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import questions.MeetAnswer;
import tasks.*;

public class StarSharpStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user is on the Star Sharp page$")
    public void thatTheUserIsOnTheStarSharpPage() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage());
    }


    @When("^the user logs in$")
    public void theUserLogsIn() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage());
    }

    @Then("^the page should display the (.*)$")
    public void thePageShouldDisplayTheDashboard(String page) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(page)));
    }

    @Given("^that the user created a Business Unit$")
    public void thatTheUserCreatedABusinessUnit() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(), (Login.onThePage()),BusinessUnit.create());
    }

    @Given("^he go to Meetings page$")
    public void heGoToMeetingsPage() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Go.toMeeting());
    }

    @When("^he create a new meeting$")
    public void heCreateANewMeeting() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Meeting.create());
    }

    @Then("^the meet should display in the table$")
    public void theMeetShouldDisplayInTheTable() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MeetAnswer.toThe("PruebaCamilo")));
    }
}
