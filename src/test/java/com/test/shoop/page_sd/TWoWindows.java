package com.test.shoop.page_sd;
    import com.test.shoop.utility.ShoopChromeDriver;
    import org.junit.Before;
    import org.junit.Test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.support.FindBy;

    import java.util.Set;
    import java.util.concurrent.TimeUnit;

    /**
     * Created by sewadeus on 17/06/2016.
     */
    public class TWoWindows {

        private WebDriver driver;

        @Before
        public void SetUp() {
           /* System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\WinbrowserBinaries\\chromedriver.exe");
            driver = new ChromeDriver();*/
            driver= new FirefoxDriver();
            driver.get("https://www.shoop.fr/chausport/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }


        @Test
        public void getpageTitle(){
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("html/body/header/div[2]/div/div[1]/ul/li[2]/a/span/span")).click();
            WebElement userName=driver.findElement(By.name("username"));
            userName.sendKeys("t.ssewanyana@quidco.com");
            WebElement emailpassword =driver.findElement(By.xpath("//input[@type='password']"));
            emailpassword.sendKeys("kalanzi09");
            WebElement loginButton=driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
            loginButton.click();


            WebElement merchantCat = driver.findElement(By.cssSelector("#mode"));
            merchantCat.click();
            WebElement merchantRate= driver.findElement(By.cssSelector(".contents"));
            merchantRate.click();

            WebElement merchantUrl = driver.findElement(By.xpath("html/body/div[2]/div/div[5]/div/div[2]/div/div[3]/div/div[2]/a"));
            merchantUrl.click();




            //parent window handle
            String parent =driver.getWindowHandle();

            //  get handles for all windows
            Set<String> hand =driver.getWindowHandles();
            for (String alma:hand){
                if (!alma.equalsIgnoreCase(alma)){
                    //switch control to merchant window;
                    driver.switchTo().window(alma);


                }
            }
            System.out.println(driver.getTitle());
            driver.close();
            driver.switchTo().window(parent);
            System.out.println( driver.getTitle());
        }


    }







