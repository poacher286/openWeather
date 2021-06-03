package openWeather.specBuilder;

import openWeather.base.APIBase;

import java.util.Map;

public class ReqSpecBuilder extends APIBase {
    public void setBaseURI() {
        specBuilder.get()
//                .setBaseUri(System.getProperty("baseURI"));
                .setBaseUri("http://api.openweathermap.org/data/3.0/");
    }

    public void setHeaders(Map<String, String> dataMap) {
        specBuilder.get().addHeaders(dataMap);
    }

    public void setQueryParam(Map<String, String> dataMap) {
        specBuilder.get().addQueryParams(dataMap);
    }
}
