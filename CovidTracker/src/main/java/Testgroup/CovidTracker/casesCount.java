package Testgroup.CovidTracker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class casesCount {
	
	
	public static void caseCount(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement cases = driver.findElement(By.xpath("//div[@class='display-data']"));
        
        List<WebElement> pTags = cases.findElements(By.tagName("p"));

        for (WebElement pTag : pTags) {
        	
            String text = pTag.getText();
            
            // Split the text into label and number
            String[] parts = text.split(":");
            if (parts.length == 2) {
                String label = parts[0].trim();  
                String number = parts[1].trim();
                
                // Print the label and the number
                System.out.println(label + ": " + number);
            }
            else 
            {
                System.out.println("Inavlid text found");

            }
        }
    }


}
