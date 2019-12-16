package koti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SalesforceLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kyaddala\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		String handle= driver.getWindowHandle();
		System.out.println(handle);
		WebElement link=driver.findElement(By.xpath("//a[text()='Try for Free']"));
		link.click();
		//Thread.sleep(500);
		String handle1= driver.getWindowHandle();
		System.out.println(handle1);
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='UserFirstName']"));
		FirstName.sendKeys("koteswararao");
		WebElement LastName=driver.findElement(By.xpath("//input[@name='UserLastName']"));
		LastName.sendKeys("Yaddala");		
		WebElement WorkEmail=driver.findElement(By.xpath("//input[@name='UserEmail']"));
		WorkEmail.sendKeys("Koti.yaddala@gmail.com");	
		WebElement Phone=driver.findElement(By.xpath("//input[@name='UserPhone']"));
		Phone.sendKeys("9886958256");
		WebElement Company=driver.findElement(By.xpath("//input[@name='CompanyName']"));
		Company.clear();
		Company.sendKeys("Capgemini Ind Pvt Ltd");
		Select JobTittle=new Select(driver.findElement(By.name("UserTitle")));
		JobTittle.selectByVisibleText("Sales Manager");
		Select Employees=new Select(driver.findElement(By.name("CompanyEmployees")));
		Employees.selectByVisibleText("1 - 15 employees");
		WebElement CheckBox=driver.findElement(By.xpath("//div[@class='checkbox-ui']"));
		CheckBox.click();
		//WebElement TermsCoditionLink=driver.findElement(By.xpath("//a[contains(text(),'Master')]"));
		//TermsCoditionLink.click();
		Thread.sleep(1000);
		//driver.navigate().back();
		//Drop down selection code
		WebElement Submit=driver.findElement(By.xpath("//button[@name='Start free trial']"));
		Submit.click();
		
		
		
		
		
		
		
		
		
		
		//WebElement link2=driver.findElement(By.xpath("//button[@type='submit']"));
		//link2.click();
		
		
		

	}

}
