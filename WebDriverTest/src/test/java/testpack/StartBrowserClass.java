package testpack;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverEngine;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by pixtart on 12/15/2016.
 */
public class StartBrowserClass {

    /***
     * Choose browser: FF - to start FireFox, CH - to start Chrome, IE - for internet explorer driver.
     * Default browser is FireFox.
     * Supported Firefox with version 45 and oldest
     * @param browser
     * @return
     */
    public static WebDriver startWebDriver(String browser){
        switch (browser){
            case "FF":
             /*   File file1 = new File("C:\\Users\\shepelevich\\IdeaProjects\\WebDriverTest\\src\\test\\java\\resources\\geckodriver.exe");
                System.setProperty("webdriver.gecko.driver",file1.getAbsolutePath());*/
                return new FirefoxDriver();

            case "CH":
                ChromeDriverService service = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File("C:\\Users\\shepelevich\\IdeaProjects\\WebDriverTest\\src\\test\\java\\resources\\chromedriver.exe"))
                        .usingAnyFreePort()

                        .build();
                return new ChromeDriver(service);
            case "IE":
                File file = new File("C:\\Users\\shepelevich\\IdeaProjects\\WebDriverTest\\src\\test\\java\\resources\\IEDriverServer.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
                capabilities.setCapability("nativeEvents", false);
                capabilities.setJavascriptEnabled(true);
                return new InternetExplorerDriver(capabilities);
            default:
                return new FirefoxDriver();
        }
    }
}
