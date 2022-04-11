import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        // print title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page : " +title);
        //print the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL = " +currentUrl);

        System.out.println("Current URL = " +driver.getCurrentUrl());
        //Print the page source
        String sourcepage = driver.getPageSource();
        System.out.println("The source page =" +sourcepage);
        //enter the email to email field
        WebElement email =  driver.findElement(By.id("username"));
        email.sendKeys("yogijimaharaj@gamil.com");
        // enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234@##");

        driver.close();







    }
}
