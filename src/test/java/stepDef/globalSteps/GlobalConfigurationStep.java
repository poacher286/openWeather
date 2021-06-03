package stepDef.globalSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import openWeather.specBuilder.ReqSpecBuilder;

import java.util.Map;

public class GlobalConfigurationStep {
    private final ReqSpecBuilder reqSpecBuilder;

    public GlobalConfigurationStep(ReqSpecBuilder reqSpecBuilder) {
        this.reqSpecBuilder = reqSpecBuilder;
    }

    @When("I set base URI")
    public void iSetBaseURI() {
        reqSpecBuilder.setBaseURI();
    }

    @And("I set header")
    public void iSetHeader(DataTable dataTable) {
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        reqSpecBuilder.setHeaders(dataMap);
    }

    @And("I set query param")
    public void iSetQueryParam(DataTable dataTable) {
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        reqSpecBuilder.setQueryParam(dataMap);
    }
}