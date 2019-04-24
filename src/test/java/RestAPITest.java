
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

public class RestAPITest {
    @DataProvider(name = "getData", parallel = true)
    public Object[][] getData()
    {
        return new Object[][]{{"norway", "Oslo"}, {"france", "Paris"}, {"ukraine", "Kiev"}, {"poland", "Warsaw"}};
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
        Response response = given().authentication().preemptive().basic("", "")
                .spec(requestSpec).when().post(APIUrl);

        JSONObject JSONResponseBody = new JSONObject(response.body().asString());

        //Fetching the desired value of a parameter
        // String result = JSONResponseBody.getString({key});


        //Asserting that result of Norway is Oslo
        Assert.assertEquals(response.getStatusCode(), 201);

    } */
}
