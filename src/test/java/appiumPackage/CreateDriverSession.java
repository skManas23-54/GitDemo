package appiumPackage;

//import io.appium.java_client.AppiumBy;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public  class CreateDriverSession {
     public static AppiumDriver driver;
    public static void main(String[] args)throws MalformedURLException,InterruptedException{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_5");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability("avd","Pixel_5_API_33");
            caps.setCapability("avdLaunchTimeout",180000);
            String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator +"app"+File.separator+ "app-release-15.apk";
//        caps.setCapability("appPackage","com.floatr.personal");
//        caps.setCapability("appActivity","com.floatr.personal.MainActivity");
            caps.setCapability(MobileCapabilityType.APP, appUrl);
            URL url = new URL("http://0.0.0.0:4723");
             driver = new AndroidDriver(url, caps);
            System.out.println("session id: " + driver.getSessionId());

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            
        }

    }


