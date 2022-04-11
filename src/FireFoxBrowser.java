import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //open URL
        driver.get(baseUrl);
        //print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is : " +title);
        //print the current URL
        String currenturl = driver.getCurrentUrl();
        System.out.println("Current URL = "  + currenturl);
        //print the source page
        String sourcepage = driver.getPageSource();
        System.out.println("The Page Source is: " +sourcepage);
        // Enter the email to email field
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("yogijimaharaj@gmail.com");
        // Enter the password to the password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234@##");

        driver.close();

    }
}
