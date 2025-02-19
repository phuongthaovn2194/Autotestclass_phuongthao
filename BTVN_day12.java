package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURL;

public class BTVN_day12 extends CommonBase{
	@BeforeMethod
	public void openBrowser()
	{
		driver = initBrowser(CT_PageURL.URL_GLOBALSQ);
	}
	@Test
	public void chooseVNOption() {
		Select dropdownCourse = new Select(driver.findElement(By.xpath("//select")));
		System.out.println("Số lựa chọn của dropdownlist là: " + dropdownCourse.getOptions().size());
		dropdownCourse.selectByContainsVisibleText("Viet Nam");
		String textAfterSelect = dropdownCourse.getFirstSelectedOption().getText();
		System.out.println("Text is: "+textAfterSelect);
		
		System.out.println("Is multiple: "+ dropdownCourse.isMultiple());
	}

}
