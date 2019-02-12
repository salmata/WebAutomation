import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellinumDemo {
    @Test
    public void testing(){
        System.setProperty("webdriver.chrome.driver", "/Users/salmasultana/IdeaProjects/SellinumDemo/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.id("contact-link")).click();


    }
}
