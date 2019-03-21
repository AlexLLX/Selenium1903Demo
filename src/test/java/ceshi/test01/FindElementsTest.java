package ceshi.test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsTest {
    WebDriver driver;
    @BeforeMethod
    public void openChromeTest() throws InterruptedException {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTest\\drivers\\chromedriver.exe");
        //实例化chromedriver
        driver = new ChromeDriver();
    }
    /**
     * 打开百度页面
     * 通过ID定位搜索文本框
     */
    @Test
    public void byIDTest(){
        driver.get("http://www.baidu.com");
        WebElement keyField = driver.findElement(By.id("kw"));
    }

    /**
     * 打开百度页面
     * 通过name定位搜索文本框
     */
    @Test
    public void byNameTest(){
        driver.get("http://www.baidu.com");
        WebElement keyField = driver.findElement(By.name("wd"));
    }

    /**
     * 打开百度页面
     * 通过class属性定位搜索文本框
     */
    @Test
    public void byClassTest(){
        driver.get("http://www.baidu.com");
        WebElement keyField = driver.findElement(By.className("bg s_btn.btnhover"));
    }

    /**
     * 打开百度页面
     * 通过LinkText定位搜索文本框
     */
    @Test
    public void byLinkTextTest(){
        driver.get("http://www.baidu.com");
        WebElement keyField = driver.findElement(By.linkText("新闻"));
    }

    /**
     * 打开百度页面
     * 通过partialLinkText定位搜索文本框
     */
    @Test
    public void bypartialLinkText(){
        driver.get("http://www.baidu.com");
        WebElement keyField = driver.findElement(By.partialLinkText("新"));
    }

    /**
     * 打开百度页面
     * 通过tagname定位搜索文本框
     */
    @Test
    public void byTagName(){
        driver.get("http://www.baidu.com");
        List<WebElement> list= driver.findElements(By.tagName("input"));
        System.out.println(list.size());
    }

    /**
     * 打开百度页面
     * 通过XPath定位搜索文本框
     */
    @Test
    public void byXpath(){
        driver.get("http://www.baidu.com");
        WebElement e1 = driver.findElement(By.xpath(".//*[@id='su']"));
    }

    /**
     * 打开百度页面
     * 通过XPath定位搜索文本框
     */
    @Test
    public void byXpath02(){
        driver.get("http://www.baidu.com");
        List<WebElement> list = driver.findElements(By.xpath(".//*[@id='u1']/a"));

        for(int i=0;i<list.size();i++){
            String test = list.get(i).getText();
            System.out.println(test);
        }

    }

    /**
     * 打开百度页面
     * 通过cssSelector 百度图片
     */
    @Test
    public void byCssSelector(){
        driver.get("http://www.baidu.com");
        WebElement e1 = driver.findElement(By.cssSelector("#lg>map>area"));
    }

    @AfterMethod
    public void colsedBrowser(){
        driver.quit();
    }
}