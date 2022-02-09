package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class StepDefinition{
    @Given("Launch google {string}")
    public void launch_google(String url){
        System.out.println("Google launched and the url is :->"+url);
    }
    @When("Search the text")
    public void search_the_text(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> data =dataTable.asLists();
        System.out.println("Searched text is "+data.get(0).get(1));
    }
    @When("Enter username and password for Facebook")
    public void enter_username_and_password_for_facebook(DataTable dataTable) {
       List<Map<String,String>> data=dataTable.asMaps();
        System.out.println("Username is :->"+data.get(0).get("username")+" And password is :->"+data.get(0).get("password"));
    }
    @When("Enter username and password for Gmail")
    public void enter_username_and_password_for_gmail(DataTable dataTable) {
        List<Map<String,String>> data=dataTable.asMaps();
        System.out.println("Username is :->"+data.get(0).get("username")+" And password is :->"+data.get(0).get("password"));
    }

}
