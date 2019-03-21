package ceshi.test01;
//

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestDemo {
    @Test
    public void openFireFoxTest(){
        System.setProperty("webdriver.firefox.bin","D:\\SeleniumTest\\drivers\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
    }
    @Test
    public void openIETest(){
        System.setProperty("webdriver.ie.driver","D:\\SeleniumTest\\drivers\\IEDriverServer.exe.exe");
    }
    @Test
    public void openChromeTest() throws InterruptedException {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumTest\\drivers\\chromedriver.exe");
        //实例化chromedriver
        WebDriver driver = new ChromeDriver();
        //打开百度首页
        driver.get("http://www.baidu.com");
        //等待5秒
        Thread.sleep(5000);
        //关闭当前窗口
        driver.quit();
    }

    /**
     * 打开Chrome浏览器
     * 打开百度首页
     * 等待3s
     * 后退
     * 等待3s
     * 关闭浏览器
     */
    @Test
    public void backTest() throws InterruptedException {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumTest\\drivers\\chromedriver.exe");
        //实例化chromedriver
        WebDriver driver = new ChromeDriver();
        //打开百度首页
        driver.get("http://www.baidu.com");
        //等待3秒
        Thread.sleep(3000);
        //后退
        driver.navigate().back();
        //等待3秒
        Thread.sleep(3000);
        //关闭当前窗口
        driver.quit();
    };

    /**浏览器刷新:driver.navigate().refresh();
     * 打开Chrome浏览器
     * 打开google首页
     * 等待3s
     * 刷新
     * 等待3s
     * 关闭浏览器
     */
    @Test
    public void refreshTest() throws InterruptedException {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumTest\\drivers\\chromedriver.exe");
        //实例化chromedriver
        WebDriver driver = new ChromeDriver();
        //打开百度首页
        driver.get("http://www.google.com.hk");
        //等待3秒
        Thread.sleep(3000);
        //刷新
        driver.navigate().refresh();
        //等待3秒
        Thread.sleep(3000);
        //关闭当前窗口
        driver.quit();
    };

    /**浏览器刷新:driver.navigate().refresh();
     * 打开Chrome浏览器
     * 设置窗口大小 300*300
     * 等待3s
     * 最大化窗口
     * 等待3s
     * 关闭浏览器
     */
    @Test
    public void winTest() throws InterruptedException {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumTest\\drivers\\chromedriver.exe");
        //实例化chromedriver
        WebDriver driver = new ChromeDriver();
        //实例化Dimension 设置窗口大小
        Dimension dimension = new Dimension(300,300);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        //最大化
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
    }




}
