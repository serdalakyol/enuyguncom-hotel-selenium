import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReservationTests {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    void EnUygunReservationTests(){

        driver.get("https://www.enuygun.com/otel/");


        driver.findElement(By.xpath("//div[@class='row']//section[@class='sc-bkkeKt vppgX']/div[.='Şehir, ilçe, tema, otel adı ara']")).click();
        driver.findElement(By.cssSelector(".sc-hKwDye")).click();
        driver.findElement(By.cssSelector(".sc-hKwDye")).sendKeys("Fethiye");
        driver.findElement(By.xpath("//div[@class='react-autosuggest__section-container react-autosuggest__section-container--first']//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']/div[@class='sc-jRQBWg cbywrK']")).click();
        driver.findElement(By.id("date-picker-box")).click();
        driver.findElement(By.xpath("//div[@class='CalendarMonthGrid CalendarMonthGrid_1 CalendarMonthGrid__horizontal CalendarMonthGrid__horizontal_2']/div[@class='CalendarMonthGrid_month__horizontal CalendarMonthGrid_month__horizontal_1']//div[@class='sc-cidDSM epBRCo']")).click();
        driver.findElement(By.xpath("//div[@class='CalendarMonthGrid CalendarMonthGrid_1 CalendarMonthGrid__horizontal CalendarMonthGrid__horizontal_2']//td[@class='CalendarDay CalendarDay_1 CalendarDay__default CalendarDay__default_2 CalendarDay__lastDayOfWeek CalendarDay__lastDayOfWeek_3']/div[.='10']")).click();
        driver.findElement(By.xpath("//div[@class='row']//section[@class='sc-bkkeKt vppgX']/div[.='Konuk Sayısı2 Yetişkin']")).click();
        driver.findElement(By.cssSelector(".iKRZNq")).click();
        driver.findElement(By.cssSelector(".sc-llYSUQ")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.findElement(By.cssSelector(".filter_guest-rating_mukemmel-9-ve-uzeri")).click();
        driver.findElement(By.cssSelector(".filter_conditions_ucretsiz-iptal")).click();
        driver.get("https://www.enuygun.com/otel/crowne-plaza-antalya-44733/?request_id=2902904402e259a0036d46&funnelId=025128149574b7dff26d46&checkInDate=30.08.2023&checkOutDate=10.09.2023&rooms=2&autoRequest=1&country=TR&p=hotel_detail&ref=homepage");
        driver.findElement(By.cssSelector(".btn-booking")).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sc-llYSUQ")));
        element.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("//div[@class='offer__item offer__item--active']//button[@class='btn btn-success align-self-center']", element);



    }
    @AfterEach
    void thearDown(){
        driver.close();
    }

}









