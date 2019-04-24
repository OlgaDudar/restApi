
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import core.model.ResponseModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.IOException;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

public class RestAPITest {
    @DataProvider(name = "getData", parallel = true)
    public Object[][] getData()
    {
        return new Object[][]{{"Norway", "Oslo"}, {"France", "Paris"}, {"Ukraine", "Kiev"}, {"Poland", "Warsaw"}};
    }

    @Test (dataProvider = "getData")
    public void getRequestFindCapital(String name, String capital) throws JSONException {

        //make get request to fetch capital of country
        Response resp = get("http://restcountries.eu/rest/v2/name/"+name);

        //Fetching response in JSON
        JSONArray jsonResponse = new JSONArray(resp.asString());

        //Fetching value of capital parameter
        String respCapital = jsonResponse.getJSONObject(0).getString("capital");

        //Asserting that capital of country is right
        Assert.assertEquals(respCapital, capital);
    }

    @Test (dataProvider = "getData")
    public void getRequestFindCapitalModel(String name, String capital) throws JSONException, IOException {
        //make get request to fetch capital of country
        Response resp = get("http://restcountries.eu/rest/v2/name/"+name);

        //Fetching response in JSON
        JSONArray jsonResponse = new JSONArray(resp.asString());

//        ObjectMapper objectMapper = new ObjectMapper();
        ResponseModel receivedObj = new Gson().fromJson(jsonResponse.get(0).toString(), ResponseModel.class);

        Assert.assertEquals(receivedObj.getCapital(), capital);
    }

    @Test
    public void httpPost() throws JSONException,InterruptedException {

        //Initializing Rest API's URL
        String APIUrl = "https://reqres.in/api/users/2";

        //Initializing payload or API body
        String APIBody = "{\"name\":\"Tracey\",\"job\":\"zion resident\"}"; //e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"

        // Building request using requestSpecBuilder
        RequestSpecBuilder builder = new RequestSpecBuilder();

        //Setting API's body
        builder.setBody(APIBody);

        //Setting content type as application/json or application/xml
        builder.setContentType("text/html; charset=UTF-8");

        RequestSpecification requestSpec = builder.build();

        //Making post request with authentication, leave blank in case there are no credentials- basic("","")
        Response response = given().authentication().preemptive().basic("", "")
                .spec(requestSpec).when().post(APIUrl);

       Assert.assertEquals(response.getStatusCode(), 201);

    }

 /*   @Test
    public void verifyPostMethod() throws JSONException,InterruptedException {

        //Initializing Rest API's URL
        String APIUrl = "https://reqres.in/api/users/2";

        //Initializing payload or API body
        String APIBody = "{\"name\":\"Tracey\",\"job\":\"zion resident\"}"; //e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"

        // Building request using requestSpecBuilder
        RequestSpecBuilder builder = new RequestSpecBuilder();

        //Setting API's body
        builder.setBody(APIBody);

        //Setting content type as application/json or application/xml
        builder.setContentType("text/html; charset=UTF-8");

        RequestSpecification requestSpec = builder.build();

        //Making post request with authentication, leave blank in case there are no credentials- basic("","")
        ResponseModel response = given().authentication().preemptive().basic("", "")
                .spec(requestSpec).when().post(APIUrl);

        JSONObject JSONResponseBody = new JSONObject(response.body().asString());

        //Fetching the desired value of a parameter
        // String result = JSONResponseBody.getString({key});


        //Asserting that result of Norway is Oslo
        Assert.assertEquals(response.getStatusCode(), 201);

    } */


 @Test
    public void test() throws IOException {



     String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";

//     ObjectMapper objectMapper = new ObjectMapper();
//
//     Car car = objectMapper.readValue(json, Car.class);

     Car obj = new Gson().fromJson(json, Car.class);

 }

   public class Car {

        private String color;
        private String type;

        // standard getters setters


        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
