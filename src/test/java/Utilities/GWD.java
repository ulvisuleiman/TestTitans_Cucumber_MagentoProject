package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // her bir thread için driver

    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // o thread e özel browser name

    //  threadDriver.get() -> bulunduğu hattaki driverı ver
    //  threadDriver.set(driver) -> bulunduğu hata driver set et

    // Her bir sürecin kendine özel STATİC driverı olmalı : Local Static diyeceğiz
    // süreç = Thread
    // Thread.Sleep => ilgili süreci durduryor belli süre
    // her bir Thread in kendine özel STATİC i olmalı, yani LOCAL Static

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN"); // Localin dilini İngilizceye uyumlu hale getirdik.

        if (threadBrowserName.get() == null) // XML kullanmadığımız zamanlar için bu if kullanılacak
            threadBrowserName.set("chrome"); // Default Chrome set edildi.

        if (threadDriver.get() == null) { // threadde driver yoksa 1 kez oluştururuz

            switch (threadBrowserName.get()) {

                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;// threade driver set ediyoruz;XML içşn kullanılacak
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    threadDriver.set(new ChromeDriver());
            }
            threadDriver.get().manage().window().maximize(); // ekranı maximize ediyoruz
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        return threadDriver.get();
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) { // driver var ise
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();  // threaddeki driverı çağırdık
            driver = null; // null yaptık
            threadDriver.set(driver); // thread driverı tekrar set ediyoruz
        }
    }
}
