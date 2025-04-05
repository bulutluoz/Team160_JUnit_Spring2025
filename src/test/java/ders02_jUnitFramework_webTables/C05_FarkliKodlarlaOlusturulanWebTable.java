package ders02_jUnitFramework_webTables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

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
        //  genel xPath ==>      //*[@role='trow'][3]//*[@role='tdata'][4]

        //  1. “https://testotomasyonu.com/webtables2” sayfasina gidin
        driver.get("https://www.testotomasyonu.com/webtables2");

        //  2. Headers da bulunan basliklari yazdirin
        List<WebElement> baslikElementleriList =
                driver.findElements(By.xpath("//*[@role='hrow']//*[@role='hdata']"));

        System.out.println(ReusableMethods.stringListeDonustur(baslikElementleriList));


        //  3. 3.sutunun basligini yazdirin



        //  4. Tablodaki tum datalari yazdirin
        //  5. Tabloda kac tane cell (data) oldugunu yazdirin
        //  6. Tablodaki satir sayisini yazdirin
        //  7. Tablodaki sutun sayisini yazdirin
        //  8. Tablodaki 3.kolonu yazdirin

        List<WebElement> ucuncuSutunElementleriList =
                driver.findElements(By.xpath("//*[@role='trow']//*[@role='tdata'][3]"));


        System.out.println(ReusableMethods.stringListeDonustur(ucuncuSutunElementleriList));


        //  9. Tabloda " Category" si Furniture olan urunun fiyatini yazdirin

        //10. Bir method olusturun, Test sayfasindan satir ve sutun verildiginde datayi yazdirsin

        System.out.println(getCellData(2, 3)); // $399.00


    }

    public String getCellData(int satirNo,int sutunNo){

        //     //*[@role='trow'][   3   ]//*[@role='tdata'][    4   ]

        String dinamikXPath = "//*[@role='trow'][" + satirNo + "]//*[@role='tdata'][" + sutunNo + "]";

        WebElement istenenCellElementi = driver.findElement(By.xpath(dinamikXPath));

        return istenenCellElementi.getText();
    }
}
