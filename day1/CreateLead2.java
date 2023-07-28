package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		
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
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing Assignment");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sasirekha.k17@gmail.com");
		
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select options=new Select(stateProvince);
		
		options.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Tired");
		
		driver.findElement(By.name("submitButton")).click();
		
			
		
		

	}

}
