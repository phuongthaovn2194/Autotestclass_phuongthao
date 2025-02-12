package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;

public class Baitapthuchanh_day8  extends CommonBase {

    @BeforeMethod
    public void openBrowserTest() {
        driver = initBrowser("https://selectorshub.com/xpath-practice-page/");
    }

    // Locate bằng ID
    @Test
    public void locateById() {
        WebElement userEmail = driver.findElement(By.id("shub27"));
        System.out.println("User Email Element (ID): " + userEmail);

        WebElement password = driver.findElement(By.id("pass"));
        System.out.println("Password Element (ID): " + password);
    }

    // Locate bằng Name
    @Test
    public void locateByName() {
        WebElement userEmail = driver.findElement(By.name("email"));
        System.out.println("User Email Element (Name): " + userEmail);

        WebElement password = driver.findElement(By.name("Password"));
        System.out.println("Password Element (Name): " + password);

        WebElement company = driver.findElement(By.name("company"));
        System.out.println("Company Element (Name): " + company);

        WebElement mobileNumber = driver.findElement(By.name("mobile number"));
        System.out.println("Mobile Number Element (Name): " + mobileNumber);
    }

    // Locate bằng Class Name
    @Test
    public void locateByClassName() {
        WebElement company = driver.findElement(By.className("form-control"));
        System.out.println("Company Element (Class Name): " + company);

        WebElement mobileNumber = driver.findElement(By.className("form-control"));
        System.out.println("Mobile Number Element (Class Name): " + mobileNumber);
        
        WebElement password = driver.findElement(By.className("selectors-input jsSelector"));
        System.out.println("password Element (Class Name): " + password);
    }
}
