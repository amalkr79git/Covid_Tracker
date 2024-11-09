package Testgroup.CovidTracker;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mainClasss { 

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	

		//Fetch url
		String url = "https://inerg-test.web.app/";
		driver.get(url);
		
		state.stateSelector(driver);
		//casesCount.caseCount(driver);
		chartData.dataFromChart(driver);


	}

}
