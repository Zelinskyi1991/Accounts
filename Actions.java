import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Женя on 16.08.2015.
 */
public class Actions {
    private static WebDriver driver;


    public static void TypeUser(WebDriver driver) {


        // Login
        driver.findElement(By.id("lfFieldInputUsername")).sendKeys("AleksandraArgunova12");
        // Pass
        driver.findElement(By.id("lfFieldInputPassword")).sendKeys("ArgunovaGSYo");
        driver.findElement(By.xpath(".//*[@id='react-root']/div/div/div[2]/div/form/button")).click();
        System.err.println("Login & Pass valid \n");
    }

    public static void ChangeInfo (WebDriver driver) {
        driver.findElement(By.xpath(".//*[@id='react-root']/section/nav/div/div/a")).click();
        driver.findElement(By.xpath(".//*[@id='react-root']/section/main/article/header/div[2]/div[1]/a/button")).click();

        // First Name & Last Name
        driver.findElement(By.xpath(".//*[@id='first_name']")).clear();
        driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("Alexandra Baker");

        // Login & Pass Email
        driver.findElement(By.xpath(".//*[@id='username']")).clear();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("alexandra.baker22");
        driver.findElement(By.xpath(".//*[@id='email']")).getText();


        // Choose gendre
        WebElement selectgender = driver.findElement(By.id("gender"));
        selectgender.sendKeys("Female");
        System.out.println("Gendre choosed");

        // Bio
        driver.findElement(By.xpath(".//*[@id='biography']")).sendKeys("\uD83D\uDC8B BEAUTY MODEL \uD83D\uDC60 \uD83D\uDC8B\uD83D\uDC8B\uD83D\uDC8B -------- MEET ME HERE \uD83D\uDC47\uD83C\uDFFB\uD83D\uDC47\uD83C\uDFFB\uD83D\uDC47\uD83C\uDFFB");

        // Google url
        driver.findElement(By.xpath(".//*[@id='external_url']")).sendKeys("http://goo.gl/s3F7Ay");

        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/section/form/p[10]/input")).click();
        System.out.println ("All data changed");
    }

    public static void ChangePass (WebDriver driver){
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/nav/div/ul/li[2]/a")).click();

        //Old pass
        driver.findElement(By.xpath(".//*[@id='id_old_password']")).sendKeys("ArgunovaGSYo");

        //New pass
        driver.findElement(By.xpath(".//*[@id='id_new_password1']")).sendKeys("wwwwww");

        //Confirm new pass
        driver.findElement(By.xpath(".//*[@id='id_new_password2']")).sendKeys("wwwwww");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/section/form/p[4]/input")).click();
        System.out.println("Pass was changed");
    }


  



    public static void Logout(WebDriver driver) {
        driver.findElement(By.xpath(".//*[@id='rC1']/a")).click();
        teardown(driver);
    }

    protected static void teardown(WebDriver driver) {
        driver.close();
        System.out.println("Finished");

    }
}