import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracticeDemo {
    @Test
    public void practiceTesting(){
        System.setProperty("webdriver.chrome.driver", "/Users/salmasultana/IdeaProjects/LearningDemo/Driver/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.name("search_query"));

        driver.findElement(By.className("form-control")).click();
        driver.findElement(By.tagName("b")).click();
        driver.findElement(By.linkText("Women")).click();


       // driver.findElement(By.id("id_order")).sendKeys("xyz");


    }
}
