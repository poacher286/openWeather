package openWeather.pages;

import io.restassured.response.Response;
import openWeather.base.APIBase;
import openWeather.constant.Operation;

public class PGStation extends APIBase {

    private static final String RESOURCE = "stations";

    public Response getStationResponse(String operation){
        specBuilder.get().setBasePath(RESOURCE);
        return this.getResponse(specBuilder.get().build(), Operation.valueOf(operation));
    }
}
