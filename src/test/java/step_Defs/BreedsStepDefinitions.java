package step_Defs;

import io.cucumber.java.en.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import actions.Breeds;

public class BreedsStepDefinitions extends Breeds {

    @Then("verify that the {string} value in the {int} index is {string}")
    public void verifyIndexKeyValue( String key,int index, String expectedValue) {
        JSONArray dataJsonArray=responseBodyJson.getJSONArray("data");
        JSONObject breed=dataJsonArray.getJSONObject(index);
        Assert.assertEquals(expectedValue,breed.get(key));
        logger.info("The Expected value is verified");
    }

    @Then("verify that there are {int} object in returned data")
    public void verifyReturnedDataCount(int expectedObjectCount) {
        JSONArray dataJsonArray=responseBodyJson.getJSONArray("data");
        Assert.assertEquals(expectedObjectCount,dataJsonArray.length());
        logger.info("The expected count is verified");
    }
}