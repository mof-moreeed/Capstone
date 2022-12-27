package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "accountLink")
	public WebElement accountLink;

	@FindBy(id= "nameInput")
	public WebElement nameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement personalPhoneInput;

	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;

	@FindBy(css = "h1.account__information-username")
	public WebElement infoUsernameUpdate;
	
	@FindBy(id="previousPasswordInput")
	public WebElement previousPasswordInput;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id= "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement credentialsSubmitBtn;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(xpath="//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement addAPaymentMethodLink;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(xpath ="//option[text()='1']")
	public WebElement january;
	
	@FindBy(xpath ="//option[text()='2']")
	public WebElement february;
	
	@FindBy(xpath ="//option[text()='3']")
	public WebElement march;
	
	@FindBy(xpath ="//option[text()='4']")
	public WebElement april;
	
	@FindBy(xpath ="//option[text()='5']")
	public WebElement may;
	
	@FindBy(xpath ="//option[text()='6']")
	public WebElement june;
	
	@FindBy(xpath ="//option[text()='7']")
	public WebElement july;
	
	@FindBy(xpath ="//option[text()='8']")
	public WebElement august;
	
	@FindBy(xpath ="//option[text()='9']")
	public WebElement September;
	
	@FindBy(xpath ="//option[text()='10']")
	public WebElement october;
	
	@FindBy(xpath ="//option[text()='11']")
	public WebElement november;
	
	@FindBy(xpath ="//option[text()='12']")
	public WebElement december;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(xpath="//option[text()='2022']")
	public WebElement year2022;
	
	@FindBy(xpath="//option[text()='2023']")
	public WebElement year2023;
	
	@FindBy(xpath="//option[text()='2024']")
	public WebElement year2024;
	
	@FindBy(xpath="//option[text()='2025']")
	public WebElement year2025;
	
	@FindBy(xpath="//option[text()='2026']")
	public WebElement year2026;
	
	@FindBy(xpath="//option[text()='2027']")
	public WebElement year2027;
	
	@FindBy(xpath="//option[text()='2028']")
	public WebElement year2028;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath="//p[@class='account__payment-sub-title']")
	public WebElement currentCard;
	
	@FindBy(xpath="//button[@class='text-blue-800 cursor-pointer hover:underline'][1]")
	public WebElement editPaymentMethod;
	
	@FindBy(xpath="//button[@class='text-blue-800 cursor-pointer hover:underline'][2]")
	public WebElement deletePaymentMethod;
	
	@FindBy(xpath="//button[text()=\"Update Your Card\"]")
	public WebElement updateYourCardButton;
	
	@FindBy(xpath="//div[@class='account__address-new-wrapper']")
	public WebElement addAddress;
	
	@FindBy(xpath="//div[text()=\"Personal Information Updated Successfully\"]")
    public WebElement personalInformationUpdatedMessage;
	
	@FindBy(xpath="//div[text()=\"Password Updated Successfully\"]")
	public WebElement passwordUpdatedSuccessfullyMessage;
	
	@FindBy(xpath="//div[text()=\"Payment Method added sucessfully\"]")
	public WebElement paymentAddedSuccessfullyMessage;
	
	@FindBy(xpath="//div[text()=\"Payment Method updated Successfully\"]")
	public WebElement PaymentMethodUpdatedSuccessfully;
	
	@FindBy(id="countryDropdown")
	public WebElement countryDropdown;
	
	@FindBy(xpath="//option[text()=\"United States\"]")
	public WebElement countryUnitedStates;
	
	@FindBy(id="fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id="streetInput")
	public WebElement streetInput;
	
	@FindBy(id="apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id="cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement stateDropDown;
	
	@FindBy(xpath="//option[text()=\"California\"]")
	public WebElement california;
	
	@FindBy(id="zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(id="addressBtn")
	public WebElement addAddressButton;
	
	@FindBy(xpath="//div[text()=\"Address Added Successfully\"]")
	public WebElement addressAddedSuccessfully;
	
	@FindBy(xpath="//button[@class='account__address-btn' and text()=\"Edit\"]")
	public WebElement editAddressButton;
	
	@FindBy(xpath="//button[text()=\"Update Your Address\"]")
	public WebElement updateYourAddress;
	

	@FindBy(xpath="//div[text()=\"Address Updated Successfully\"]")
	public WebElement addressUpdatedSuccessfully;
	
	@FindBy(xpath="//button[@class='account__address-btn' and text()=\"Remove\"]")
	public WebElement removeAddressButton;
	
	@FindBy(css = "div.account__address-single")
    public WebElement addressBar;
	
	@FindBy(xpath="//div[@class='account__payment-sub']/p")
	public WebElement cardEndingNumber;
	
	
	
	
	
	
	
	
	
	
	
	

}
