package ders02_jUnitFramework_webTables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_KlasikHtmlWebTable {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }

    @Test
    public void webTableTest(){

        //1."https://testotomasyonu.com/webtables" adresine gidin
        driver.get("https://testotomasyonu.com/webtables");

        //2. Web table tum body’sini yazdirin
        WebElement tumBodyElementi = driver.findElement(By.xpath("//tbody"));
        System.out.println("Tablodaki tum body : \n" + tumBodyElementi.getText());

        //3. Web tablosunda "Comfortable Gaming Chair" bulundugunu test edin

        String expectedTabloIcerik = "Comfortable Gaming Chair";
        String actualTumTabloYazilar = tumBodyElementi.getText();

        Assertions.assertTrue( actualTumTabloYazilar.contains(expectedTabloIcerik),"tabloda aranan urun yok"  );

        //4. Web table’daki satir sayisinin 5 oldugunu test edin

        List<WebElement> satirlarListesi = driver.findElements(By.xpath("//tbody/tr"));
        int expectedSatirSayisi = 5;
        int actualSatirSayisi = satirlarListesi.size();

        Assertions.assertEquals(expectedSatirSayisi,actualSatirSayisi);

        //5. Tum satirlari yazdirin
        System.out.println("=======================");

        for (WebElement each :satirlarListesi
             ) {
            System.out.println(each.getText());
        }

        // 3.satiri yazdirin
        System.out.println("tablodaki 3.satir : " + satirlarListesi.get(2).getText());


        //6. Web table’daki sutun sayisinin 4 olduğunu test edin
        //7. 3.sutunu yazdirin
        //8. Tablodaki basliklari yazdirin
        //9. Satir ve sutunu parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun
        //10. 4.satirdaki category degerinin "Furniture" oldugunu test edin

    }





}
