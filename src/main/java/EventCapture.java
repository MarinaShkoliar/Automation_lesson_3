

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventCapture implements WebDriverEventListener {
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("Before AlertAccept "+ webDriver.getCurrentUrl());
    }

    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("After AlertAccept "+ webDriver.getCurrentUrl());
    }

    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("After AlertDismiss "+ webDriver.getCurrentUrl());
    }

    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("Before AlertDismiss "+ webDriver.getCurrentUrl());
    }

    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Before NavigateTo "+ webDriver.getCurrentUrl());
    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("afterNavigateTo "+ webDriver.getCurrentUrl());
    }

    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("Before NavigateBack "+ webDriver.getCurrentUrl());
    }

    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("After NavigateBack "+ webDriver.getCurrentUrl());
    }

    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("Before NavigateForward "+ webDriver.getCurrentUrl());
    }

    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("After NavigateForward "+ webDriver.getCurrentUrl());
    }

    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("Before FindBy "+ webDriver.getCurrentUrl());
    }

    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("After NavigateRefresh "+ webDriver.getCurrentUrl());
    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Before FindBy "+ webDriver.getCurrentUrl());
    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("After FindBy "+ webDriver.getCurrentUrl());
    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("beforeClickOn "+ webDriver.getCurrentUrl());
    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("afterClickOn "+ webDriver.getCurrentUrl());
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("beforeChangeValueOf "+ webDriver.getCurrentUrl());
    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("afterChangeValueOf "+ webDriver.getCurrentUrl());
    }

    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("beforeScript "+ webDriver.getCurrentUrl());
    }

    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("afterScript "+ webDriver.getCurrentUrl());
    }

    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("onException "+ webDriver.getCurrentUrl());
    }
}
