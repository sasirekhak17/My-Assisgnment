package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
				
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Leads")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys BPM Ltd");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasirekha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sassi");
		
		driver.findElement(By.id("createLeadForm_depratmentName")).sendKeys("Process Trainer");
		
		driver.findElement(By.id("createLeadForm_descriptionOfDepartment")).sendKeys("Providing training to new joiners and process training for all");
		
		driver.findElement(By.id("createLeadForm_emailId")).sendKeys("Sasirekha.k17@gmail.com");
		
		WebElement stateSelection=driver.findElement(By.name("generalStateProvinceGeoId"));
		
		Select select =new Select(stateSelection);
		
		select.selectByVisibleText("Newyork");
		
		driver.findElement(By.className("submitButton")).click();
	}

}
