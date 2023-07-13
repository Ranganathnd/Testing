package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:/Users/ranga/OneDrive/Desktop/driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(5000);
driver.findElement(By.name("firstname")).sendKeys("ranganath");
driver.findElement(By.name("lastname")).sendKeys("ND");
driver.findElement(By.name("reg_email__")).sendKeys("123456789");
driver.findElement(By.id("password_step_input")).sendKeys("987654321");
WebElement date=driver.findElement(By.id("day"));
Select sel=new Select(date);
sel.selectByIndex(13);
WebElement mon=driver.findElement(By.id("month"));
Select sel1=new Select(mon);
sel1.selectByValue("5");
WebElement yr=driver.findElement(By.id("year"));
Select sel2=new Select(yr);
sel2.selectByVisibleText("1999");
WebElement male=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
male.click();
}
}
