import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Weblab {

  public static FirefoxDriver driver;
  public static String Sucess_Message = "Overrides have been updated and will propagate within 15 minutes";


  public static void openingBrowser() {
    WebDriverManager.firefoxdriver().setup();
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--user-data-dir=C:\\Users\\manmzma\\AppData\\Local\\Mozilla\\Firefox\\Profiles\\g5qqzcpo.default-release-1");
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
  }

  public static void addCIDTreatmentT1(String Platform, String Pfm)
      throws AWTException, InterruptedException {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(Platform);
    System.out.println("Please enter midway details");
    driver.findElement(By.linkText("Assignment Overrides")).click();
    driver.findElement(By.xpath("//button[@data-testid='add-override-button']")).click();
    driver.findElement(By.xpath("//input[@class='css-1sq0sbt']")).sendKeys(Pfm);
    driver.findElement(By.xpath("(//div[@class='css-1a30v2j'])[1]")).click();
    Thread.sleep(2000);
    Robot robot = new Robot();
    Thread.sleep(2000);
    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    robot.keyPress(KeyEvent.VK_ENTER);
    driver.findElement(By.xpath("//span[normalize-space()='Save Changes']")).click();
    System.out.print("Weblab T1 will reflect after 15 minutes");
    driver.quit();
  }


  public static void addCIDTreatmentC(String Platform, String Pfm)
      throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(Platform);
    System.out.println("Please enter midway details");
    driver.findElement(By.linkText("Assignment Overrides")).click();
    driver.findElement(By.xpath("//button[@data-testid='add-override-button']")).click();
    driver.findElement(By.xpath("//input[@class='css-1sq0sbt']")).sendKeys(Pfm);
    driver.findElement(By.xpath("//span[normalize-space()='Save Changes']")).click();
    System.out.print("Sucessfully added weblab C will reflect after 15 minutes");
    Thread.sleep(5000);
    driver.quit();

  }
}
