import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MircoSoftEdge {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get(baseUrl);
        //print the title page
        String title = driver.getTitle();
        System.out.println("The title of the page: " + title);
        System.out.println("The title of the page is" + driver.getTitle());
        // print the current URL
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current URL = " + currenturl);
        //print the source page
        System.out.println("The source page is:"  +driver.getPageSource());
        // Enter the email to email field
       WebElement email = driver.findElement(By.id("username"));
       email.sendKeys("yogijimaharaj@gmail.com");
       // enter the password in the password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234@##");

        driver.close();

    }
}
