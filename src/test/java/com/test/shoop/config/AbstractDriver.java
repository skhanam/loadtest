package com.test.shoop.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;





/**
 * Created by Thadeus ssewanyana on 18/03/2016.
 */
public abstract class AbstractDriver {

    public static WebDriver driver = null;
    public static Properties CONFIG=null;
    private  static final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private static final String systemArchitecture = System.getProperty("os.arch");
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    //chromebinaries
    public static final String  chromeWindowsdriver="/src/test/resources/WinbrowserBinaries/chromedriver.exe";
    public static final String  chromeCentosdriver="/src/test/resources/centosChromeDriverBinaries/chromedriver";
    public static final String  chromeLinuxdriver="/src/test/resources/linux/googlechrome/64bit/chromedriver";
    public static final String  chromeMacdriver="/src/test/resources/macChromedriver/chromedriver";

    public static void getEnvironmentInfo() throws IOException {
        LOGGER.info(("Current Operating System: " + operatingSystem));
        LOGGER.info("Current Architecture: " + systemArchitecture);
        LOGGER.info("Current Browser Selection: " + CONFIG.getProperty("Browser"));
    }

    public static void initialize() throws IOException {
        CONFIG = new Properties();
        LOGGER.info(System.getProperty("user.dir"));
        FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "/src/config.properties");
        CONFIG.load(fp);
        if (CONFIG.getProperty("Browser").equalsIgnoreCase("firefox")) {
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new FirefoxDriver(dc);
            Utility.setWindowMaximise(driver);

        } else {
            if (CONFIG.getProperty("Browser").equalsIgnoreCase("chrome")) {
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                if (operatingSystem.contains("WINDOWS")) {
                    System.setProperty("webdriver.chrome.driver", chromeWindowsdriver);
                } else if (operatingSystem.contains("MAC")) {
                    System.setProperty("webdriver.chrome.driver", chromeMacdriver);
                } else if (operatingSystem.contains("LINUX")) {
                    System.setProperty("webdriver.chrome.driver", chromeLinuxdriver);
                } else if (operatingSystem.contains("Centos")) {
                    System.setProperty("webdriver.chrome.driver", chromeCentosdriver);
                }
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chromeLinuxdriver);
                driver = new ChromeDriver(dc);
                System.out.println("here is the driver :"+driver);
                Utility.setWindowMaximise(driver);
            }
        }
    }

    public static void waitForElementDisplay(final WebElement element) throws ElementNotVisibleException{
        Wait<WebDriver> wait = new FluentWait<>(AbstractDriver.driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(input -> element.isDisplayed());
    }


    
}

