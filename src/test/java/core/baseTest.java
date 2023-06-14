package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class baseTest {

    public WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().to("https://sma.tecdiary.net/admin");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }
    @AfterMethod
    public void takeScreenshot(ITestResult result) {
        //take screen shot when testcase fail
        if(ITestResult.FAILURE == result.getStatus()){
            try {
                String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                //Tao tham chieu cua TakeScreenShot voi driver hien tai
                TakesScreenshot ts = (TakesScreenshot) driver;
                // Goi ham capture screenshoot - getScreenshotAs
                File source = ts.getScreenshotAs(OutputType.FILE);
                //Kiem tra folder ton tai khong. Neu chua co thi tao moi
                File theDir = new File("./ScreenShot/");
                if (!theDir.exists())
                    theDir.mkdirs();
                // gan ten cua testcase cho ten hinh
                FileHandler.copy(source, new File("./ScreenShot/" + result.getName()+ "-" + date + ".png"));
                System.out.println("Screenshot taken: " + result.getName());
            }catch (Exception e){
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }
    }
}
