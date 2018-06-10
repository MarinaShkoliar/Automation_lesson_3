

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class Category {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
        EventCapture eCapture = new EventCapture();
        eventHandler.register(eCapture);
        //eventHandler.findElement(By.id("email")).sendKeys("asdsadsa");
        eventHandler.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement fieldlogin = eventHandler.findElement(By.id("email"));
        fieldlogin.sendKeys("webinar.test@gmail.com");
        WebElement fieldpass = driver.findElement(By.id("passwd"));
        fieldpass.sendKeys("Xcg7299bnSmMuRLp9ITw");
        fieldpass.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//nav/ul/li[4]/a"))).build().perform();
        WebElement category = driver.findElement(By.xpath("//nav/ul/li[4]/ul/li[2]/a"));
        category.click();
        WebElement new_category = driver.findElement(By.className("process-icon-new"));
        new_category.click();
        WebElement fieldcategory = driver.findElement(By.xpath("//*[@id='name_1']"));
        fieldcategory.sendKeys("testcategory");
        fieldcategory.submit();
        WebElement goback = driver.findElement(By.xpath("//*[@id='desc-category-back']"));
        goback.click();
        WebElement filter = driver.findElement(By.xpath("(//*[@class='filter'])[2]"));
        filter.sendKeys("testcategory");
        filter.submit();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 350)");

    }
    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", Category.class.getResource("chromedriver.exe").getPath());
        return new ChromeDriver();
    }
}
