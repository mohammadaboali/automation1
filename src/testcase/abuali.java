package testcase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class abuali extends mydata {
	WebDriver  driver = new EdgeDriver();
	String website = "https://automationteststore.com";
	
	@BeforeTest
	public void mysetup () {
		driver.get(website);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
	}
	@Test(priority = 1)
	public void signup() throws InterruptedException  {
driver.navigate().to("https://automationteststore.com/index.php?rt=account/create");	
WebElement firstnamelogin=driver.findElement(By.id("AccountFrm_firstname"));
WebElement lastnamelogin=driver.findElement(By.id("AccountFrm_lastname"));
WebElement email=driver.findElement(By.id("AccountFrm_email"));
WebElement telephone=driver.findElement(By.id("AccountFrm_telephone"));
WebElement fax=driver.findElement(By.id("AccountFrm_fax"));
WebElement adress=driver.findElement(By.id("AccountFrm_address_1"));
WebElement country=driver.findElement(By.id("AccountFrm_country_id"));
WebElement city=driver.findElement(By.id("AccountFrm_zone_id"));
WebElement signcity=driver.findElement(By.id("AccountFrm_city"));
WebElement zip=driver.findElement(By.id("AccountFrm_postcode"));
WebElement loginname=driver.findElement(By.id("AccountFrm_loginname"));
WebElement password=driver.findElement(By.id("AccountFrm_password"));
WebElement confirmpassword=driver.findElement(By.id("AccountFrm_confirm"));
WebElement check=driver.findElement(By.id("AccountFrm_agree"));
WebElement CountinueButton = driver.findElement(By.xpath("//button[@title='Continue']"));


















firstnamelogin.sendKeys(thefirstname);
lastnamelogin.sendKeys(thelasttname);
email.sendKeys(theemail);
telephone.sendKeys(thetelephone);
fax.sendKeys(thefax);
adress.sendKeys(theadress);
Select selectorcountry = new Select(country);
selectorcountry.selectByIndex(rancountry);
Thread.sleep(Duration.ofSeconds(3));
Select selectorcity = new Select(city);
selectorcity.selectByIndex(rancity);
List<WebElement>listofcity=selectorcity.getOptions();
String thecity=listofcity.get(rancity).getText();
signcity.sendKeys(thecity);
zip.sendKeys(thezip);
loginname.sendKeys(theloginname);
password.sendKeys(thepassword);
confirmpassword.sendKeys(thepassword);
check.click();
CountinueButton.click();

String actualmessage= driver.findElement(By.className("maintext")).getText();
System.out.print(actualmessage);
Assert.assertEquals(actualmessage, expectedmessage);
	
	
	














	}
	@Test(priority = 2)
	public void logout () {
	WebElement logoutbutton =	driver.findElement(By.linkText("Logoff"));
	logoutbutton.click();
	
		
String	thesource=driver.getPageSource();
Boolean actualresult =thesource.contains("You have been logged off your account. It is now safe to leave the computer.");
Assert.assertEquals(true,actualresult );

	
	
}
	@Test(priority = 3)
	public void login () throws InterruptedException {
driver.navigate().to("https://automationteststore.com/index.php?rt=account/login");			
WebElement thelogin = driver.findElement(By.id("loginFrm_loginname"));
thelogin.sendKeys(theloginname);
WebElement thefpassword = driver.findElement(By.id("loginFrm_password"));
thefpassword.sendKeys(thepassword);
WebElement loginbutton= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
loginbutton.click();





	}
	@Test(priority = 4)
	public void addtocart() {
		driver.navigate().to(website);
		List <WebElement> products = driver.findElements(By.className("prdocutname"));
		int ranproduct = rand.nextInt(products.size());
		products.get(ranproduct).click();
		
		
		
	}
	
	@ Test 
	public void hello ()
	{
		System.out.print("hello");
	}
}






	
	
	
	


