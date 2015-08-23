import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Женя on 16.08.2015.
 */
public class Insta extends Actions {

    public Insta(WebDriver driver) {
        super();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().wait(5);
        driver.get("https://instagram.com/accounts/login/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        TypeUser(driver);
        ChangeInfo (driver);
        ChangePass (driver);
        Logout (driver);

    }
}

