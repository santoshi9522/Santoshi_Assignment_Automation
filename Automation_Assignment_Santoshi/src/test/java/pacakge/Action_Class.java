package pacakge;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pacakge.Main_Class; 

public class Action_Class 

{

WebDriver d;
	
	public Action_Class (WebDriver d)
	{
		this.d = d;
		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"twotabsearchtextbox\"]")
	public WebElement searchProductBox;
	
	public void search()
	{
		searchProductBox.click();
		searchProductBox.sendKeys("ld345tsxslfer");
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-search-submit-button\"]")
     public WebElement searchButtonElement;
	
	public void button()
	{
		searchButtonElement.click();
	}
	
	@FindBy (how=How.XPATH,using="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	public WebElement selectProduct;
	
	public void searchAgain()
	{
		searchProductBox.clear();
		searchProductBox.click();
		searchProductBox.sendKeys("Laptop");
	}

	@FindBy (how=How.XPATH,using="//*[@id=\"a-autoid-4-announce\"]")
	public WebElement cartAdd;
	
	public void productSelect()
	{
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView()", selectProduct);	
	}
	public void addToCart()
	{
		cartAdd.click();
	}
	
	@FindBy (how=How.XPATH,using="//*[@id=\"ewc-compact-actions-container\"]/div/div[2]/span/span/a")
	public WebElement cart;	
		
	public void GotoCart()
	{
		cart.click();
	}
	
	@FindBy (how=How.XPATH,using="//*[@id=\"quantity\"]")
	public WebElement qty;
	
	public void updateQuantity()
	{
		Select d = new Select (qty);
		d.selectByVisibleText("2");
	}
		@FindBy (how=How.XPATH,using= "//input[@type='submit']")
		public WebElement rmv;
		
		public void removeProduct()
		{
			rmv.click();
			
			
			
	}
		

}
