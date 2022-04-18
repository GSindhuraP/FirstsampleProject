import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcases {

	public static void main(String[] args) {
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		wd.findElement(By.cssSelector("div>div:last-child>.btn.btn-primary.btn-lg")).click();
		System.out.println("Done");
		
	}

}
