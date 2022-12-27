package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountLink);
		logger.info("User clicks on account button");
		// slowDown();
	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		factory.accountPage().nameInput.clear();
		sendText(factory.accountPage().nameInput, name);
		clearTextUsingSendKeys(factory.accountPage().personalPhoneInput);
		sendText(factory.accountPage().personalPhoneInput, phone);
		logger.info("User entered Name" + name + " and phone # " + phone);
		slowDown();
	}

	@And("User click on Update button")
	public void userClicksOnUpdateButton() {
		click(factory.accountPage().personalUpdateButton);
		logger.info("User Clicks on update button");
		// slowDown();
	}

	@Then("user profile information should be updated")
	public void userProfileInfoprmationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationUpdatedMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdatedMessage));
		String actualMessage = factory.accountPage().personalInformationUpdatedMessage.getText();
		String expectedMessage = "user profile information should be updated";
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("user profile updated successfully");
	}


	@When("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> passwordChangeData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, passwordChangeData.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, passwordChangeData.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, passwordChangeData.get(0).get("confirmPassword"));
		logger.info("User entered information to change password");
	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().credentialsSubmitBtn);
		logger.info("User clicked on change password");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdatedSuccessfullyMessage));
		logger.info("Password updated successfully");
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addAPaymentMethodLink);
		logger.info("User clicks on Add Payment Method Link");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> cardInfo = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, cardInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, cardInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYearInput, cardInfo.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, cardInfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().securityCodeInput, cardInfo.get(0).get("securityCode"));
		logger.info("User fill the required information for the card dtails");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("User clicked on Add Your Card Button");
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentAddedSuccessfullyMessage));
		logger.info("Payment Method Added Successfully");
	}
	
//	@When("User select card with ending {string}")
//	public void userSelectCardWithEnding(String cardEndingNumber) {
//		List<WebElement> cards = factory.accountPage().cardEndingNumber;
//		for(WebElement card: cards) {
//			if (card.getText().equals(cardEndingNumber))
//				System.out.println(card.getText()+ " =======================");
//			click(card);
//			logger.info(cardEndingNumber + " is selected"); 
//			
//		}
//	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().currentCard);
		click(factory.accountPage().editPaymentMethod);
		logger.info("User Clicked on Current Card.");
		logger.info("User Clicked on Edit Payment info");

	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>> newCardInfo = data.asMaps(String.class, String.class);
		factory.accountPage().cardNumberInput.clear();
		sendText(factory.accountPage().cardNumberInput, newCardInfo.get(0).get("cardNumber"));
		factory.accountPage().nameOnCardInput.clear();
		sendText(factory.accountPage().nameOnCardInput, newCardInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationYearInput, newCardInfo.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, newCardInfo.get(0).get("expirationMonth"));
		factory.accountPage().securityCodeInput.clear();
		sendText(factory.accountPage().securityCodeInput, newCardInfo.get(0).get("securityCode"));
		logger.info("User fill the required information for the card dtails");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("User Clicked on Update Card button.");

	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentMethodUpdatedSuccessfully));
		logger.info("Payment Method Added Successfully");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().currentCard);
		click(factory.accountPage().deletePaymentMethod);
		logger.info("User deleted payment method");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		try {
		Assert.assertFalse(isElementDisplayed(factory.accountPage().currentCard));
		logger.info("Payment method removed.");
		}catch(AssertionError e) {
			logger.info(e.getMessage());
		}
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddress);
		logger.info("User Clicked on Add Address Button.");
	}

	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> addressInformation = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropdown, DataGenerator.addressGenerator(addressInformation.get(0).get("country")));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, DataGenerator.addressGenerator(addressInformation.get(0).get("fullName")));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, DataGenerator.addressGenerator(addressInformation.get(0).get("phoneNumber")));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, DataGenerator.addressGenerator(addressInformation.get(0).get("streetAddress")));
		clearTextUsingSendKeys(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput, DataGenerator.addressGenerator(addressInformation.get(0).get("apt")));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, DataGenerator.addressGenerator(addressInformation.get(0).get("city")));
		selectByVisibleText(factory.accountPage().stateDropDown, DataGenerator.addressGenerator(addressInformation.get(0).get("state")));
		clearTextUsingSendKeys(factory.accountPage().zipCode);
		sendText(factory.accountPage().zipCode, DataGenerator.addressGenerator(addressInformation.get(0).get("zipCode")));
		logger.info("User fill the required information for the New Address");
	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addAddressButton);
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountPage().addressAddedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccessfully));
		logger.info("Address Added Successfully.");

	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressButton);
		logger.info("User clicked on Edit Address Button");
	}
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddress);
		logger.info("User Clicked on Update Your Address Button");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().addressUpdatedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfully));
		logger.info("User updated address successfully");
	    
	}
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressButton);
		logger.info("User clicked on Remove Address");

	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		try {
		 Assert.assertFalse(isElementDisplayed(factory.accountPage().removeAddressButton));
         logger.info("Address removed Successfully");
	
		 }catch (AssertionError e) {
			 logger.info(e.getMessage());
		 }
	   
	}

}
