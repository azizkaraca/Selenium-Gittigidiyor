import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    MethodsPage methodsPage;
    String homePageUrl = "https://www.gittigidiyor.com/";

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        methodsPage = new MethodsPage(driver);
    }

    @AfterAll
    public void tearDown(){
        System.out.println("Test Finished.");
        driver.quit();
    }
}
