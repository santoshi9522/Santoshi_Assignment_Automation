package pacakge;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pacakge.Action_Class;

public class Main_Class 
{

public WebDriver d;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notification");
		d = new ChromeDriver(opt);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));		
		
      
	}
	
	@Test (priority=1)
	  public void launchsite()
	  {
		  d.get("https://www.amazon.in/");
		  d.manage().window().maximize();	
		  
	  }
       
       @Test (priority=2)
       public void amazon()
       {
    	   Action_Class t = new Action_Class (d);
    	      t.search();
    	      t.button();
    	      t.searchAgain();
    	      t.button();
    	      t.productSelect();       
    	      t.addToCart();
    	      t.GotoCart();
    	      t.updateQuantity();
    	      t.removeProduct();
    	       
       }    
       
       @Test (priority=3)
       public void Close()
       {
    	   d.close();
       }

}
