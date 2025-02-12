package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;

public class Baitapvenha2_day8 extends CommonBase {

	 @BeforeMethod
	    public void openBrowserTest() {
	        driver = initBrowser("https://automationfc.github.io/basic-form/index.html");
	    }

	    // Locate bằng ID
	    @Test
	    public void locateById() {
	        WebElement name = driver.findElement(By.id("name"));
	        System.out.println("Name Element (ID): " + name);

	        WebElement address = driver.findElement(By.id("address"));
	        System.out.println("Address Element (ID): " + address);

	        WebElement email = driver.findElement(By.id("email"));
	        System.out.println("Email Element (ID): " + email);

	        WebElement password = driver.findElement(By.id("password"));
	        System.out.println("Password Element (ID): " + password);
	    }

	    // Locate bằng Name
	    @Test
	    public void locateByName() {
	        WebElement name = driver.findElement(By.name("name"));
	        System.out.println("Name Element (Name): " + name);

	        WebElement address = driver.findElement(By.name("address"));
	        System.out.println("Address Element (Name): " + address);

	        WebElement email = driver.findElement(By.name("email"));
	        System.out.println("Email Element (Name): " + email);

	        WebElement password = driver.findElement(By.name("password"));
	        System.out.println("Password Element (Name): " + password);
	    }
}
