package step_Defs;

import io.cucumber.java.en.Then;
import org.json.JSONArray;
import org.junit.Assert;
import actions.Facts;

public class FactsStepDefinitions extends Facts {

    @Then("verify that each fact has min than {int} characters")
    public void verifyEachFactHasMinCharacter(int expectedMaximumLength) {
        JSONArray dataJsonArray=responseBodyJson.getJSONArray("data");
        boolean flag=true;
        for (int i = 0; i < dataJsonArray.length(); i++) {
            if(dataJsonArray.getJSONObject(i).length()>expectedMaximumLength) {
                flag=false;
                break;
            }
        }
        Assert.assertTrue(flag);
    }

    @Then("verify that the returned facts has min than {int} characters")
    public void verifyReturnedRandomHasMinCharacter(int expectedMaximumLength) {
        Assert.assertTrue(responseJsonPath.getString("fact").length()<=expectedMaximumLength);
        Assert.assertTrue(responseBodyJson.getString("fact").length()<=expectedMaximumLength);
        logger.info("The min character is verified");
    }



}
