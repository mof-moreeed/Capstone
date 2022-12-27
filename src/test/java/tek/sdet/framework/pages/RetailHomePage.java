package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;
	
	@FindBy(id="search")
	public WebElement allDepartments;
	
	@FindBy(id="searchInput")
	public WebElement searchInputfield;
	
	@FindBy(id= "searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath ="//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;
	
	@FindBy(xpath = "//span[text()='All']")
	public WebElement allElement;
	
	@FindBy(id="contentHeader")
	public WebElement shopByDepartment;
	
	@FindBy(id="cartBtn")
	public WebElement cart;
	
	@FindBy(id="signinLink")
	public WebElement signIn;
	
	@FindBy (id="accountLink")
	public WebElement account;
	
	@FindBy(xpath="//option[text()=\"All departments\"]")
	public WebElement allDepartment;
	
	@FindBy(xpath="//option[text()=\"Electronics\"]")
	public WebElement electronics;
	
	@FindBy(xpath="//option[text()=\"Computers\"]")
	public WebElement computers;
	
	@FindBy(xpath="//option[text()=\"Smart Home\"]")
	public WebElement smartHome;
	
	@FindBy(xpath="//option[text()=\"Sports\"]")
	public WebElement sports;
	
	@FindBy(xpath="//option[text()=\"Automative\"]")
	public WebElement automative;
	
	@FindBy(xpath="//span[text()=\"Electronics\"]")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath="//span[text()=\"Computers\"]")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()=\"Smart Home\"]")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath="//span[text()=\"Sports\"]")
	public WebElement sportsSideBar;
	
	@FindBy(xpath="//span[text()=\"Automative\"]")
	public WebElement automativeSideBar;
	
	@FindBy(css = "div.account__address-single")
    public WebElement addressBar;
	
	@FindBy(xpath="//p[@class='products__name']")
	public WebElement product;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement quantityDropDown;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(xpath="//option[text()=\"1\"]")
	public WebElement quantity1;
	
	@FindBy(xpath="//option[text()=\"2\"]")
	public WebElement quantity2;
	
	@FindBy(xpath="//option[text()=\"3\"]")
	public WebElement quantity3;
	
	@FindBy(xpath="//option[text()=\"4\"]")
	public WebElement quantity4;
	
	@FindBy(xpath="//option[text()=\"5\"]")
	public WebElement quantity5;
	
	@FindBy(xpath="//span[text()=\"Add to Cart\"]")
	public WebElement addToCartButton;
	
	@FindBy(xpath="//span[@id='cartQuantity' and text()=\"5\"]")
	public WebElement cartQuantity5;
	
	@FindBy(xpath="//span[@id='cartQuantity' and text()=\"4\"]")
	public WebElement cartQuantity4;
	
	@FindBy(xpath="//span[@id='cartQuantity' and text()=\"3\"]")
	public WebElement cartQuantity3;
	
	@FindBy(xpath="//span[@id='cartQuantity' and text()=\"2\"]")
	public WebElement cartQuantity2;
	
	@FindBy(xpath="//span[@id='cartQuantity' and text()=\"1\"]")
	public WebElement cartQuantity1;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(id="proceedBtn")
	public WebElement proceedButton;
	
	@FindBy(id="addAddressBtn")
	public WebElement addAddressButton;
	
	@FindBy(xpath= "//button[@class='checkout__payment-btn']")
	public WebElement addPaymentButton;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath="//div[text()=\"Order Placed Successfully\"]")
	public WebElement orderPlacedSuccessfully;
	
	@FindBy(xpath="//p[(text() = \"Apex Legends - 1,000 Apex Coins\")]")
	public WebElement apexLegends;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBar;
	
	@FindBy(id="orderLink")
	public WebElement ordersOption;
	


	
	
	
	
	
	
	
	
	
	
	
}
