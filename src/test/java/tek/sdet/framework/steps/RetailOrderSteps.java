package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().ordersOption);
		logger.info("User clicked on Orders section");
	}
	
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstOrderItem);
		logger.info("User clicked on first order in list");

	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelButton);
		logger.info("User click on Cancel The Order button");
	   
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.orderPage().reasonDropDown, reason);
		logger.info("User selected the cancelation Reason: " + reason);
	  
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderFinalButton);
		logger.info("User clicked on Cancel Order button");
	    
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String expectedMessage) {
		if (expectedMessage.contains("Your Order Has Been Cancelled")) {
		Assert.assertEquals(expectedMessage, factory.orderPage().orderCancelationMessage.getText());
		logger.info("A cancelation message should be displayed as: " + expectedMessage);
		}else if (expectedMessage.contains("Return was successfull")) {
			Assert.assertEquals(expectedMessage, factory.orderPage().returnWasSuccessfullMessage.getText());
			logger.info("A cancelation message should be displayed as: " + expectedMessage);
		}
	   
	}
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnButton);
		logger.info("User clicked on Return Items button");
	
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
			selectByVisibleText(factory.orderPage().reasonDropDown, reason);
			logger.info("User selected the cancelation Reason: " + reason);
	    
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffLocation) {
		selectByVisibleText(factory.orderPage().dropOffDropDown, dropOffLocation);
		logger.info("User selected the drop off service as: " + dropOffLocation);
		
	    
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderFinalButton);
		logger.info("User click on Return Order button");
	   
	}
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("User clicked on Review button");
	   
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String body) {
		sendText(factory.orderPage().reviewHeadlineInput, headline);
		sendText(factory.orderPage().reviewDescriptionInput, body);
		logger.info("\"User write Review headline as " + headline + "and descriptoion as" + body);
		
	    
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReviewButton);
		logger.info("User click Add your Review button");
	   
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.orderPage().reviewAddedMessage);
		Assert.assertEquals(factory.orderPage().reviewAddedMessage.getText(), expectedMessage);
		logger.info("a review message should be displayed " + expectedMessage);
		
	  
	}






	

}
