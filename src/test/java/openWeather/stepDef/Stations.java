package openWeather.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import openWeather.pages.PGStation;

public class Stations {

    private Response stationResponse;
    private final PGStation pgStation;

    public Stations() {
        pgStation = new PGStation();
    }

    @When("I call stations with {string}")
    public void iCallStationsWith(String operation) {
        stationResponse = pgStation.getStationResponse(operation);
    }

    @Then("I verify status code {int}")
    public void iVerifyStatusCode(int statusCode) {
        stationResponse.then().assertThat().statusCode(statusCode);
    }
}
