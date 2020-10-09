package stepDefinition;

import java.io.IOException;

import covid.base.driverFactory;
import covid.pages.IndiaLink;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IndiaTest extends driverFactory {
	
	public IndiaTest() throws IOException {
		super();
	}
	
	public IndiaLink india;
	
	@Before
	public void setUptest() throws IOException {
		
		startBrowser();
		india = new IndiaLink();
	}
	
	@Given("^Click India link$")
	public void click_India_link() throws Throwable {
	    india.clickIndiaLink();
	}

	@When("^get the confirmed case count$")
	public void get_the_confirmed_case_count() throws Throwable {
		india.confirmedCase();
	}

	@When("^get the active case count$")
	public void get_the_active_case_count() throws Throwable {
		india.activeCase();
	}

	@When("^get the recovered case count$")
	public void get_the_recovered_case_count() throws Throwable {
		india.recoveredCase();
	}

	@Then("^get the deceased case count$")
	public void get_the_deceased_case_count() throws Throwable {
		india.deceasedCase();
	}
	
	@After
	public void teardowntest() throws IOException {
		
		driver.quit();
	}

}
