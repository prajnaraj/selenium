package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.TestBase;

public class HomePage extends TestBase{

	WebDriver driver;
	String searchKey ="IPhone";
	By cart = By.cssSelector("#nav-cart-count");
	By returnOrders =By.cssSelector("#nav-orders");
	By search =By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void searchKeyword() 	
	{ 		
		
		driver.findElement(search).sendKeys(searchKey); 	
	}
	
	public void clickCartButton() 
	{ 		
		driver.findElement(cart).click(); 
	}  
	
	public void clickReturnOrder() 	
	{ 		
		driver.findElement(returnOrders).click(); 
		} 
	}
	


