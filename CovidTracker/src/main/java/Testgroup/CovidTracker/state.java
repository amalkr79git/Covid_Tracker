package Testgroup.CovidTracker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class state {
	
	public static void stateSelector(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	
	WebElement stateDropdown = driver.findElement(By.xpath("//div[@class='data-container']//select[@class='data-filter-input']"));
	//stateDropdown.click();
	Select selectState = new Select(stateDropdown);
    
    // Select the option by value
    selectState.selectByValue("Kerala");
	}

}
