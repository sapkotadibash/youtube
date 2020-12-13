package YTautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utube {

	public static void main(String[] args) {
//		Automating youtube page with search button
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver youtube = new ChromeDriver ();
		
		String url = "https://www.youtube.com/";
		youtube.get(url);
		youtube.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait (youtube, 10);
		youtube.findElement(By.name("search_query")).sendKeys("I won it");
		youtube.findElement(By.id("search-icon-legacy")).click();
		youtube.findElement(By.xpath("///*[@id=\"video-title\"]/yt-formatted-string")).click();
	
// try again
		
		
		
	}

}
