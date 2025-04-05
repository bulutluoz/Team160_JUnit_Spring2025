package ders02_jUnitFramework_webTables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_FarkliKodlarlaOlusturulanWebTable {

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
        //  1. “https://testotomasyonu.com/webtables2” sayfasina gidin
        //  2. Headers da bulunan basliklari yazdirin
        //  3. 3.sutunun basligini yazdirin
        //  4. Tablodaki tum datalari yazdirin
        //  5. Tabloda kac tane cell (data) oldugunu yazdirin
        //  6. Tablodaki satir sayisini yazdirin
        //  7. Tablodaki sutun sayisini yazdirin
        //  8. Tablodaki 3.kolonu yazdirin
        //  9. Tabloda " Category" si Furniture olan urunun fiyatini yazdirin
        //10. Bir method olusturun, Test sayfasindan satir ve sutun verildiginde datayi yazdirsin
    }
}
