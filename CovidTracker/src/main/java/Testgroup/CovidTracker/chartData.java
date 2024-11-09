package Testgroup.CovidTracker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class chartData {

	public static void dataFromChart(WebDriver driver) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        
        WebElement element = driver.findElement(By.xpath("(//div[@class='plot-container plotly'])[2]/div/*[3]/*[5]"));

        actions.moveToElement(element).perform();
        Thread.sleep(5000);

        List<WebElement> cases = driver.findElements(By.xpath("(//div[@class='plot-container plotly'])[2]/div/*[3]/*[5]/*[1]/*[2]/*/*"));
        int c = 0;

        for (int i = 0; i < cases.size(); i++) {
            WebElement currentCase = cases.get(i);

            // Unselect all 
            String opacity = currentCase.getCssValue("opacity");
            c++;
            if (opacity.equals("1")) {
                currentCase.click(); 
                Thread.sleep(5000);
                System.out.println(c + "th element is unselected" );
            }
            else {
            	if (opacity.equals("0.5")) {
                    System.out.println(c + "th element is already uncelected");
                }
            }
        }

        for (int i = 0; i < cases.size(); i++) {
            WebElement currentCase = cases.get(i);

            String opacity = currentCase.getCssValue("opacity");
            if (!opacity.equals("1")) {
                currentCase.click(); 
                System.out.println("View chart");
                Thread.sleep(5000);
                currentCase.click();
                System.out.println("Selected value is deselected");
                Thread.sleep(5000); // Delay before selecting the next one
            }
        }
    }
}
