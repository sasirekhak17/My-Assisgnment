package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
        driver.findElement(By.className("decorativeSubmit")).click();		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("ABC Account Corporation");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("New Jersey");
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("123000000");
		
		WebElement Industry=driver.findElement(By.name("industryEnumId"));
		
		Select ind = new Select(Industry);
		ind.selectByVisibleText("Computer Software");
		
		WebElement Ownership=driver.findElement(By.name("ownershipEnumId"));
		
		Select own=new Select(Ownership);
		own.selectByVisibleText("S-Corporation");
		
		WebElement Source=driver.findElement(By.id("dataSourceId"));
		
		Select sou=new Select(Source);
		sou.selectByValue("LEAD_EMPLOYEE");
		
		WebElement MarketingCampaign=driver.findElement(By.id("marketingCampaignId"));
		
		Select mark=new Select(MarketingCampaign);
		mark.selectByIndex(6);
		
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
	    
		Select state = new Select(stateElement);
		state.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		
			
		
	}

}
