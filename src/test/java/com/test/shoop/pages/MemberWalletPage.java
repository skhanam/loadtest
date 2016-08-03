package com.test.shoop.pages;
import com.test.shoop.config.AbstractDriver;
import com.test.shoop.config.Utility;

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
<<<<<<< HEAD
<<<<<<< HEAD
    	Utility.scrollDownWindow(driver);
        waitForElementDisplay(wallet.transaction);
=======
=======
>>>>>>> refs/remotes/origin/toolbar


    	Utility.scrollDownWindow(driver);
    	waitForElementDisplay(wallet.transaction);
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/toolbar
=======
>>>>>>> refs/remotes/origin/toolbar
        wallet.transaction.isDisplayed();
    }

    public void vaiidateUserMinimumCashBackForPayment(int min_topay){
        String minBalance=wallet.cashBackToPay.getText().replaceAll("([A-Za-z\\s])\\w+","").trim();
        assertTrue(minBalance.equals(min_topay));

    }

<<<<<<< HEAD
<<<<<<< HEAD
     

=======
>>>>>>> refs/remotes/origin/toolbar
=======
>>>>>>> refs/remotes/origin/toolbar

}
