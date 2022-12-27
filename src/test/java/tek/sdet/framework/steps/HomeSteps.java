package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
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
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().searchInputfield, string);
		logger.info("User entered" + string);

	}

	@When("User click on Search icon")
	public void userClicksOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("user clicked on search button.");

	}

	@Then("Item should be present")
	public void itemShouldBePresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logo));
		logger.info("Logo is present");

	}

	@When("User click on All section")
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

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
		List<List<String>> shopByDepartment = data.asLists(String.class);
		for(int i = 0; i<shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" +shopByDepartment.get(0).get(i)+"']"))));
			logger.info(shopByDepartment.get(0).get(i) + " is present.");
		}

	}
	
	@When("User is on {string}")
	public void userOnElectronics(String department) {
		
//		getDriver().findElement((By.xpath("//span[text()='"+department+"']"))).click();
		
		List<WebElement> dept = factory.homePage().sideBar;
		for(WebElement element: dept) {
			if(element.getText().equalsIgnoreCase(department)) {
				element.click();
				break;
			}
		}
	}
	
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable data) {
		List<List<String>> departmentOptions = data.asLists(String.class);
		Assert.assertTrue(getDriver().findElement(By.xpath("//span[text()='" + departmentOptions.get(0).get(0)+"']")).isDisplayed());
		Assert.assertTrue(getDriver().findElement(By.xpath("//span[text()='" + departmentOptions.get(0).get(1)+"']")).isDisplayed());
		
	   
	}

	@When("User click on item")
	public void userClickOnItem() {
		waitTillPresence(factory.homePage().product);
		click(factory.homePage().product);
		logger.info("User clicked on item.");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String value) {
		selectByVisibleText(factory.homePage().quantityDropDown, value);
		logger.info("User selected" + value + " as quanitity.");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartButton);
		logger.info("User clicked Add to Cart button.");

	}

	@And("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String value) {
		String expectedValue = value;
		String actualValue = factory.homePage().cartQuantity.getText();
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("The cart icon quantity should change to " + value);

	}

	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		slowDown();
		click(factory.homePage().addPaymentButton);
		logger.info("User clicked Add a credit card or Debit Card for Payment method");
	}

	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		slowDown();
		click(factory.homePage().placeOrderBtn);
		logger.info("User click on Place Your Order");
		
	}

	@And("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfully));
		logger.info("a message should be displayed ‘Order Placed, Thanks’");
		
	}
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartButton);
		logger.info("User click on Cart option");
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().proceedButton);
	    logger.info("User click on Proceed to Checkout button");
	}
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.homePage().addAddressButton);
	    logger.info("User click Add a new address link for shipping address");
	}
	
	@When("User change the category to 'Electronics")
	public void userChangeTheCategoryToElectronics() {
		click(factory.homePage().electronics);
		logger.info("User change the category to 'Electronics");
	  
	}
	
	
	

}
