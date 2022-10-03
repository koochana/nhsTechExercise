/**
 * @preserve Copyright 2014 Zeno Yu <zeno.yu@gmail.com>.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *     * Redistributions of source code must retain the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package base;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseScenario {

  /** handle to the webdriver */
  protected static WebDriver driver = null;

  protected int secondsToWait = 1000;

  /**
   *  Get the driver with devices
   */
  public WebDriver getDriver() {
    if (null != driver) {
      return driver;
    }

    String browserName = (String)System.getProperty("browserName");

      if(browserName.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") + "/drivers/geckodriver");
        driver = new FirefoxDriver();
      }else if(browserName.equalsIgnoreCase("googlechrome")){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        driver=new ChromeDriver();
      }else {
        driver = new SafariDriver();
      }
    return driver;
  }

  /**
   * Get Site Url from command line -DsiteUrl
   */
  public String getSiteBaseUrl() {
    return (String)System.getProperty("siteUrl");
  }

  /**
   * Close Driver: delete all cookies for new session, tearDownClass() will handle closing the driver
   */
  public static void closeDriver() {
    if (null != driver) {
      driver.manage().deleteAllCookies();
      driver.close();
    }
  }
  /**
   * Quit Driver: tearDownClass() will handle closing the driver
   */
  public static void quitDriver() {
    if (null != driver) {
      driver.quit();
    }
  }

}
