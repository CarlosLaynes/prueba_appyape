package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class baseSetUp {

    public static AppiumDriver driver;

    public static void Android_setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName", "Xiaomi M2006C3LG");
        capabilities.setCapability("appPackage","com.booking");
        //capabilities.setCapability("appActivity","com.booking.appindex.presentation.activity.SearchActivity");
        capabilities.setCapability("app","C:\\Users\\99100229\\Documents\\prueba_yape\\prueba_appyape\\appcenter\\booking-com-32-9.apk");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}

