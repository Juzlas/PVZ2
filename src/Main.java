import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Selenium/Driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("1. Padidino langą.");
        driver.get("https://ibpsapptest.vrm.lt/it-app/loginDev/Prokuroras50");
        System.out.println("2. Atidarė IBPS pradinį langą.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_3270\"]"))).click();
        System.out.println("3. Atidarė IT bylos langą.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_1024\"]"))).click();
        System.out.println("4. Atidarė proceso dalyvio langą.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_1786\"]"))).click();
        System.out.println("5. Paspaudė [Daugiau funkcijų] mygtuką.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_1788-a\"]"))).click();
        System.out.println("6. Paspaudė [Kurti EPP užduotį] mygtuką.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_1935\"]"))).click();
        System.out.println("7. Paspaudė [Atidaryti bylos dokumentų pasirinkimą] mygtuką.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_3093\"]"))).sendKeys("IBPS-S-2194-23");
        System.out.println("8. Paspaudė ant dokumento paieškos ir įvedė dokumento numerį 'IBPS-S-2194-23'.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_3281-real\"]"))).click();
        System.out.println("9. Pažymėjo dokumentą.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_3129\"]"))).click();
        System.out.println("10. Paspaudė [Susieti] mygtuką.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_451-real\"]"))).sendKeys("2023-12-12");
        System.out.println("11. Paspaudė ant datos pasirinkimo ir įvedė datą '2023-12-12'.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_458\"]"))).sendKeys("TEST");
        System.out.println("12. Paspaudė ant užduoties aprašymo lauko ir įvedė aprašymą 'TEST'.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_2837\"]\n"))).click();
        System.out.println("13. Paspaudė [Siųsti] mygtuką.");
        synchronized (driver){driver.wait(1000);}
        System.out.println("14. 1 s. palaukimas.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_229\"]"))).click();
        System.out.println("15. Peržiūrėjo išsiųstas EPP užduotys.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_231-close\"]"))).click();
        System.out.println("16. Uždarė išsiųstų EPP užduočių peržiūros langą.");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_152\"]"))).click();
        System.out.println("17. Atidarė pradiny IT bylos langą.");
    }
}