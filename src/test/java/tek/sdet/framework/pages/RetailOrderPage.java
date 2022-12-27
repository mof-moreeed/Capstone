package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
				
	}
	
	@FindBy(xpath="//img[@class='order__item-img']")
	public WebElement firstOrderItem;
	
	@FindBy(id="cancelBtn")
	public WebElement cancelButton;
	
	@FindBy(id="reasonInput")
	public WebElement reasonDropDown;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrderFinalButton;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelationMessage;
	
	@FindBy(id="returnBtn")
	public WebElement returnButton;
	
	@FindBy(id="dropOffInput")
	public WebElement dropOffDropDown;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement returnOrderFinalButton;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfullMessage;
	
	@FindBy(id="reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(id="headlineInput")
	public WebElement reviewHeadlineInput;
	
	@FindBy(id="descriptionInput")
	public WebElement reviewDescriptionInput;
	
	@FindBy(xpath="//div[text()=\"Your review was added successfully\"]")
	public WebElement reviewAddedMessage;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement addYourReviewButton;
	
	
	
	
	
	
	
	

}
