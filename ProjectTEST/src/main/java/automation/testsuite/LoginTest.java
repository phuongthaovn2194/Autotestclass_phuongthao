package automation.testsuite;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class LoginTest extends CommonBase{
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
	}
	
	@Test
	public void locateById()
	{
		WebElement textUsername = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("Username Element is: " +textUsername);
		
		WebElement textPassword = driver.findElement(By.id("txtLoginPassword"));
		System.out.println("Password Element is: " +textPassword);
	}
	
	@Test
	public void locateByName()
	{
		WebElement textUsername = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("Username Element is: " +textUsername);
		
		WebElement textPassword = driver.findElement(By.id("txtLoginPassword"));
		System.out.println("Password Element is: " +textPassword);
	}
	
	@Test
	public void locateByClassName()
	{

		WebElement btnFaceBook = driver.findElement(By.className("btn_face"));
		System.out.println("Button facebook element is: " +btnFaceBook);
		
	}
	
	@Test
	public void locateByLinkText()
	{
		WebElement linkForgotPass = driver.findElement(By.linkText("Quên mật khẩu?"));
		System.out.println("Link forgot password is: "+linkForgotPass);
		
		WebElement linkGiangVien = driver.findElement(By.partialLinkText("giảng viên"));
		System.out.println("Link login for trainer is: "+linkGiangVien);
	}
	
	@Test
	public void locateByTagName()
	{
		WebElement textInput = driver.findElement(By.tagName("input"));
		System.out.println("Link forgot password is: "+ textInput);
	}
}
