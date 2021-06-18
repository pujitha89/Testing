package stepDefinition;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinitionTable {
	@Before("@SmokeTest")
	public void browserstart()
	{
		System.out.println("browser started");
	}
		@Given("^user should navigate to current url$")
	    public void user_should_navigate_to_current_url() throws Throwable {
	      
	    }
	
	    @When("^user signup with entering follwing details$")
	    public void user_signup_with_entering_follwing_details(DataTable data) throws Throwable {
	    	List<List<String>>obj=data.asLists();
	       System.out.println(obj.get(0).get(0));
	       System.out.println(obj.get(0).get(1));
	       System.out.println(obj.get(0).get(2));
	       System.out.println(obj.get(0).get(3));
	       
	    }
	   
	    @Then("^user should see the homepage succesfully$")
	    public void user_should_see_the_homepage_succesfully() throws Throwable {
	        
	    }
	    @After("@SmokeTest")
	    public void browserquit()
	    {
	    	System.out.println("browser quit");
	    }

}
