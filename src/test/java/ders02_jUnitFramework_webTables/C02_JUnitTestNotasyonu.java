package ders02_jUnitFramework_webTables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_JUnitTestNotasyonu {

    @Test
    public void test01(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu sayfasina gidin
        driver.get("https://www.testotomasyonu.com");


        // phone icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone" + Keys.ENTER);


        // arama sonucunda urun bulunabildigini test edin

        WebElement sonucyaziElementi = driver.findElement(By.className("product-count-text"));


        String actualAramaSonucYazisi = sonucyaziElementi.getText();
        String unExpectedSonucYazisi = "4 Products Found";

        Assertions.assertNotEquals(unExpectedSonucYazisi,actualAramaSonucYazisi,"Arama sonucunda urun bulunamadi");

        driver.quit();
    }
}
