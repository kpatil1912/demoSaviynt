package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil\\Desktop\\chromedriver-win64\\chromedriver.exe");
		
		//Creating WebDriver instance
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");
		
		
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Navigate to web page
		driver.get("https://saviynt.com/careers");
		
		//Maximizing window
		driver.manage().window().maximize();
		
		//Retrieving web page title
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		//Locating web element
		WebElement declineCookies = driver.findElement(By.id("hs-eu-decline-button"));
		//Performing actions on web elements
		declineCookies.click();
		//Thread.sleep(2000);
		WebElement careersLink = driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_module_17152985653065\"]/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/a/span"));
		careersLink.click();
		/*
		 * WebElement searchBox = driver.findElement(By.id("lever-jobs-search"));
		 * searchBox.click(); searchBox.sendKeys("Senior Engineer SDET");
		 * searchBox.sendKeys(Keys.ENTER);
		 
		WebElement jobLink = driver.findElement(By.xpath("//a[@class='lever-job-title' and text()='Senior Engineer SDET, Quality Engineering']"));
		jobLink.click();
		*/
		
		// Find the link by its exact text
        WebElement jobLink = driver.findElement(By.xpath("//*[@id=\"lever-jobs-container\"]/section[6]/ul[3]/li/ul/li[5]/a "));
        // Scroll down to the element using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", jobLink);

        // Click the element
        jobLink.click();
        
        WebElement applyToJob = driver.findElement(By.xpath("//a[text()='Apply for this job']"));
        applyToJob.click();
        
        WebElement name = driver.findElement((By.name("name")));
        name.sendKeys("Kapil Vasant Patil");
        
        WebElement checkbox = driver.findElement(By.cssSelector("input[name='pronouns'][value='He/him']"));
        checkbox.click();
        
        WebElement email = driver.findElement((By.name("email")));
        email.sendKeys("kapil.unex@gmail.com");

        WebElement phone = driver.findElement((By.name("phone")));
        phone.sendKeys("7039015647");

		/*
		 * WebElement location = driver.findElement((By.name("location")));
		 * location.sendKeys("Fontana, CA, US");
		 */
        
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.className("card-field-input")); // Check and interact
		 * with specific elements by index if (elements.size() > 0) { WebElement
		 * secondElement = elements.get(1);
		 * secondElement.sendKeys("Kapil Vasant Patil"); WebElement thirdElement =
		 * elements.get(2);
		 * thirdElement.sendKeys("15117 ridge lane unit 1, fontana, CA 92336");
		 * WebElement sixthElement = elements.get(5); sixthElement.sendKeys("140000");
		 * WebElement seventhElement = elements.get(6);
		 * seventhElement.sendKeys("Kapil Vasant Patil"); WebElement eightElement =
		 * elements.get(7); eightElement.sendKeys("6 years"); WebElement nineElement =
		 * elements.get(8); nineElement.sendKeys("4 years"); WebElement tenthElement =
		 * elements.get(9); tenthElement.sendKeys("N/A"); } else {
		 * System.out.println("No elements found with the class 'card-field-input'"); }
		 */
        // Find the link by its exact text
        WebElement submit = driver.findElement(By.id("btn-submit"));
        // Scroll down to the element using JavaScript
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView(true);", submit);

        submit.click();
        System.out.println("Script execution complete");
        
        driver.quit();
		


	}

}
