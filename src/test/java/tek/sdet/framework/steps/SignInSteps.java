package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	
    @When ("User click on Sign in option")
    public void userClicksOnSignInOption() {
    	click(factory.homePage().signIn);
    	logger.info("User clicks on Sign In option");
    }
    	
    @And ("User enters email {string} and password {string}")
    public void userEntersEmailAndPassword(String email, String password) {
    	sendText(factory.signInPage().emailField, email);    
    	sendText(factory.signInPage().passwordField, password);
    	logger.info("User entered email" + email + " and passowrd" + password);
    //	slowDown();
    }
    
    @And ("User clicks on login button")
    public void clickOnLogIn() {
    	click(factory.signInPage().logInButton);
    	logger.info("User clicked on log in button");
    //	slowDown();
    }
    
    @Then ("User should be logged in into Account")
    public void userShouldBeLoggedIn() {
    	Assert.assertTrue(isElementDisplayed(factory.homePage().account));
    	logger.info("User Successfully logged in.");
    //	slowDown();	   	
    }
    
    @And("User click on Create New Account button")
    public void userClickOnCreateNewAccountButton() {
    	click(factory.signInPage().newAccountButton);
    	logger.info("User clicks on create new account button");
    	
    }
    
    @And("User fill the signUp information with below data")
    public void userFillTheSignUpInformationWithBelowData(DataTable data) {
    	List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
    	sendText(factory.signInPage().nameInput, signUpData.get(0).get("name"));
    	sendText(factory.signInPage().emailInput, signUpData.get(0).get("email"));
    	sendText(factory.signInPage().passwordInput, signUpData.get(0).get("password"));
    	sendText(factory.signInPage().confirmPasswordInput, signUpData.get(0).get("confirmPassword"));
    	logger.info("User entered required information into sign up form");
    	//slowDown();
    }
    
    @And("User click on SignUp button")
    public void userClickOnSignUpButton() {
    	click(factory.signInPage().signUpButton);
    	logger.info("User clicked on sign up button.");
    	
    }
    
    @Then("User should be logged into account page")
    public void userShouldBeLoggedIntoAccountPage() {
    	Assert.assertTrue(isElementDisplayed(factory.homePage().account));
    	logger.info("Account was created");
    //	slowDown();
    	
    }
  
}
