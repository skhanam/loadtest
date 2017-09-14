package com.test.shoop.pages;
import com.sun.media.jfxmedia.logging.Logger;
import com.test.shoop.pageobjects.UnregisteredEmailPageObjects;
import com.test.shoop.config.AbstractDriver;
import org.openqa.selenium.support.PageFactory;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by thadeus on 14/06/16.
 */
public class UnregisteredEmailPage extends AbstractDriver {
    UnregisteredEmailPageObjects unReg = new UnregisteredEmailPageObjects();
    private static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("InfoLogging");


  public UnregisteredEmailPage(){
      PageFactory.initElements(AbstractDriver.driver,unReg);
  }

    public void ClickOnRememberMeCheckBox(){
        waitForElementDisplay(unReg.rememberMe);
        unReg.rememberMe.click();

    }
    public void enterUnregisteredEmailAddressOnShoop(){
        waitForElementDisplay(unReg.userName);
        unReg.userName.sendKeys("quidcoqa2@quidco.com");
    }
    public void enterUserPasssword(){
        waitForElementDisplay(unReg.password);
        unReg.password.sendKeys("kalanzi09");
    }

    public void clickOnUnLoginButton(){
        waitForElementDisplay(unReg.loginButton);
        unReg.loginButton.click();
    }


    public void validateInvalidEmailPasswordISDisplayed(String invalid_info){
        waitForElementDisplay(unReg.incorrectlogindetails);
//        LOGGER.info(unReg.invalidemailPassword.getText());
        LOGGER.info(unReg.incorrectlogindetails.getText());
        assertTrue(unReg.incorrectlogindetails.getText().contains(invalid_info));

    }

}
