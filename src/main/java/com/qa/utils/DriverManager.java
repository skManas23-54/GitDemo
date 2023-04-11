package com.qa.utils;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    private static ThreadLocal<AppiumDriver>driver=new ThreadLocal<>();
    public AppiumDriver getDriver() {
        return driver.get();
    }
//this is clone from github
}
