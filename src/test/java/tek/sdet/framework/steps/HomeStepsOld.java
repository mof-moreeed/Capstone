package tek.sdet.framework.steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeStepsOld extends CommonUtility{
	//All your step definitions classes will extend 'CommonUtility' class.
	// We need to create object of POMFactory class.
	// POMFactory instance should be on top of the class.
	
	POMFactory factory = new POMFactory();
	
/*	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle(); //We wrote getTitle method in CommonUtility.
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
			
	}
	
	@Then("User verify retail page logo is present")
	public void userVerifiesRetailPageLogoIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
		logger.info("logo is present");
	}
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
	    selectByVisibleText(factory.homePage().allDepartments, value);
	    logger.info(value + " was selected from the drop down");
	   
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
	    sendText(factory.homePage().searchInputfield, value);
	    logger.info("User entered" + value);
	  
	}
	@When("User clicks on Search icon")
	public void userClicksOnSearchIcon() {
	    click(factory.homePage().searchButton);
	    logger.info("user clicked on search button.");
	    
	}
	@Then("Item should be present")
	public void itemShouldBePresent() {
	    Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
	    logger.info("Logo is present");
	    
	}
	
	@When("user clicks on All sections")
	public void userClickOnAllSection() {
		click(factory.homePage().allElement);
		logger.info("User clicks on all sections");
	}

	@Then("User verifies {string} is present")
	public void userVerifiesIsPresent(String value) {
		String expectedValue = value;
		String actualValue = getElementText(factory.homePage().shopByDepartment);
		Assert.assertEquals(expectedValue, actualValue);	
		logger.info(expectedValue + " is present.");
	}
	
	@Then("User verifies cart icon is present")
	public void userVerifiesCartIconIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cart));
		logger.info("Cart icon is present.");
	}
		
	
*/	

}
