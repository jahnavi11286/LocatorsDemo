package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LocatorsDemo {
    @Test
    public void test(){
        System.out.println("HackerRank");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.id("input-1")).sendKeys("2000031423@kluniversity.in");
        driver.findElement(By.name("password")).sendKeys("janu");
            //driver.findElement(By.className("logo"));
        driver.findElement(By.linkText("Forgot your password?")).click();
}
}