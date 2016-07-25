package com.test.shoop.pages;
import com.test.shoop.config.AbstractDriver;
import org.openqa.selenium.support.PageFactory;
import com.test.shoop.pageobjects.MemberWalletPageObjects;
import static org.junit.Assert.assertTrue;

/**
 * Created by thadeus on 19/07/16.
 */
public class MemberWalletPage extends AbstractDriver {
    MemberWalletPageObjects wallet = new MemberWalletPageObjects();

    public MemberWalletPage() {
        PageFactory.initElements(driver,wallet);


    }
    public void validateMemberAvailableBalance(int availble_balance){
        waitForElementDisplay(wallet.availableBalance);
        String balance = wallet.availableBalance.getText().replaceAll("([A-Za-z\\s])\\w+","").trim();
        assertTrue(balance.equals(availble_balance));
        System.out.println(balance);

    }
    public void validateUserTransaction(){
        waitForElementDisplay(wallet.transaction);
        wallet.transaction.isDisplayed();
    }

    public void vaiidateUserMinimumCashBackForPayment(int min_topay){
        String minBalance=wallet.cashBackToPay.getText().replaceAll("([A-Za-z\\s])\\w+","").trim();
        assertTrue(minBalance.equals(min_topay));

    }

     public void validateCashWithDraw(){

     }



}
